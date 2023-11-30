package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many values you want to add::");
        int value=sc.nextInt();
        System.out.print("target value::");
        int target=sc.nextInt();
        int[] arr=new int[value];
        System.out.print("enter the values::");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(Arrays.toString(obj.twoSum(arr, target)));
    }
}
