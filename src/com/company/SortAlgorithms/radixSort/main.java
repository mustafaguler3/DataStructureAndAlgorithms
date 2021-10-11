package com.company.SortAlgorithms.radixSort;

public class main {
    public static void main(String[] args) {

        int[] radixArray = {4502,2658,9845,2145};

        radixSort(radixArray,10,4);

        for (int i=0;i<radixArray.length;i++){
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(int[] input,int radix,int with){
        for (int i=0;i<with;i++){
            radixSingleSort(input,i,radix);
        }
    }

    public static void radixSingleSort(int[] input,int position,int radix){

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input){
            countArray[getDigit(position,value,radix)]++;
        }
        //adjust the count array
        for (int j=1;j<radix;j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems-1;tempIndex>=0;tempIndex--){
            temp[--countArray[getDigit(position,input[tempIndex],radix)]] =input[tempIndex];

        }

        for (int tempIndex=0;tempIndex<numItems;tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position,int value,int radix){
        return value / (int)Math.pow(10,position) % radix;
    }
}









