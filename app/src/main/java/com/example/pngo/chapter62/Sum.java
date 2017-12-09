package com.example.pngo.chapter62;

/**
 * Created by pngo on 12/6/17.
 */

public class Sum {
    public static double findSum(double [] numbers){
        double sum = 0.0;
        for(double x:numbers){
            sum += x;
        }
        return sum;
    }
}
