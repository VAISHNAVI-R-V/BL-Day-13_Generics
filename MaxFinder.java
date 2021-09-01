package com.bl.generics;

public class MaxFinder {
    // returns the max value of three Floats
    static Float findMax(Float float1, Float float2, Float float3) {
        Float max = float1;
        if(float2.compareTo(max) > 0)
            max = float2;
        if (float3.compareTo(max) > 0)
            max = float3;
        System.out.printf("Max value of %s %s %s is %s. \n", float1, float2, float3, max);

        return max;
    }

    public static void main(String[] args) {
        Float float1 = 51.5f, float2 = 10.1f, float3 = 5.01f;
        Float max = findMax(float1, float2, float3);
    }

}
