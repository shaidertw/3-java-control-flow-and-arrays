package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5,-1,3));
    }

    static int getMin(int a, int b, int c) {
        int min;
        min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }
}