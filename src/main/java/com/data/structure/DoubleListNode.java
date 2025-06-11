package com.data.structure;

public class DoubleListNode {

	private int data;
	private DoubleListNode nextNode;
	private DoubleListNode prevNode;

	public DoubleListNode(int data) {
		this.data = data;
	}

	public DoubleListNode() {

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleListNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleListNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoubleListNode prevNode) {
		this.prevNode = prevNode;
	}

}
