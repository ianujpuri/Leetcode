package datastructures.cache;

import java.util.LinkedHashMap;

public class MainClass {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);

        System.out.println(list);

        list.delete(10);
        list.delete(70);
        System.out.println(list);


        
    }
}
