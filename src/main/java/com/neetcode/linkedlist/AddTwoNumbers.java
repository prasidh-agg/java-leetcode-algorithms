package com.neetcode.linkedlist;

public class AddTwoNumbers {

    public static ListNode addTwoNumbersFromList(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

        }
        return dummy.next;

    }

    public static void main(String[] args) {

        ListNode l1 = ListNode.buildLinkedList(new int[]{9,9,9});
        ListNode l2 = ListNode.buildLinkedList(new int[]{9,9,9});

        // answer would be 0,8,9 -> 980
        System.out.println(ListNode.printLinkedList(addTwoNumbersFromList(l1, l2)));
    }
}
