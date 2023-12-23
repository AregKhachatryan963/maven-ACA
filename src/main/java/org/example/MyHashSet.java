package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet<V extends Comparable<V>> {
    int capacity;
    int count;
    List<V> entries = new ArrayList<>();
    List<ArrayList<V>> baskets = new ArrayList<>(capacity);
    MyHashSet  (){
        capacity = 10;
        initArray();
    }
    private void initArray(){
        for (int i = 0; i < capacity; i++){
            baskets.add(new ArrayList<>());
        }
    }
    public void add(V obj){
        int index = obj.hashCode() % capacity;
        for (V v: baskets.get(index)) {
            if (obj.equals(v)){
                return;
            }
        }
        baskets.get(index).add(obj);
        count++;
        if(count > capacity/2){
            increaseCapacity();
        }
    }
    private void increaseCapacity(){
        capacity *= 2;
        ArrayList<V> temp = new ArrayList<>(capacity);
        for (ArrayList<V> basket: baskets){
            for (V entry: basket){
                temp.add(entry);
            }
        }
        baskets = new ArrayList<>(capacity);
        initArray();
        for (V t: temp){
            int index = t.hashCode() % capacity;
            baskets.get(index).add(t);
        }
    }
    public boolean contains(V obj){
        int index = obj.hashCode() % capacity;
        return(baskets.get(index).contains(obj));
    }
    public void print(){
        for (ArrayList<V> basket: baskets){
            for (V entry: basket){
                System.out.print(entry + ", ");
            }
        }
        System.out.println();
    }
    public boolean remove(V obj){
        for(ArrayList<V> basket: baskets){
            for (V entry: basket){
                if (obj.equals(entry)) {
                    basket.remove(entry);
                    return true;
                }
            }
        }
        return false;
    }
}
