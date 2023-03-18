package com.neetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1, 1, 1, 2, 2, 3, 3, 4, 5, 5});
        System.out.println(ListNode.printLinkedList(deleteDuplicates(list)));
    }
}
