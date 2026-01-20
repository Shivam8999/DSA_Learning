package org.example.sorting;

public class BubbleSort {
    //adjacent swapping and keep swapping bigger number to right always

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = len-1; i>=1 ; i--) {
            for (int j = 0; j <= i-1; j++) { //why i-1, because i will be at last index and for comparision when we do j+1, then it will Runtime Exception will occur
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {13,46,24,52,20,9};
        bubbleSort(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }

}
