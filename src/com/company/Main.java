package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,2,3,4};
	    //4*4 - 16 bytes of storage

        reverse("mustafa");

    }

    public static void reverse(String str){
        for (int i=str.length()-1;i>=0;i--){
            System.out.println("reversed : "+i);
        }
    }
}
