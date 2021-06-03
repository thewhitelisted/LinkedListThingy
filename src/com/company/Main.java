package com.company;

public class Main {
    static LinkedList newLinkedList = new LinkedList(new Node(5));
    public static void main(String[] args) {
	// this code isn't needed just shows examples of linked list
	newLinkedList.addValue(4);
	newLinkedList.addBeginValue(6);
        newLinkedList.printList();
        newLinkedList.contains(4);
    }
}
