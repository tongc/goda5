package com.goda5.hagendaz.common;


/**
 *
 * # # # # #
 * # @ @ @ #
 * # # # # #
 *
 * @author tonchen
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 */

class Plot {
	Node[] nodes = new Node[36];
	int size = Double.valueOf(Math.sqrt(Integer.valueOf(nodes.length).doubleValue())).intValue();
}

class Node {

	private Plot plot;

	public int xyToSeq(int x, int y, int size) {
		return size*y+x;
	}

	public Node(Plot plot, int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.plot = plot;
		this.plot.nodes[xyToSeq(x, y, plot.size)] = this;
	}

	int x;
	int y;
	Node[] neighbours = new Node[8];

	public void addNeighbour(int index, Node node) {
		neighbours[index] = node;
	}

	public void process(Plot plot) {
		for(int i = 0; i<plot.nodes.length;i++) {
			if(plot.nodes[i]==null) {
				if(neighbourCount(plot, i)==3) {
					Node node = new Node(plot, i, i);

				}
			} else {
				switch(plot.nodes[i].neighbours.length) {
				case 2: processNothing(plot.nodes[i]); break;
				case 3: processNothing(plot.nodes[i]); break;
				default: processRemove(plot.nodes[i]); break;
				}
			}
		}
	}

	private int neighbourCount(Plot plot, int index) {
		return oneOrZero(plot, index - (plot.size + 1)) +
		oneOrZero(plot, index - plot.size) +
		oneOrZero(plot, index - (plot.size - 1)) +
		oneOrZero(plot, index - 1) +
		oneOrZero(plot, index + 1) +
		oneOrZero(plot, index + (plot.size -1)) +
		oneOrZero(plot, index + plot.size) +
		oneOrZero(plot, index + (plot.size + 1));
	}

	private int oneOrZero(Plot plot, int index) {
		if(plot.size <= index) {
			return 0;
		} else {
			if(plot.nodes[index]!=null) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private void processReproduce(Node node) {

	}

	private void processRemove(Node node) {
		plot.nodes[xyToSeq(node.x, node.y, plot.size)] = null;
	}

	private void processNothing(Node node) {
		//do nothing
	}

}

public class GameOfLifeTest {
	public void testThreeNodes() {
		Plot plot = new Plot();
		Node n1 = new Node(plot, 1, 1);
		Node n2 = new Node(plot, 2, 1);
		Node n3 = new Node(plot, 3, 1);

		n1.addNeighbour(5, n2);
		n2.addNeighbour(4, n1);
		n2.addNeighbour(5, n3);
		n3.addNeighbour(4, n2);


	}
}
