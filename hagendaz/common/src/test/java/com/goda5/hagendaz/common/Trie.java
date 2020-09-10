package com.goda5.hagendaz.common;


import com.google.common.collect.Maps;

import java.util.Map;

public class Trie {
    class Node {
        Map<Character, Node> children = Maps.newHashMap();
        boolean end = true;
    }

    public void add(String newWord, Node root) {
        if (newWord.length() == 0) {
            return;
        }
        Character rootChar = newWord.charAt(0);
        if (root.children.containsKey(rootChar)) {
            add(newWord.substring(1), root.children.get(rootChar));
        } else {
            Node newRoot = new Node();
            root.end = false;
            root.children.put(rootChar, newRoot);
            add(newWord.substring(1), newRoot);
        }
    }

    public void remove(String word, Node root) {

    }

    public void search(String word, Node root) {

    }

    public void print(Node root) {
        root.children.forEach((key, value) -> {
            System.out.println(key);
            print(value);
        });
    }

    public static void main(String[] args) {
        Node root = new Trie().new Node();
        new Trie().add("abc", root);
        new Trie().add("abb", root);
        new Trie().add("abe", root);
        new Trie().add("bcc", root);
        new Trie().add("bde", root);
        new Trie().add("defff", root);
        new Trie().add("ty", root);
        new Trie().add("uixfrw", root);
        new Trie().print(root);
    }
}
