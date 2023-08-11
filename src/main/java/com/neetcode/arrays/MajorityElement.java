package com.neetcode.arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        // //better
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // //iterate over values and return the one that is more than floor of n/2
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > Math.floor(nums.length / 2)){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        // optimal (Moore's voting's algorithm)
        int ele = 0;
        int count = 0;
        for(int n : nums){
            if(count == 0){
                count = 1;
                ele = n;
            }
            else if(n == ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,5};
        System.out.println(majorityElement(arr));
    }
}
