package com.company.hashTable;

public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new Employee[10];
    }

    public void put(String key,Employee employee){
        int hashKey = hashKey(key);
        if (hashTable[hashKey] != null){
            System.out.println("Sorry, there's already an employee at posi "+hashKey);
        }else {
            hashTable[hashKey] = employee;
        }

    }
    public Employee get(String key){
        int hashKey = hashKey(key);
        return hashTable[hashKey];
    }

    public void printHashtable(){
        for (int i=0;i<hashTable.length;i++){
            System.out.println(hashTable[i]);
        }
    }


    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
}













