package com.goda5.hagendaz.common;

import static com.goda5.hagendaz.common.BSTTree.RotationType.LEFT;
import static com.goda5.hagendaz.common.BSTTree.RotationType.RIGHT;

public class BSTTree {
    enum RotationType {
        LEFT,
        RIGHT;
    }
    class Node {
        public Node(int val) {
            this.val = val;
        }
        private int val;
        private Node left;
        private Node right;
        private Node parent;

        public void setLeft(Node left) {
            this.left = left;
            this.left.parent = this;
        }

        public void setRight(Node right) {
            this.right = right;
            this.right.parent = this;
        }
    }

    private void rotate(Node node, RotationType rotationType) {
        if(rotationType == LEFT && node.left != null && node.left.left != null) {
            Node parent = node.parent;
            Node left = node.left;
            parent.setLeft(left);
            node.left = null;
            left.setRight(node);
        }
        if(rotationType == RIGHT && node.right != null && node.right.right != null) {
            Node parent = node.parent;
            Node right = node.right;
            parent.setRight(right);
            node.right = null;
            right.setLeft(node);
        }
    }

    private void add(Node parent, int val) {
        if(val > parent.val) {
            if(parent.right == null) {
                parent.setRight(new Node(val));
            } else {
                add(parent.right, val);
            }
        }
        if(val < parent.val) {
            if(parent.left == null) {
                parent.setLeft(new Node(val));
            } else {
                add(parent.left, val);
            }
        }
    }

    public static void main(String[] args) {
        BSTTree bstTree = new BSTTree();
        Node root = bstTree.new Node(10);
        bstTree.add(root, 1);
        bstTree.add(root, 2);
        bstTree.add(root, 3);
        bstTree.add(root, 4);
        bstTree.add(root, 5);
        bstTree.add(root, 6);
        bstTree.add(root, 7);
        bstTree.add(root, 8);
        bstTree.add(root, 9);
        bstTree.add(root, 11);

        bstTree.rotate(root.left.right.right.right.right.right.right, RIGHT);
        System.out.println(root);
    }
}
