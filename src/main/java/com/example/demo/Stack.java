package com.example.demo;

public class Stack {
    Node top;
    public Node peek(){
        if(top == null){
            return null;
        }
        return top;
    }

    public Node pop(){
        if(top == null){
            return null;
        } else {
            Node temp = new Node(top.val);
            top = top.next;
            return temp;
        }
    }

    public void push(Node n){
        if(n != null){
            n.next = top;
            top = n;
        }
    }
}
