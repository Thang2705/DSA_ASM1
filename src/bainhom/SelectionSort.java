/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainhom;

/**
 *
 * @author THANG
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            //Tìm phần tử nhỏ nhất trong đoạn chưa được sắp xếp
            int minIdx = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            
            //Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên trong đoạn chứa
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 2, 1, 4};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
