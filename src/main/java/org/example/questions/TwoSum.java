package org.example.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> records = new HashMap<Integer,Integer>();
        int[] indexes = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            int remaining = target-arr[i];
            if(records.get(remaining)!=null){
                indexes[0]=records.get(remaining);
                indexes[1]=i;
                break;
            }
            records.put(arr[i],i);
        }
        return indexes;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,8,9};
        int[] op = twoSum(arr,100);
        for (int i = 0; i < op.length; i++) {
            System.out.print(op[i]+" ");
        }
        System.out.println();
    }
}
