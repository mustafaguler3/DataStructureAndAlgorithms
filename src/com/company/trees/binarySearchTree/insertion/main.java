package com.company.trees.binarySearchTree.insertion;

public class main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(4);
        intTree.insert(84);

        intTree.traverseInOrder();

        intTree.get(4);
    }
}
