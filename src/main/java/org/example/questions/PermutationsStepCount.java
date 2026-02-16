package org.example.questions;

import java.util.HashMap;
import java.util.Map;

public class PermutationsStepCount {
    //Question, arr1 = [1,2,5,8,9] arr2=[9,8,1,2,5], where arr2 will always be permutation of arr1.
    //Fine the minimum required steps needed to convert arr2 into arr1;

    // this question does not consider the repeat of elements in
    public static int countSwap(int[] to, int[] from){
        Boolean[] arrcheck = new Boolean[to.length];

        Map<Integer,Integer> correctPositions = new HashMap<Integer,Integer>();

        int swapCount = 0;

        for (int i = 0; i < to.length; i++) {
            correctPositions.put(to[i],i);

            arrcheck[i]= to[i] == from[i];
        }

        //iterate on arr2
        for (int i = 0; i < from.length; i++) {
            if(arrcheck[i]==true){
                continue;
            }
            //get correct position of element that should be at this position
            int swapPosition = correctPositions.get(from[i]);

            int temp = from[i];
            from[i]=from[swapPosition];
            from[swapPosition]=temp;
            swapCount++;
            arrcheck[i]=true;

            if(to[swapPosition]==from[swapPosition]){
                arrcheck[swapPosition]=true;
            }

//            for (int j = 0; j < from.length; j++) {
//                System.out.print(from[j]);
//            }
//            System.out.println();
        }



        return swapCount;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,5,8,9};
        int[] arr2={9,8,1,2,5};
        int swaps = countSwap(arr1,arr2);

        int[] arrto = {1,2,3,4,5};
        int[] arrfr = {5,4,3,2,1};

        System.out.println("Number of swaps required : "+swaps);
        System.out.println("Number of swaps required for second set = "+countSwap(arrto,arrfr));
    }
}
