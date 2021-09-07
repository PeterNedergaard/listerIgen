package com.company;

public class Liste {

    Node head = null;
    Node tail = null;


    public boolean isEmpty(){

        if (head == null){
            return true;
        } else
        {
            return false;
        }

    }


    public Node insertNodeFromHead(String data){

        Node n = new Node(data);

        if (isEmpty()){
            head = n;
            tail = n;

            return head;
        }

        head.previous = n;
        n.next = head;
        head = n;

        return head;
    }

    public String printFromHead() {

        String res = "";
        Node node = head;

        while(node != null){
            res += node.data;

            node = node.next;
        }

        return res;
    }

    public Node insertNodeFromTail(String s) {

        Node node = new Node(s);

        if (head == null){
            head = node;
            tail = node;

            return tail;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;

        return tail;
    }

    public String printFromTail() {

        String res = "";

        Node node = tail;

        while (node != null){
            res += node.data;

            node = node.previous;
        }

        return res;
    }
}
