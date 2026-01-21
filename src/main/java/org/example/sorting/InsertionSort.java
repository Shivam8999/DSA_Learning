package org.example.sorting;

public class InsertionSort {
    //get item and place it at correct place
    //achieved by swapping with adjacent left element, until it reaches correct position
    //similar to bubble sort ut we don't bubble the item at last or start we just keep placing to correct position
    /* 
    * EG: 
    * arr = [9,14,12,15,6,8,13]
    * start scanning from the first item starts
    * arr = [9,14,12,15,6,8,13]
    * arr = [9,14,12,15,6,8,13]
    * arr = [9,12,14,15,6,8,13]-> 12 will no longer be moved to left because it at correct place
    * until 15 i.e 4 element things are same
    * arr = [9,12,14,6,15,8,13]->[9,12,6,14,15,8,13]->[9,6,12,14,15,8,3]->[6,9,12,14,15,8,3] 
    * 
    * //notice how 6 moved one step at a time and it keeps this shift until it moves either start or it cannot be moved to left 
    * */

    /*
    * TC -> N * ((n+1)/2) -> O(n^2)-> for avg and wort case and best case
    * With improvements best case can be O(n)
    *
    * */

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-1;i++){ //create a range to scan //0th index scan, then first item checked and then second, in this way every item is checked in second loop and second loops moves item to the correct place
//            for(int j=i;j>=1 && arr[j]<arr[j-1];j--), in loop comparison is done so unless the last item is not less then previous item loop never runs and you get O(n), complexity
            for(int j=i;j>=1;j--){//no need to check 0th index, because then j-1 will be -1 and we will get run time exception
                if(arr[j]<arr[j-1]) {//check previous item and replace
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = {13,46,24,52,20,9,5,2};
        insertionSort(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }
}
