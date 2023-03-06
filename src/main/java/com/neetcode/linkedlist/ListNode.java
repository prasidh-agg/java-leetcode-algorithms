package com.neetcode.linkedlist;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static StringBuilder printLinkedList(ListNode head){
        StringBuilder print = new StringBuilder();
        while(head != null){
            print.append(head.val).append("->");
            head = head.next;
        }
        print.append("null");
        return print;
    }
}