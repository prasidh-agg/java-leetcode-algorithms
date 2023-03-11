package com.neetcode.linkedlist;

public class FindDuplicateInArray {

    //almost same as the finding start of cycle in linked list
    public static int findDuplicateNumberInArray(int[] nums){

        //treat the array as a linked list such that if value at index 0 is 1, it means that
        // first node in the linked list points to the node at the index 2.
        int slow = nums[0];
        int fast = nums[0];

        //initially slow and fast are same, so if we use a while loop simply, the body wont be
        // excecuted atleast once, hence a do while loop.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        int ptr1 = nums[0];
        int ptr2 = slow;

        while(ptr1 != ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }

    public static int findDuplicateWithoutLinkedList(int[] nums){
        boolean[] control=new boolean[nums.length];
        for(int num: nums){
            if(control[num]){
                return num;
            }
            control[num]=true;
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findDuplicateNumberInArray(new int[]{1,2,4,2,3}));
        System.out.println(findDuplicateWithoutLinkedList(new int[]{2,3,4,4,1}));
    }

}
