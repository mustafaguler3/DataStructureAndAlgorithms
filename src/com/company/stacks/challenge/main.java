package com.company.stacks.challenge;

import java.util.LinkedList;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abcba"));
        System.out.println(checkForPalindrome("I did, did I"));
        System.out.println(checkForPalindrome("hello"));

    }

    public static boolean checkForPalindrome(String string){

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder builder = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i=0;i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z'){
                builder.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(builder.toString());
    }
}

















