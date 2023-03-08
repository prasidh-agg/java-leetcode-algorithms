package com.neetcode.linkedlist;

import static com.neetcode.linkedlist.MergeTwoSortedLists.mergeTwoSortedListsRecursively;

public class MergeKSortedLists {

    public static ListNode mergeKSortedLinkedLists(ListNode[] lists){

        if(lists == null || lists.length == 0){
            return null;
        }
        int step = 1, k = lists.length;

        while(step < k){
            for(int i = 0; i < k - step; i += 2*step){
                lists[i] = mergeTwoSortedListsRecursively(lists[i],
                        lists[i+step]);
            }
            step *= 2;
        }
        return lists[0];

    }

    public static void main(String[] args) {
        ListNode list1 = ListNode.buildLinkedList(new int[]{0, 4, 5, 6, 7});
        ListNode list2 = ListNode.buildLinkedList(new int[]{1, 3, 8, 9, 10});
        ListNode list3 = ListNode.buildLinkedList(new int[]{2, 11, 13, 16, 17});
        ListNode list4 = ListNode.buildLinkedList(new int[]{12, 14, 15, 18, 19});
        ListNode list5 = ListNode.buildLinkedList(new int[]{20, 24, 25, 28, 29});
        ListNode[] lists = new ListNode[]{list1, list2, list3, list4, list5};

        System.out.println(ListNode.printLinkedList(mergeKSortedLinkedLists(lists)));
    }
}
