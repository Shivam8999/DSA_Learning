package org.example.sorting;

public class MergeSort {
    //split the arrays into single element array and then merge them
   static void merge(int s,int mid,int e,int[] arr){
        int p1=s;//first pointer starting from start
        int p2=mid+1;//second pointer staring from the mid+1, 1 after mid

        int[] temparr = new int[e-s+1];
        int mainCounter = 0;
        while(p1<=mid && p2<=e){
            if(arr[p1]<=arr[p2]){
                temparr[mainCounter++]=arr[p1++];
            }else{
                temparr[mainCounter++]=arr[p2++];
            }
        }

        if(p1>mid){
            while (p2<=e){
                 temparr[mainCounter++]=arr[p2++];
            }
        }

        if(p2>e){
            while (p1<=mid){
                temparr[mainCounter++]=arr[p1++];
            }
        }

        for (int i = s; i <=e ; i++) {
            arr[i]=temparr[i-s]; //eg i=5,s=5 5-5=0th index item, i=6,s=5 6-5=1st index item
        }
    }

    //this is a divide and concur algorithm
    //keep dividing until you have same high and lows and once that comes.
    //every internal recursion will aggressively merge the arrays.
    //the merged array will then be assigned proper position in the main array by merge method.
    //remember this is recursion you will need to run a dry run to understand this in case you forget this.
    static void divide(int[] arr,int low,int high){
        if(low==high) return;
        int mid = (low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(low,mid,high,arr);
    }

    public static void main(String[] args) {
        int[] testArray = {13,46,24,52,20,9,5,2};
        divide(testArray,0,testArray.length-1);
        for (int i : testArray) {
            System.out.println(i);
        }
    }
}
