package com.neetcode.linkedlist;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {

        ListNode middle = MiddleOfLinkedList.findFirstMiddleOfList(head);

        ListNode next = middle.next;
        ListNode second = ReverseList.reverseLinkedListRecursive(next);


        while (second != null) {
            if (head.val != second.val) {
                return false;
            }
            head = head.next;
            second = second.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode list = ListNode.buildLinkedList(new int[]{1, 2, 1});
        ListNode list2 = ListNode.buildLinkedList(new int[]{1, 2, 2, 1});
        ListNode list3 = ListNode.buildLinkedList(new int[]{1, 2, 3, 4});
        ListNode list4 = ListNode.buildLinkedList(new int[]{1, 2, 3, 3, 2, 1});
        ListNode list5 = ListNode.buildLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode list6 = ListNode.buildLinkedList(new int[]{1, 2});
        System.out.println(isPalindrome(list));
        System.out.println(isPalindrome(list2));
        System.out.println(isPalindrome(list3));
        System.out.println(isPalindrome(list4));
        System.out.println(isPalindrome(list5));
        System.out.println(isPalindrome(list6));
    }
}
