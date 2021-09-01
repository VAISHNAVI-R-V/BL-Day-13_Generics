package com.bl.generics;

public class MaxFinder {
    // returns the max value of three strings
    static String findMax(String string1, String string2, String string3) {
        String max = string1;
        if(string2.compareTo(max) > 0)
            max = string2;
        if (string3.compareTo(max) > 0)
            max = string3;
        System.out.printf("Max value of %s %s %s is %s. \n", string1, string2, string3, max);

        return max;
    }

    public static void main(String[] args) {
        String string1 = "Apple", string2 = "Peach", string3 = "Banana";
        String max = findMax(string1, string2, string3);
    }

}
