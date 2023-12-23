package org.example;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> myTreeMap =new MyTreeMap<>();
//        myTreeMap.put(5, "5");
//        myTreeMap.put(4,"4");
//        myTreeMap.put(2, "2");
//        myTreeMap.put(1,"1");
//        myTreeMap.put(7, "7");
//        myTreeMap.put(3, "6");
//        myTreeMap.put(8, "6");
//        myTreeMap.put(9, "6");
//        myTreeMap.put(6, "6");
//
//        myTreeMap.print();
//        myTreeMap.remove(4);
//        myTreeMap.print();

//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add("a");
//        myArrayList.add("b");
//        myArrayList.add("c");
//        myArrayList.add("d");
//        myArrayList.add("e");
//        myArrayList.add("f");
//        myArrayList.add("j");
//        System.out.println(myArrayList.get(4));
//        myArrayList.remove(0);
//        System.out.println(myArrayList.get(4));
//        myArrayList.remove("b");
//        System.out.println(myArrayList.get(4));

        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        myHashSet.add(1);
        myHashSet.add(11);
        myHashSet.add(12);
        myHashSet.add(6);

        System.out.println(myHashSet.contains(2));
        myHashSet.print();
//        myHashSet.remove(11);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.print();
    }
}
