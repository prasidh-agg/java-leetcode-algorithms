package com.neetcode.arbitrary;

public class DistanceBetweenTwoPoints {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0;
        double x2 = 4.0, y2 = 6.0;
        double dist = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 +
                "): " + dist);

    }
}
