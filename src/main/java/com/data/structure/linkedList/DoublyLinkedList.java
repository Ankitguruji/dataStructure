package com.data.structure.linkedList;

import java.util.ArrayList;
import java.util.List;
import com.data.structure.DoubleListNode;

public class DoublyLinkedList {

	// Traverse LinkedList and calculate length as well- Completed
	public static int ListLength(DoubleListNode headNode) {
		int length = 1;
		DoubleListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			System.out.println("Length is " + length);
			currentNode = currentNode.getNextNode();
			System.out.println("Length is " + length);
		}
		return length;
	}

	// Traverse LinkedList to find header - completed
	public static DoubleListNode findHeader(DoubleListNode currentNode) {
		System.out.println("current node value is " + currentNode.getData());
		DoubleListNode headerNode = currentNode;
		while (headerNode.getPrevNode() != null) {
			headerNode = headerNode.getPrevNode();
			System.out.println("current node value is " + headerNode.getData());
		}
		System.out.println("header node value is " + headerNode.getData());
		return headerNode;
	}

	// Inserting node at the front of doubly linked list - Completed
	public static void addNodeAtTheFront(DoubleListNode givenDoubleLLNode, int new_data) {

		DoubleListNode headerDoubleNode = findHeader(givenDoubleLLNode);
		DoubleListNode tempNode = headerDoubleNode;

		headerDoubleNode.setNextNode(tempNode);
		tempNode.setPrevNode(headerDoubleNode);

		headerDoubleNode.setData(new_data);
		headerDoubleNode.setPrevNode(null);

		System.out.println("New header node us " + headerDoubleNode.getData());

	}

	// Inserting node at the end of doubly linked list - Completed
	public static DoubleListNode addNodeAtTheEnd(DoubleListNode currentNode, int new_data) {
		DoubleListNode newNode = new DoubleListNode(new_data);
		newNode.setNextNode(null);
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		newNode.setNextNode(null);
		currentNode.setNextNode(newNode);
		newNode.setPrevNode(currentNode);
		return newNode;
	}

	public static void main(String[] args) {

		try {
			DoubleListNode finalDoubleNode = new DoubleListNode();
			ArrayList<Integer> testList = new ArrayList<Integer>();
			testList.add(4);
			testList.add(9);
			testList.add(11);
			testList.add(13);
			finalDoubleNode = addNode(testList);

			/*
			 * // Method to add node at the end finalDoubleNode =
			 * addNodeAtTheEnd(finalDoubleNode, 27);
			 * System.out.println("Doubly Linked list data added at last " + 27);
			 */

			/*
			 * // Method to traverse node till header finalDoubleNode =
			 * findHeader(finalDoubleNode);
			 * System.out.println("Doubly List traversed to header with node data as " +
			 * finalDoubleNode.getData());
			 */

			// Method to add node at the start
			addNodeAtTheFront(finalDoubleNode, 29);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method to create a doubly linked list
	public static DoubleListNode addNode(List<Integer> nodeValues) {
		DoubleListNode head = null;
		DoubleListNode newNode = null;
		int counter = 0;

		for (int data : nodeValues) {
			new DoubleListNode(data);
			if (head == null) {
				counter++;
				head = new DoubleListNode(data);
				head.setNextNode(null);
				System.out.println("Doubly Lisked list header " + counter + " node added " + data);

			} else {
				counter++;
				newNode = new DoubleListNode(data);
				head.setNextNode(newNode);
				newNode.setPrevNode(head);
				newNode.setNextNode(null);
				head = head.getNextNode();
				System.out.println("Doubly Lisked list " + counter + " node added " + data);
			}
		}
		System.out.println("Doubly Lisked list created \n ");
		return newNode;
	}

}
