package com.neetcode.linkedlist;

public class IntersectionBetweenTwoLists {
    public static ListNode intersectionOfTwoLists(ListNode listA, ListNode listB) {

        if(listA == null || listB == null){
            return null;
        }
        ListNode p1 = listA, p2 = listB;

        while(p1 != p2){
            p1 = p1 == null ? listB : p1.next;
            p2 = p2 == null ? listA : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.buildLinkedList(new int[]{4, 1});
        ListNode list2 = ListNode.buildLinkedList(new int[]{5, 6, 1});
        ListNode commonList = ListNode.buildLinkedList(new int[]{8, 4, 5});
        list1.next = commonList; list2.next = commonList;

        System.out.println(ListNode.printLinkedList(intersectionOfTwoLists(list1, list2)));
    }
}
