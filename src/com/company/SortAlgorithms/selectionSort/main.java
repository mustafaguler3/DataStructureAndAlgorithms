package com.company.SortAlgorithms.selectionSort;

public class main {
    public static void main(String[] args) {
        int[] intArray = {20,4,5,1,2,3,90};

//        for (int i=intArray.length-1;i>0;i--){
//
//            int largest = 0;
//
//            for (int j=1;j<=i;j++){
//                if(intArray[j] > intArray[largest]){
//                    largest = j;
//                }
//            }
//            swap(intArray,largest,i);
//        }

    }
    public static void swap(int[] array,int i,int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
