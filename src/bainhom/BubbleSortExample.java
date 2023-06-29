/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainhom;

/**
 *
 * @author THANG
 */
public class BubbleSortExample {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++)
            for(int j = 0; j < n - i - 1; j++){
                int temp = arr[j];
                if(arr[j] > arr[j + 1]);
                arr[j + 1] = temp;
            }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        
        bubbleSort(arr);
        
        System.out.println("Mảng sau khi sắp xếp");
        for(int num : arr){
            System.out.print(num + "");
        }
    }
}
