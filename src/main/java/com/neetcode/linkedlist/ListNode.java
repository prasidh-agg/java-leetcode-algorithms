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

    public static String printLinkedList(ListNode head){
        if (head == null) {
            return "";
        }

        StringBuilder print = new StringBuilder();
        while (head != null) {
            print.append(head.val);
            if (head.next != null) {
                print.append(" --> ");
            }
            head = head.next;
        }

        return print.toString();
    }

    public static ListNode buildLinkedList(int[] vals){

        ListNode head = new ListNode(vals[0]);
        ListNode curr = head;
        for(int i = 1; i < vals.length; i++){
            curr.next = new ListNode(vals[i]);
            curr = curr.next;
        }
        return head;
    }

    public static ListNode buildLinkedListWithCycle(int[] vals, int index) {
        if (vals == null || vals.length == 0 || index < 0 || index >= vals.length) {
            return null;
        }

        ListNode head = new ListNode(vals[0]);
        ListNode curr = head;
        ListNode cycleStart = null;

        for (int i = 1; i < vals.length; i++) {
            curr.next = new ListNode(vals[i]);
            curr = curr.next;

            if (i == index) {
                cycleStart = curr;
            }
        }
        curr.next = cycleStart;
        return head;
    }

}