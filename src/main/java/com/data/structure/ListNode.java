package com.data.structure;

import org.springframework.stereotype.Component;

@Component
public class ListNode {

	private int data;
	private ListNode next;
	
	//Constructor
	
	public ListNode() {
		
	}
	
	public ListNode(int data) {
		this.data = data;
	}

	// Getter and Setter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
