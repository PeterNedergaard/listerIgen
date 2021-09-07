package com.company;

public class Liste {

    Node head = null;
    Node tail = null;

    public Node insertNodeFromHead(String data){

        Node n = new Node(data);

        if (head == null){
            head = n;
            tail = n;

            return n;
        }

        head.previous = n;
        n.next = head;
        head = n;

        return n;
    }

}
