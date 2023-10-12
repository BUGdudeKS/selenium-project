package com.cydeo.tests.day02_locators_getText_getAttribute.homeWork;

public class lop {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,8,9,3};
        int x= arr[0];
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] <x)
                x=arr[k];
        }
        System.out.println(x);
    }
}
