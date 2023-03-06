package com.neetcode.linkedlist;


public class ReverseList {

    public static ListNode reverseALinkedListIterative(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static ListNode reverseLinkedListRecursive(ListNode head) {

        return recursiveHelper(head, null);

    }

    private static ListNode recursiveHelper(ListNode head, ListNode prev) {

        if (head == null) {
            return prev;
        }
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
        return recursiveHelper(head, prev);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);

        head.next = listNode1;
        listNode1.next = listNode2;

//        ListNode reversed = reverseALinkedListIterative(head);
        ListNode reversedRecursive = reverseLinkedListRecursive(head);
//        String output = "Using iterative solution: " + ListNode.printLinkedList(reversed);
        String output = "Using Recursive solution: " + ListNode.printLinkedList(reversedRecursive);

        System.out.println(output);

    }
}
