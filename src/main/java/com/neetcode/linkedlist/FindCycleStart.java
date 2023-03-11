package com.neetcode.linkedlist;

public class FindCycleStart {

    public static int findStartOfCycle(ListNode head){

        ListNode slow = head, fast = head, start = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //this means that a cycle is there.. and both slow and fast point to one node
                //right now. So start from the start, and move both start and slow one by one
                // until they meet. wherever they meet, is the junction of the cycle start.

                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                return slow.val;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedListWithCycle(new int[]{1,2,3,4,5}, 3);
        ListNode list2 = ListNode.buildLinkedListWithCycle(new int[]{10,2,3,90,5,6,7,8}, 5);
        System.out.println(findStartOfCycle(list));
        System.out.println(findStartOfCycle(list2));
    }

}
