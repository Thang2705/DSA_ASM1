/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2;

/**
 *
 * @author THANG
 */

import java.util.Scanner;

public class SumOfNIntegers {
    public static void sumAll(int arr[]) {//initialize method return sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);//create scanner object 
        System.out.print("How many numbers do you want to add : ");
        num = input.nextInt();//return num from keyboard
        int[] arr2 = new int[num];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Number" + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }
        sumAll(arr2);
    }

}