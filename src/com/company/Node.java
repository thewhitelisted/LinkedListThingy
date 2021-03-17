package com.company;

public class Node {
    int val;
    Node next = null;
    Node previous = null;
    public Node(int val) {
        this.val = val;
    }
    public void appendNode(int val) {
        if (this.next == null) {
            this.next = new Node(val);
            this.next.previous = this;
        } else {
            this.next.appendNode(val);
        }
    }
    public void addBeginNode(int val) {
        if (this.previous == null) {
            this.previous = new Node(val);
            this.previous.next = this;
        } else {
            this.previous.addBeginNode(val);
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
