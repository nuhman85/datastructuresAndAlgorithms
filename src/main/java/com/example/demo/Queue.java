package com.example.demo;

public class Queue {
    Node first, last;

    public void enqueue(Node n){
        if(first == null){
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public Node dequeue(){
        if(first == null){
            return null;
        } else {
            Node temp = new Node(first.val);
            first = first.next;
            return temp;
        }
    }
}
