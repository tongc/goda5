package com.goda5.hagendaz.common.util;

import java.util.LinkedList;
import java.util.Queue;

import org.testng.annotations.Test;

class Node {
	private int value;
	Node left;
	Node right;
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

public class TreeTraversalTest {
	Queue<Node> values = new LinkedList<Node>();
	
	@Test
	public void t() {
		Node node1 = new Node();
		node1.setValue(1);
		
		Node node2 = new Node();
		node2.setValue(2);
		
		Node node3 = new Node();
		node3.setValue(3);
		
		Node node4 = new Node();
		node4.setValue(4);
		
		Node node5 = new Node();
		node5.setValue(5);
		
		Node node6 = new Node();
		node6.setValue(6);
		
		Node node7 = new Node();
		node7.setValue(7);
		
		Node node8 = new Node();
		node8.setValue(8);
		
		Node node9 = new Node();
		node9.setValue(9);
		
		Node node10 = new Node();
		node10.setValue(10);
		
		Node node11 = new Node();
		node11.setValue(11);
		
		Node node12 = new Node();
		node12.setValue(12);
		
		Node node13 = new Node();
		node13.setValue(13);
		
		Node node14 = new Node();
		node14.setValue(14);
		
		Node node15 = new Node();
		node15.setValue(15);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		node3.setLeft(node6);
		node3.setRight(node7);
		
		node4.setLeft(node8);
		node4.setRight(node9);
		
		node5.setLeft(node10);
		node5.setRight(node11);
		
		node6.setLeft(node12);
		node6.setRight(node13);
		
		node7.setLeft(node14);
		node7.setRight(node15);
		
		values.add(node1);
		p();
	}
	
	public void p() {
		while(!values.isEmpty()){
	        Node node = values.remove();
	        System.out.print(node.getValue() + " ");
	        if(node.left != null) values.add(node.left);
	        if(node.right != null) values.add(node.right);
	    }
	}
}
