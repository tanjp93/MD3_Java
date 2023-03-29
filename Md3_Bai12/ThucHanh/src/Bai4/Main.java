package Bai4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Nguyen Van C");
        tree.insert("Nguyen Van D");
        tree.insert("Nguyen Van A");
        tree.insert("Nguyen Van B");
        tree.inorder();
        System.out.println("The number of nodes is : "+tree.getSize());

    }
}
