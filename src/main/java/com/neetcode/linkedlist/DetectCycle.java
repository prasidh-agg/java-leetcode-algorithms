package com.neetcode.linkedlist;

public class DetectCycle {

    public static boolean detectLinkedListCycle(ListNode head){

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedListWithCycle(new int[]{1,2,3,4,5}, 3);
        ListNode list2 = ListNode.buildLinkedList(new int[]{1,2,3,4,5});
        System.out.println(detectLinkedListCycle(list));
        System.out.println(detectLinkedListCycle(list2));
    }

}
