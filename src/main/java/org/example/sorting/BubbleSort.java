package org.example.sorting;

public class BubbleSort {
    //adjacent swapping and keep swapping bigger number to right always

    //worst, avg and best case O(n^2)
    //but with slight improvements best case could be O(n)
    public static void bubbleSort(int[] arr){
        int len = arr.length;

        for (int i = len-1; i>=1 ; i--) {
            int isSwaped = 0;//improvement
            for (int j = 0; j <= i-1; j++) { //why i-1, because i will be at last index and for comparision when we do j+1, then it will Runtime Exception will occur
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    isSwaped=1;
                }
            }

            if(isSwaped==0){ //during first iteration it did not swapped any number hence we can safely say that its already sorted and hence we can avoid further checking
                break;
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
