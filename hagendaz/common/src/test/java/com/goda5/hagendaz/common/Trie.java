package com.goda5.hagendaz.common;


import com.google.common.collect.Maps;

import java.util.Map;

public class Trie {
    class Node {
        Map<Character, Node> children = Maps.newHashMap();
        boolean end = false;
    }

    public void add(String newWord, Node root) {
        if(newWord.length() == 0) {
            return;
        }
        Character rootChar = newWord.charAt(0);
        if (root.children.containsKey(rootChar)) {
            String nextWord = newWord.substring(1);
            if(nextWord.length() == 0) {
                root.children.get(rootChar).end = true;
            } else {
                add(nextWord, root.children.get(rootChar));
            }
        } else {
            Node newRoot = new Node();
            root.children.put(rootChar, newRoot);
            String nextWord = newWord.substring(1);
            if(nextWord.length() != 0) {
                add(nextWord, newRoot);
            } else {
                newRoot.end = true;
            }
        }
    }

    public void remove(String word, Node root) {
        if(word.length() == 0) {
            return;
        }
        Character rootChar = word.charAt(0);
        if(root.children.containsKey(rootChar)) {
            String nextWord = word.substring(1);
            if(nextWord.length() == 0) {
                if(root.children.size() == 1) {
                    if (root.children.get(rootChar).children.size() == 0) {
                        root.children.remove(rootChar);
                    }
                }
                root.children.get(rootChar).end = false;
            } else {
                remove(nextWord, root.children.get(rootChar));
            }
        }
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
        new Trie().add("abeee", root);
        new Trie().add("bcc", root);
        new Trie().add("bde", root);
        new Trie().add("defff", root);
        new Trie().add("ty", root);
        new Trie().add("ab", root);
        new Trie().add("uixfrw", root);
        new Trie().print(root);

        new Trie().remove("ab", root);
        new Trie().print(root);
    }
}
