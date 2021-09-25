package com.example.task10;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, -9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int minIndex=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;++i){
            if(arr[i]<=minValue){
                minValue=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

}