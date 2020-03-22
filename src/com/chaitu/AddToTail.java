package com.chaitu;

import com.chaitu.SinglyLinkedListNode;

public class AddToTail {

    public static void main(String[] args) {
        SinglyLinkedListNode head= new SinglyLinkedListNode(1);
        head. next = new SinglyLinkedListNode(2);
        head.next.next = new SinglyLinkedListNode(3);
        addToTail(head,4);
    }

    private static void addToTail(SinglyLinkedListNode head,int data) {
        SinglyLinkedListNode node = head;
        System.out.println(head.data);
        //if (head == null) return null;
        while(head.next!=null){
            head = head.next;
        }
        head.next= new SinglyLinkedListNode(data);
        System.out.println(head.next.data);
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    }

