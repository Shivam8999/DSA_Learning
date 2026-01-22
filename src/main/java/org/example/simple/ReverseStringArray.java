package org.example.simple;

public class ReverseStringArray {
    //technically these approach follow 2 pointer approach
    public static void revArr(int[] arr){
        int n = arr.length;
        for(int i=0;i<=(n-1)/2;i++){
            int temp =  arr[i];
            arr[i]= arr[n-1-i];
            arr[n-1-i]=temp;
        }
    };

    public  static String revString(String str){
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for (int i = 0; i < (n-1)/2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(n-i-1));
            sb.setCharAt(n-i-1,temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] testArray = {13,46,24,52,20,9};
        revArr(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }

        String str = "This will be reversed";
        System.out.println(revString(str));

    }
}
