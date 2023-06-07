package com.lpu;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
//        char[] arr = {'a','b','b'};
//        System.out.println(arr);
//        int[] num = new int[5];
//        num[0] = 100;
//        num[1] = 200;
//        num[2] = 300;
//        num[3] = 400;
//        num[4] = 500;
//        System.out.println(num[3]);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // taking size of the array
        int[] arr = new int[n]; // declaring array
        for (int i=0;i<n;i++){  // taking input using for loop
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);    // reference variable ==> gives address of array
        for (int i=0;i<n;i++){  // output using for loop
            System.out.println(arr[i]);
        }
    }
}
