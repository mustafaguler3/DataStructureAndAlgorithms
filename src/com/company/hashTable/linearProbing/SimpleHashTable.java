package com.company.hashTable.linearProbing;

import com.company.hashTable.Employee;

public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new StoredEmployee[10];
    }

    public void put(String key,StoredEmployee employee){
        int hashKey = hashKey(key);
        if (occupied(hashKey)){
            int stopIndex = hashKey;
            if (hashKey == hashTable.length-1){
                hashKey = 0;
            }else{
                hashKey++; //if else first probe
            }

            while (occupied(hashKey) && hashKey != stopIndex){
                hashKey =  (hashKey+1) % hashTable.length;
            }
        }
        if (occupied(hashKey)){
            System.out.println("Sorry, there's already an employee at posi "+hashKey);
        }else {
            hashTable[hashKey] = employee;
        }

    }
    public Employee get(String key){
        int hashKey = hashKey(key);
        if (hashKey == -1){
            return null;
        }
        return hashTable[hashKey].employee;
    }

    public int findKey(String key){
        int hashKey = hashKey(key);
        if (hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)){
            return hashKey;
        }

            int stopIndex = hashKey;
            if (hashKey == hashTable.length-1){
                hashKey = 0;
            }else{
                hashKey++; //if else first probe
            }

            while (hashKey != stopIndex && !hashTable[hashKey].key.equals(key)){
                hashKey =  (hashKey+1) % hashTable.length;
            }

        return hashKey;
    }

    public void printHashtable(){
        for (int i=0;i<hashTable.length;i++){
            if (hashTable[i] == null){
                System.out.println("empty");
            }else{
                System.out.println(hashTable[i].employee);
            }

        }
    }
    private boolean occupied(int index){
        return hashTable[index] != null;
    }

    private int hashKey(String key){
        return key.length() % hashTable.length;
    }
}













