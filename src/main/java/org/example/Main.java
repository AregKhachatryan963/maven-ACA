package org.example;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> myTreeMap =new MyTreeMap<>();
        myTreeMap.put(5, "5");
        myTreeMap.put(4,"4");
        myTreeMap.put(2, "2");
        myTreeMap.put(1,"1");
        myTreeMap.put(7, "7");
        myTreeMap.put(3, "6");
        myTreeMap.put(8, "6");
        myTreeMap.put(9, "6");
        myTreeMap.put(6, "6");

        myTreeMap.print();
        myTreeMap.remove(5);
        myTreeMap.print();


    }
}
