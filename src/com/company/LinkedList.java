package com.company;

public class LinkedList {
    Node nodes;
    public LinkedList(Node nodes) {
        this.nodes = nodes;
    }
    public void addValue(int val) {
        this.nodes.appendNode(val);
    }
    public void addBeginValue(int val) {
        this.nodes.addBeginNode(val);
        this.nodes = this.nodes.previous;
    }
    public void printList() {
        this.nodes.printNodes();
    }
    public void contains(int val) {
        if (this.nodes.contains(val)) {
            System.out.println("\nFound value " + val);
        } else {
            System.out.println("\nCould not find value");
        }
    }
}
