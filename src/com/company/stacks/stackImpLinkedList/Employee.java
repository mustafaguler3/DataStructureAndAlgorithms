package com.company.stacks.stackImpLinkedList;

public class Employee {

    private String name;
    private String surname;
    private int number;

    public Employee(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }
}
