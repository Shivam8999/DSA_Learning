package org.example.sorting;

public class SelectionSort {
    //working model, select the minimum and swap

    //in first iteration you select minimum of from entire array and place it at 0th position
    //in second iteration you check from index 1 and find min and swap with index 1 item and you continue


    //bruteforce approach
    public  static  void  selectionSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i <= len-2; i++) { //n
            int minIndex = i;//one item is checked at a time, always compared to remaining list of array because earlier item are sorted as the sorting starts from 0th item
            for (int j = i+1;j<len-1;j++){ //n-1, n-2, n-3 ........
                if(arr[j]<arr[minIndex]){
//                    System.out.println("minIndex old : "+minIndex+" its value: "+arr[minIndex]);
                    minIndex=j;
//                    System.out.println("minIndex new : "+minIndex+" its value: "+arr[minIndex]);
                }
            }

            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    //TC becomes O(n^2) //best case, worst case and avg case
    public static void main(String[] args) {
        int[] testArray = {13,46,24,52,20,9};
        selectionSort(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }
}
