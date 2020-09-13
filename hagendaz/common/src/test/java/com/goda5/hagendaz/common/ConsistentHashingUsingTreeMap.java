package com.goda5.hagendaz.common;

import com.google.common.collect.Maps;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class ConsistentHashingUsingTreeMap {
    HashFunction hashFunction = Hashing.md5();

    class Node {
        int key;

        public Node(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    '}';
        }
    }

    private TreeMap<Integer, Node> nodesRing = new TreeMap<>();

    public Node nodeForKey(int key) {
        SortedMap<Integer, Node> seekForwardForProcessingNode = nodesRing.tailMap(key);
        if (seekForwardForProcessingNode.isEmpty()) {
            return nodesRing.firstEntry().getValue();
        } else {
            return seekForwardForProcessingNode.get(seekForwardForProcessingNode.firstKey());
        }
    }

    public void addNode(Node node) {
        nodesRing.put(node.key, node);
    }

    public void removeNode(int nodeIdx) {
        nodesRing.remove(nodeIdx);
    }

    public int hash(String input) {
        HashCode hashCode = hashFunction.hashBytes(input.getBytes());
        return hashCode.asInt();
    }

    public static void main(String[] args) {
        ConsistentHashingUsingTreeMap ch = new ConsistentHashingUsingTreeMap();
        for(int i=0;i<16;i++) {
            Node node = ch.new Node(ch.hash("192.168.1." + i));
            ch.addNode(node);
        }

        Map<Node, Integer> distributionCount = Maps.newHashMap();
        for(int i=0;i<10000000;i++) {
            Node node = ch.nodeForKey(ch.hash(String.valueOf(ThreadLocalRandom.current().nextDouble())));
            if(distributionCount.containsKey(node)) {
                distributionCount.put(node, distributionCount.get(node) + 1);
            } else {
                distributionCount.put(node, 1);
            }
        }
        System.out.println(distributionCount);
    }
}
