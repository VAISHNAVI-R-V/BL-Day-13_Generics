package com.bl.generics;

public class MaxFinder {
    // returns the max value of three integers
    static Integer findMax(Integer int1, Integer int2, Integer int3) {
        Integer max = int1;
        if(int2.compareTo(max) > 0)
            max = int2;
        if (int3.compareTo(max) > 0)
            max = int3;
        System.out.printf("Max value of %s %s %s is %s. \n", int1, int2, int3, max);

        return max;
    }

    public static void main(String[] args) {
        Integer int1 = 51, int2 = 101, int3 = 501;
        Integer max = findMax(int1, int2, int3);
    }

}
