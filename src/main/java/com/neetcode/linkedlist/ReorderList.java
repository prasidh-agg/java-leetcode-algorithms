package com.neetcode.linkedlist;

public class ReorderList {

    // 1-2-3-4-5-6 ---> 1-6-2-5-3-4
    public static ListNode reorderLinkedList(ListNode head){

        if (head == null || head.next == null) {
            return head;
        }
        // divide one list into two parts..(find the first middle of the list)
        ListNode slow = head, fast = head, startOfFirst = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // middle found at 3
        ListNode middle = slow;
        // start of second at 4
        ListNode startOfSecond = middle.next;

        // First list gets terminated after the middle of the list..
        // first list becomes 1-2-3-null
        middle.next = null;

        // start of second list assigned to the reverse of the second half of the list.
        // second list becomes 6-5-4-null
        startOfSecond = ReverseList.reverseLinkedListRecursive(startOfSecond);

        ListNode main = startOfFirst;
        // merge the two lists
        while(startOfFirst != null){
            ListNode temp1 = startOfFirst.next;
            ListNode temp2 = startOfSecond.next;

            startOfFirst.next = startOfSecond;
            startOfSecond.next = temp1;

            startOfFirst = temp1;
            if (temp2 == null) {
                break;
            }
            startOfSecond = temp2;
        }

        return main;
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head, fast = head, startOfFirst = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        ListNode startOfSecond = middle.next;

        middle.next = null;
        startOfSecond = ReverseList.reverseLinkedListRecursive(startOfSecond);

        while(startOfSecond != null){
            ListNode temp1 = startOfFirst.next;
            ListNode temp2 = startOfSecond.next;

            startOfFirst.next = startOfSecond;
            startOfSecond.next = temp1;
            startOfFirst = temp1;
            startOfSecond = temp2;
         }

    }
    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1,2,3,4,5});
        System.out.println(ListNode.printLinkedList(list));
        reorderList(list);
        System.out.println(ListNode.printLinkedList(list));
    }
}
