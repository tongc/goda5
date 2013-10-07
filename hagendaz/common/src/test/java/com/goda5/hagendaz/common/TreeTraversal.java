package com.goda5.hagendaz.common;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TreeTraversal {

	class Node {
		public Node(int value) {
			this.value = value;
		}
		Node left;
		Node right;
		int value;
	}
	
	public Node t() {
		Node root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(7);
		root.left = left;
		root.right = right;
		
		Node leftl = new Node(1);
		Node right1 = new Node(4);
		left.left = leftl;
		left.right = right1;
		
		Node left2 = new Node(6);
		Node right2 = new Node(8);
		right.left = left2;
		right.right = right2;
		return root;
	}
	
	public void tranv(List<Node> list) {
		List<Node> newList = new ArrayList<Node>();
		if(list.size()==0) {
			return;
		}
		for(Node node:list) {
			System.out.println(node.value);
			if(node.left!=null) {
				newList.add(node.left);
			}
			if(node.right!=null) {
				newList.add(node.right);
			}
		}
		tranv(newList);
	}
	
	@Test
	public void test() {
		final TreeTraversal t = new TreeTraversal();
		t.tranv(new ArrayList(){{add(t.t());}});
	}
}
