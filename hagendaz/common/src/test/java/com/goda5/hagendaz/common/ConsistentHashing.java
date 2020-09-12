package com.goda5.hagendaz.common;

import com.google.common.collect.Maps;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.Map;

public class ConsistentHashing {
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

    private String[] values = new String[8192];
    private Map<Integer, Node> nodes = Maps.newHashMap();

    public Node nodeForKey(int key) {
        for (int i = key; i < 8191; i++) {
            if (nodes.containsKey(i)) {
                return nodes.get(i);
            }
        }
        for (int i = 0; i < key; i++) {
            if (nodes.containsKey(i)) {
                return nodes.get(i);
            }
        }
        return null;
    }

    public void addNode(Node node) {
        nodes.put(node.key, node);
    }

    public void removeNode(int nodeIdx) {
        nodes.remove(nodeIdx);
    }

    public void addKey(int key, String value) {
        values[key] = value;
    }

    public void removeKey(int key) {
        values[key] = null;
    }

    public int hash(String input) {
        HashFunction hashFunction = Hashing.md5();
        HashCode hashCode = hashFunction.hashBytes(input.getBytes());
        return Hashing.consistentHash(hashCode, 8192);
        //        int hash = 0;
//        for (Character each : input.toCharArray()) {
//            hash += each * 31;
//        }
//        return hash % 8192;
    }

    public static void main(String[] args) {
        ConsistentHashing ch = new ConsistentHashing();
        System.out.println(ch.hash("node1"));
        System.out.println(ch.hash("node2node"));
        System.out.println(ch.hash("node3ddff"));
        System.out.println(ch.hash("node4ggg"));
        System.out.println(ch.hash("node5eee"));


        Node node1 = ch.new Node(ch.hash("node1"));
        Node node2 = ch.new Node(ch.hash("node2node"));
        Node node3 = ch.new Node(ch.hash("node3ddff"));
        Node node4 = ch.new Node(ch.hash("node4ggg"));
        Node node5 = ch.new Node(ch.hash("node5eee"));

        ch.addNode(node1);
        ch.addNode(node2);
        ch.addNode(node3);
        ch.addNode(node4);
        ch.addNode(node5);

        ch.addKey(ch.hash("aba"), "val");
        ch.addKey(ch.hash("aba"), "val");
        ch.addKey(ch.hash("aab"), "val");
        ch.addKey(ch.hash("aab"), "val");
        ch.addKey(ch.hash("aabddfsadd"), "val");
        ch.addKey(ch.hash("aabddfsaddasdsadsdsadf"), "val");
        ch.addKey(ch.hash("a"), "val");
        ch.addKey(ch.hash("b"), "val");
        ch.addKey(ch.hash("c"), "val");
        ch.addKey(ch.hash("d"), "val");
        ch.addKey(ch.hash("e"), "val");
        ch.addKey(ch.hash("f"), "val");
        ch.addKey(ch.hash("g"), "val");
        ch.addKey(ch.hash("h"), "val");
        ch.addKey(ch.hash("i"), "val");
        ch.addKey(ch.hash("j"), "val");

        System.out.println(ch.nodeForKey(ch.hash("a")));
        System.out.println(ch.nodeForKey(ch.hash("b")));
        System.out.println(ch.nodeForKey(ch.hash("c")));
        System.out.println(ch.nodeForKey(ch.hash("d")));
        System.out.println(ch.nodeForKey(ch.hash("e")));
        System.out.println(ch.nodeForKey(ch.hash("f")));
        System.out.println(ch.nodeForKey(ch.hash("g")));
        System.out.println(ch.nodeForKey(ch.hash("h")));
        System.out.println(ch.nodeForKey(ch.hash("i")));
        System.out.println(ch.nodeForKey(ch.hash("j")));
        System.out.println(ch.nodeForKey(ch.hash("k")));
        System.out.println(ch.nodeForKey(ch.hash("l")));
        System.out.println(ch.nodeForKey(ch.hash("m")));
        System.out.println(ch.nodeForKey(ch.hash("o")));
        System.out.println(ch.nodeForKey(ch.hash("p")));
        System.out.println(ch.nodeForKey(ch.hash("q")));
        System.out.println(ch.nodeForKey(ch.hash("rrr")));
        System.out.println(ch.nodeForKey(ch.hash("23432")));
        System.out.println(ch.nodeForKey(ch.hash("fkdsdl")));

    }
}
