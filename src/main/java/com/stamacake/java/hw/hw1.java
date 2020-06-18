package com.stamacake.java.hw;

import java.util.Arrays;
import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
        // task1
        System.out.println("Task 1\n---------");
        System.out.println("15+3<20: "+check1020(15,3));
        System.out.println("10+20<20: "+check1020(10,20));
        System.out.println();


        
        // task2
        System.out.println("Task 2\n---------");
        System.out.print("10 is ");
        posit_negav(10);
        System.out.print("-45 is ");
        posit_negav(-45);
        System.out.println();

        // task3
        System.out.println("Task 3\n---------");
        System.out.println("23 is negative: "+is_negative(23));
        System.out.println("-33 is negative: "+is_negative(-33));
        System.out.println();

        // task4
        System.out.println("Task 4\n---------");
        hello_name("Greg");
        System.out.println();

        // task5
        System.out.println("Task 5\n---------");
        int[] arr = new int[] {1,1,1,0,0,1,0,0};
        System.out.println("1: "+Arrays.toString(arr));
        array_fill(arr);
        System.out.println("2: "+Arrays.toString(arr));
        System.out.println();

        // task6
        System.out.println("Task 6\n---------");
        int[] arr6 = new int[8];
        array_spec_fill(arr6);
        System.out.println(Arrays.toString(arr6));
        System.out.println();

        // task7
        System.out.println("Task 7\n---------");
        int[] arr7 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("1: "+Arrays.toString(arr7));
        array_mult6(arr7);
        System.out.println("2: "+Arrays.toString(arr7));
        System.out.println();

        // task8
        System.out.println("Task 8\n---------");
        int[][] arr8= new int[3][3];
        System.out.println("1: "+Arrays.deepToString(arr8));
        diag2dArray(arr8);
        System.out.println("2: "+Arrays.deepToString(arr8));
        System.out.println();

        // task9
        System.out.println("Task 9\n---------");
        Random random = new Random();
        int[] arr9 = new int[] {random.nextInt(),random.nextInt(),random.nextInt(),
                random.nextInt(),random.nextInt(),random.nextInt()};
        System.out.println("1: "+Arrays.toString(arr9));
        int[] minMaxArr = min_max(arr9);
        System.out.println("Min: "+minMaxArr[0]+" , Max: "+minMaxArr[1]);
        int[] arr9_2 = new int[] {1,10,-5,234,-44};
        System.out.println("2: "+Arrays.toString(arr9_2));
        int[] minMaxArr_2 = min_max(arr9_2);
        System.out.println("Min: "+minMaxArr_2[0]+" , Max: "+minMaxArr_2[1]);
        System.out.println();


        // task10
        System.out.println("Task 10\n---------");

        System.out.println("2000: "+is_leap(2000));
        System.out.println("2100: "+is_leap(2100));
        System.out.println();

        // task11
        System.out.println("Task 11\n---------");
        int[] arr11 = new int[]{1,1,1,1,1,1,1,1,1,1,8};
        System.out.println(Arrays.toString(arr11));
        System.out.println(balance(arr11));

        int[] arr11_1 = new int[]{1,1,1,1,1,1,1,1,1,1,80};
        System.out.println(Arrays.toString(arr11_1));
        System.out.println(balance(arr11_1));
        System.out.println();
    }

    // task 1
    public static boolean check1020(int a, int b){
        if(a+b>=10 && a+b<=20) return true;
        else
            return false;
    }

    // task 2
    public static void posit_negav(int a){
       if(a>=0) System.out.println("Positive");
       else
           System.out.println("Negative");
    }

    // task 3
    public static boolean is_negative(int a){
        if(a<0) return true;
        else
            return false;
    }

    // task 4
    public static void hello_name(String a){
        System.out.println("Привет,"+a+"!");
    }

    // task 5
    public static void array_fill(int []a){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==1) a[i]=0;
            else a[i]=1;
        }
    }

    // task 6
    public static void array_spec_fill(int []a){
        for (int i = 0, j=2; i <a.length ; i++,j+=3) {
            a[i]=j;
        }
    }

    // task 7
    public static void array_mult6(int []a){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<6) a[i]*=2;
        }
    }

    // task 8
    public static void diag2dArray(int [][]a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(i==j) a[i][j]=1;
            }
        }
    }

    // task 9
    public static int[] min_max(int []a){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];
        }
        return new int[]{min,max};
    }

    // task 10
    public static boolean is_leap(int a){
       if(a%4!=0 || (a%100==0 && a%400!=0) ) return false;
       else return true;
    }

    // task 11
    public static boolean balance(int[] a){

        for (int i = 0; i <a.length ; i++) {
            int left=0;
            int right=0;
            for (int j = 0; j <i ; j++) {
                left +=a[j];
            }
            for (int j = i; j <a.length ; j++) {
                right +=a[j];
            }
            if(left==right) return true;
        }
        return false;
    }
}
