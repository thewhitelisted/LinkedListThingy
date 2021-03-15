package com.company;

public class Node {
    // contructor and variables
    int val;
    Node next = null;
    public Node(int val) {
        this.val = val;
    }
    
    // appends node to end of list, need to change to append
    public void addNode(int val) {
        if (this.next == null) {
            this.next = new Node(val);
        } else {
            addNode(val);
        }
    }
    // prints out the values of all nodes recursively
    public void printNodes() {
        if (this.next == null) {
            System.out.print(this.val);
        } else {
            System.out.print(this.val + " ");
            this.next.printNodes();
        }
    }
    // checks if value is in list
    public boolean contains(int val) {
        if (this.val == val) {
            return true;
        } else {
            if (this.next == null) {
                return false;
            } else {
                return this.next.contains(val);
            }
        }
    }
}
