package com.company;

public class Main {
    static LinkedList newLinkedList = new LinkedList(new Node(5));
    public static void main(String[] args) {
		// this is just some arbitrary data that i put in
		newLinkedList.addValue(4);
        newLinkedList.printList();
        newLinkedList.contains(4);
    }
}
