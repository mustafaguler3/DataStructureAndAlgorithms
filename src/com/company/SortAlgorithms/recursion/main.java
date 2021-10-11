package com.company.SortAlgorithms.recursion;

public class main {
    public static void main(String[] args) {

    }

    public static int recursiveFactorial(int num){
        if (num==0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }

    public static int factorial(int num){
        if(num==0){
            return 1;
        }

        int fact = 1;
        for (int i=1;i<=num;i++){
            fact *= i;
        }

        return fact;
    }
}
