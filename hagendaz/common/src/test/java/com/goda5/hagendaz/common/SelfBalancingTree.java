package com.goda5.hagendaz.common;

import com.beust.jcommander.internal.Lists;
import org.jetbrains.annotations.Mutable;
import org.junit.Test;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.Comparator;
import java.util.List;

/**
 * Created by tong on 09/03/2016.
 */

@NotThreadSafe
public class SelfBalancingTree {
    @Test
    public void tree() {
        Node root = new Node(10);
        Node left = new Node(7);
        Node right = new Node(12);
        Node leftleft = new Node(3);
        Node leftleftright = new Node(6);
        root.setLeft(left);
        root.setRight(right);
        left.setLeft(leftleft);
        right.setLeft(new Node(11));
        leftleft.setRight(leftleftright);
        leftleftright.setLeft(new Node(5));

        System.out.println(root);

        List<Node> result = Lists.newArrayList();
        calculateLeafNodes(root, result);
        System.out.println(result);
        System.out.println(height(result.get(0)));

        Node root1 = new Node(10);
        root1.add(new Node(7)).add(new Node(12)).add(new Node(3)).add(new Node(6)).add(new Node(11)).add(new Node(5));
        result.clear();
        calculateLeafNodes(root, result);
        System.out.println(result);
        System.out.println(height(result.get(1)));

        System.out.println(needRebalance(root));

        System.out.println("after left rotation " + rotateByOne(root, true));
        System.out.println("after right rotation " + rotateByOne(root, false));
    }

    private boolean needRebalance(Node node) {
        List<Node> leftTreeLeafNodes = calculateLeafNodes(node.getLeft(), Lists.newArrayList());
        List<Node> rightTreeLeafNodes = calculateLeafNodes(node.getRight(), Lists.newArrayList());
        Node nodeLeft = leftTreeLeafNodes.stream().max(Comparator.comparingInt(this::height)).get();
        Node nodeRight = rightTreeLeafNodes.stream().max(Comparator.comparingInt(this::height)).get();
        System.out.println(nodeLeft);
        System.out.println(nodeRight);
        return Math.abs(height(nodeLeft) - height(nodeRight)) > 1;
    }

    private void rebalance(Node node) {

    }

    private Node rotateByOne(Node root, boolean rotateToLeft) {
        Node newRoot;
        if(rotateToLeft) {
            newRoot = root.getRight();
            root.setRight(null);
            Node newRootLeft = newRoot.getLeft();
            newRoot.setLeft(root);
//            newRoot.add(newRootLeft);
        } else {
            newRoot = root.getLeft();
            root.setLeft(null);
            Node newRootRight = newRoot.getRight();
            newRoot.setRight(root);
//            newRoot.add(newRootRight);
        }
        return newRoot;
    }

    private List<Node> calculateLeafNodes(Node node, List<Node> leafNodes) {
        if(node.getLeft() == null && node.getRight() == null) {
            leafNodes.add(node);
            return leafNodes;
        }
        if(node.getLeft() != null) {
            calculateLeafNodes(node.getLeft(), leafNodes);
        }
        if(node.getRight() != null) {
            calculateLeafNodes(node.getRight(), leafNodes);
        }
        return leafNodes;
    }

    private int height(Node node) {
        if(node.getParent() != null) {
            return height(node.getParent()) + 1;
        } else {
            return 0;
        }
    }
}

class Node {
    @Mutable
    private volatile int val;
    @Mutable
    private volatile Node left;
    @Mutable
    private volatile Node right;
    @Mutable
    private volatile Node parent;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node(int val) {
        this.val = val;
    }

    public Node add(Node node) {
        if(val == node.getVal()) {
            throw new UnsupportedOperationException("this is a treeset, no duplicate value allowed");
        }
        if(node.getVal() < val) {
            left = node;
        } else {
            right = node;
        }
        return this;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
        if(left != null) {
            left.setParent(this);
        }
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
        if(right != null) {
            right.setParent(this);
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
