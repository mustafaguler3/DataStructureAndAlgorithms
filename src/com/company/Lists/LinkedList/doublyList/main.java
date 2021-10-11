package com.company.Lists.LinkedList.doublyList;

public class main {
    public static void main(String[] args) {

        Employee e = new Employee("mustafa","güler",41);
        Employee e2 = new Employee("musa","mehdi",4);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(e);
        list.addToFront(e2);
        list.printList();

        Employee billEm = new Employee("Bill","jo",8);

        list.addToEnd(billEm);

    }
}














