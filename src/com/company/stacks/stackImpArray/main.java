package com.company.stacks.stackImpArray;

public class main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("John","Man",1));
        stack.push(new Employee("Ham","San",1247));
    }
}
