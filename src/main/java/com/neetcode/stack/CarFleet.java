package com.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Example 1:
 * <p>
 * Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
 * Output: 3
 * Explanation:
 * The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12.
 * The car starting at 0 does not catch up to any other car, so it is a fleet by itself.
 * The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The
 * * fleet moves at speed 1 until it reaches target.
 * Note that no other cars meet these fleets before the destination, so the answer is 3.*
 */
public class CarFleet {

    public static int numberOfCarFleets(int target, int[] position, int[] speed) {

        int n = position.length;
        List<int[]> cars = new ArrayList<>();

        //create a list of pairs of positions and speeds.. and sort them such that positions are
        // in decreasing order. It means that the car closest to the target will be the first
        // element in the array
        for (int i = 0; i < n; i++) {
            cars.add(new int[]{position[i], speed[i]});
        }
        cars.sort((a, b) -> Integer.compare(b[0], a[0]));


        int fleets = 0;
        double maxTime = 0;
        for (int i = 0; i < n; i++) {
            int[] car = cars.get(i);

            //calculate the time it will take for the car to reach the target.. (Distance) / Speed
            // (Target - Position) / Speed.
            double time = (double)(target - car[0]) / car[1];
            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }
        return fleets;

    }

    public static void main(String[] args) {
        System.out.println(numberOfCarFleets(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1,
                3}));
        System.out.println(numberOfCarFleets(10, new int[]{3}, new int[]{3}));
        System.out.println(numberOfCarFleets(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}));
    }
}
