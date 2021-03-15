package com.company;

public class Node {
    int val;
    Node next = null;
    public Node(int val) {
        this.val = val;
    }
    public void addNode(int val) {
        if (this.next == null) {
            this.next = new Node(val);
        } else {
            addNode(val);
        }
    }
    public void printNodes() {
        if (this.next == null) {
            System.out.print(this.val);
        } else {
            System.out.print(this.val + " ");
            this.next.printNodes();
        }
    }
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