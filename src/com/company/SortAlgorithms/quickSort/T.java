package com.company.SortAlgorithms.quickSort;

public class T {
    public static void main(String[] args) {

        int[] intArray = {4,88,25,2,1,3};

        sort(intArray,0,intArray.length);

        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] <= pivot)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
