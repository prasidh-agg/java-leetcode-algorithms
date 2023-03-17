package com.neetcode.linkedlist;

public class RemoveElementsWithVal {
    public static ListNode removeElementsWithValue(ListNode head, int val){

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1,2,6,3,4,5,6});
        ListNode list2 = ListNode.buildLinkedList(new int[]{1,2});
        ListNode list3 = ListNode.buildLinkedList(new int[]{7,7,7,7});
        System.out.println(ListNode.printLinkedList(removeElementsWithValue(list, 6)));
        System.out.println(ListNode.printLinkedList(removeElementsWithValue(list2, 1)));
        System.out.println(ListNode.printLinkedList(removeElementsWithValue(list3, 7)));
    }
}
