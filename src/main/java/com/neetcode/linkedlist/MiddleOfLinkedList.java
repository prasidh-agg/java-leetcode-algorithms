package com.neetcode.linkedlist;

public class MiddleOfLinkedList {

     public static ListNode findMiddleOfList(ListNode head){
         ListNode slow = head;
         ListNode fast = head;

         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;

     }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode list2 = ListNode.buildLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println(ListNode.printLinkedList(findMiddleOfList(list)));
        System.out.println(ListNode.printLinkedList(findMiddleOfList(list2)));
    }
}
