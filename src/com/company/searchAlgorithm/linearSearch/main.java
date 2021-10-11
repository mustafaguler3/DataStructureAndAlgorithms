package com.company.searchAlgorithm.linearSearch;

public class main {
    public static void main(String[] args) {
        int[] intArray = {4,8,4,5,1,2,36,60};

        System.out.println(linearSearch(intArray,5));
        System.out.println(linearSearch(intArray,3));
        System.out.println(linearSearch(intArray,9));
    }
    public static int linearSearch(int[] input,int value){
        for (int i=0;i<input.length;i++){
            if (input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
















