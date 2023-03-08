package com.neetcode.linkedlist;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEndOfList(ListNode head, int n){

        // send fast pointer n steps ahead.. then start slow and fast one step ahead until fast
        // reaches the end. This way slow will become n steps behind fast/ the end.

        // dummy is needed because what if there are 3 nodes and we want to remove the first one..
        // (3rd from the end).. in that case we need some dummy need behind the first one.

        //actually dummy is not needed.. we can check that if fast has reached the null, it means
        // we need to remove the first node.. so we just return head.next

        ListNode slow = head, fast = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7});
        ListNode list2 = ListNode.buildLinkedList(new int[]{1, 2, 3});
        ListNode list3 = ListNode.buildLinkedList(new int[]{1, 2, 3});
        System.out.println(ListNode.printLinkedList(removeNthFromEndOfList(list, 3)));
        System.out.println(ListNode.printLinkedList(removeNthFromEndOfList(list2, 2)));
        System.out.println(ListNode.printLinkedList(removeNthFromEndOfList(list3, 3)));
    }
}
