package org.example.simple;

public class MergeSortedArrays {
    static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int p1=0;
        int p2=0;
        int[] newArr = new int[n1+n2];
        int mainCounter = 0;
        while(p1<=n1-1 && p2<=n2-1){
            if(arr2[p2]<arr1[p1]){
                newArr[mainCounter]=arr2[p2];
                p2++;
            }else{
                newArr[mainCounter]=arr1[p1];
                p1++;
            }
            mainCounter++;
        }


        if(p1>=n1){
            while(p2<=n2-1){
                newArr[mainCounter++]=arr2[p2++]; //using post increment, will increment variables only after current line has been executed
            }
        }

        if(p2>=n2){
            while(p1<=n1-1){
                newArr[mainCounter++]=arr1[p1++]; //using post increment operators;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {11,31,50,60,70};
        int[] arr2={2,4,8,9,10,100};

        int[]  merged = mergeSortedArrays(arr1,arr2);
        for (int i : merged) {
            System.out.println(i);
        }

    }
}
