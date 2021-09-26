package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9,5};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if(arr==null || arr.length==0) {
            return;
        }

        int minIndex=0;
        int tmpValue;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;++i){
            if(arr[i]<=minValue){
                minValue=arr[i];
                minIndex=i;
            }
        }
        tmpValue=arr[0];
        arr[0]=minValue;
        arr[minIndex]=tmpValue;
    }

}