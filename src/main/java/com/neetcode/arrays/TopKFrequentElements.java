package com.neetcode.arrays;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k){

        if(nums.length == k) return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //create min heap, least occurring elements in the front of the queue
        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));

        //keep only k elements from this heap (remove elements until we have k left)
        for(int num : map.keySet()){
            heap.add(num);
            if(heap.size() > k) heap.poll();
        }

        //output the results in an array and return
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }
        return result;
    }

    public static int[] topKFrequentBuckets(int[] nums, int k){
        if(nums.length == k) return nums;

        // store number -> count in a hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // use buckets/lists of integers, in an array.
        // index 3 for e.g. would store all elements that occur 3 times in the given array.
        // frequency buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        //starting from the back, keep adding elements to the result array until we breach the k
        // limit
        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] == null) continue;
            for(int curr : buckets[i]){
                result[counter++] = curr;
                if(counter == k) return result;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequentBuckets(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
