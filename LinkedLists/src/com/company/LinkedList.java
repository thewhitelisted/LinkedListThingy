package com.company;

public class LinkedList {
    // constructor and variables and shit
    Node nodes;
    public LinkedList(Node nodes) {
        this.nodes = nodes;
    }
    
    // these functions refer to the node functions, easier readability
    public void addValue(int val) {
        this.nodes.addNode(val);
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
