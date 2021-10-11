package com.company.SortAlgorithms.insertionSort;

public class main {
    public static void main(String[] args) {
        int[] intArray = {4,8,5,6,20,14,96};

        for (int i=1;i<intArray.length;i++){
            int newElement = intArray[i];
            int j;
            for (j=i; j>0 && intArray[j-1] > newElement;j--){
                intArray[j] = intArray[j-1];
            }
            intArray[j] = newElement;
        }

        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }




    }
}
