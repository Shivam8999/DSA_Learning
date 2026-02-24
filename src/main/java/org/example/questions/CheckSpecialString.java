package org.example.questions;

import java.util.Stack;
//Given string check if the given string is valid.
//given string is valid only if it contains closing symbols of every and every occurance (,[ and {, following the correct closing order.
//eg : [()]-valid, [(])-invalid, {[()]){}-valid,[{}](-invalid there can be other symbols or characters in this but ignore them
public class CheckSpecialString {
    public static boolean checkString(String str){
        Stack<Character> stck = new Stack<Character>();
        boolean isValid = true;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(stck.isEmpty()||currentChar=='{'|| currentChar=='('||currentChar=='['){
                stck.push(currentChar);
            }else{
                if((stck.peek()=='{' && currentChar=='}') || (stck.peek()=='(' && currentChar==')') || (stck.peek()=='[' && currentChar==']')){
                    stck.pop();
                }else{
                    isValid=false;
                    break;
                }
            }
        }


        if(!stck.isEmpty()){
            isValid=false;
        };
        return isValid;
    }
    public static void main(String[] args) {
        String str1="{[[]]}(){}";//valid
        String str2="{}[}[]([])";//invalid
        String str3="{[[]]}(){";//invalid

        System.out.println("Is String 1 valid : "+checkString(str1));
        System.out.println("Is String 2 valid : "+checkString(str2));
        System.out.println("Is String 3 valid : "+checkString(str3));

    }
}
