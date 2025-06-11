package com.data.structure.linkedList;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.structure.ListNode;

public class SinglyLinkedList {

	private static int data = 2;

	@Autowired
	static ListNode lastNode;

	@Autowired
	static ListNode currentNode;

	// Traverse LinkedList and calculate length as well
	public static int ListLength(ListNode headNode) {
		int length = 1;
		ListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
			System.out.println("Length is " + length);
		}
		return length;
	}

	// Adding node at the beginning
	public static void addNodeAtBegin(ListNode newNode) {
		ListNode currentNode = newNode;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			// System.out.println("Length is " + length);
		}
	}

	// Adding node between
	public static void addNodeAtBegin(ListNode prev_node, int new_data) {

		if (prev_node != null) {
			System.out.println("prev_node can not be null");
			return;
		}
		ListNode new_node = new ListNode(new_data);
		new_node.setNext(prev_node.getNext());
		prev_node.setNext(new_node);
	}

	// Adding node at the end
	public static void addNodeAtEnd(ListNode end_node, int new_data) {

		if (end_node != null && end_node.getNext() == null) {
			System.out.println("prev_node can not be null");
			return;
		}
		ListNode new_node = new ListNode(new_data);
		end_node.setNext(new_node);
		new_node.setNext(null);
	}

	// Create new Linked List
	public static ListNode createLinkedList() {
		int length = 1;
		int intervalData = 6;
		// int data = 0;
		while (length <= 4) {
			length++;
			data = data + intervalData;
			// currentNode.setData(data);
			currentNode = new ListNode(data);
			try {
				lastNode = currentNode;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentNode = currentNode.getNext();
			System.out.println("Data added " + data);
		}
		lastNode.setNext(null);
		System.out.println(lastNode.toString().length());
		return lastNode;
	}

	/*
	 * public static void main(String[] args) { ListNode testNode = new ListNode(5);
	 * ListNode testNode1 = testNode.getNext(); testNode1 = new ListNode(6);
	 * 
	 * try { int count = ListLength(testNode); System.out.println("Final Length is "
	 * + count); } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */

	public static void main(String[] args) {

		try {
			ListNode finalNode = createLinkedList();
			System.out.println("Final list is " + finalNode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
