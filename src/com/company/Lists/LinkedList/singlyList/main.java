package com.company.Lists.LinkedList.singlyList;

public class main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("mustafa","güler",11);
        Employee emp2 = new Employee("musa","güler",12);
        Employee emp3 = new Employee("muehmet","güler",13);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(emp1);
        list.addToFront(emp2);
        list.addToFront(emp3);

        list.printList();
    }

}
