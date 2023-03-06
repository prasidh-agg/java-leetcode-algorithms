package com.neetcode.linkedlist;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2){

        ListNode head = new ListNode();
        ListNode curr = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        while(list1 != null){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
        while(list2 != null){
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }
        return head.next;

    }

    public static ListNode mergeTwoSortedListsRecursively(ListNode list1, ListNode list2){

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoSortedListsRecursively(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoSortedListsRecursively(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.buildLinkedList(new int[]{1,3,9,11,15});
        ListNode list2 = ListNode.buildLinkedList(new int[]{2,4,5,6,7,8,12,16});

        System.out.println(ListNode.printLinkedList(mergeTwoSortedListsRecursively(list1, list2)));
    }
}
