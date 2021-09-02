package com.bl.generics;

public class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T[] elements) {
        T max = elements[0];
        for (T i: elements) {
            if(i.compareTo(max) > 0)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integerValue = {108, 314, 427};
        Float[]  floatValue = {96.5f, 21.23f, 80.6f};
        String[] stringValue = {"apple", "banana", "orange"};

//        findMax(integerValue);
//        findMax(floatValue);
//        findMax(stringValue);

        Integer maxOfThreeInteger = findMax(integerValue);
        System.out.println("The maximum value of three integers is : "+maxOfThreeInteger);

        Float  maxOfThreeFloats = findMax(floatValue);
        System.out.println("The maximum value of three floats is : "+maxOfThreeFloats);

        String maxOfThreeStrings = findMax(stringValue);
        System.out.println("The maximum value of three strings is : "+maxOfThreeStrings);
    }
}