package com.data.structure.linkedList;

import com.data.structure.ListNode;

public class SinglyCircularLinkedList {

	// Traverse & Print and calculate the length if circular linked list
	public int CircularListLength(ListNode tail) {

		int length = 0;
		ListNode currentNode = tail.getNext();
		while (currentNode != tail) {
			length++;
			System.out.println("Printing node value => " + currentNode.getData());
			currentNode = tail.getNext();
		}
		return length;
	}

	// Inserting node at the end of circular linked list
	public void addNodeAtTheEnd(ListNode tail, int new_data) {
		ListNode newNode = new ListNode(new_data);
		tail = newNode.getNext();
		ListNode currentNode = tail.getNext();
		while (currentNode.getNext() != tail) {
			System.out.println("Printing current node value => " + currentNode.getData());
			currentNode = tail.getNext();
		}
		newNode = currentNode;
	}

	// Inserting node at the front of circular linked list
	public void addNodeAtTheFront(ListNode tail, int new_data) {
		ListNode newNode = new ListNode(new_data);
		tail = newNode.getNext();
		ListNode currentNode = tail.getNext();
		while (currentNode.getNext() != tail) {
			System.out.println("Printing current node value => " + currentNode.getData());
			currentNode = currentNode.getNext();
		}
		newNode = currentNode.getNext();
	}

	// Deleting last node from circular linked list
	public void deleteNodefromLast(ListNode tail) {
		ListNode currentNode = tail.getNext();
		ListNode prevNode = new ListNode();
		while (currentNode.getNext() != tail) {
			System.out.println("Printing current node value => " + currentNode.getData());
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		tail = prevNode.getNext();
	}

	// Deleting last node from circular linked list
	public void deleteNodeFromFront(ListNode tail){
		ListNode newTail = tail.getNext();
		ListNode currentNode = tail.getNext();
		while (currentNode.getNext() != tail) {
			System.out.println("Printing current node value => " + currentNode.getData());
			currentNode = currentNode.getNext();
		}
		newTail = currentNode.getNext();
	}

}
