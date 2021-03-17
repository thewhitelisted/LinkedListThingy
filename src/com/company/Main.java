package com.company;

public class Main {
    static LinkedList newLinkedList = new LinkedList(new Node(5));
    public static void main(String[] args) {
	    newLinkedList.addValue(4);
	    newLinkedList.addBeginValue(6);
        newLinkedList.printList();
        newLinkedList.contains(4);
    }
}
