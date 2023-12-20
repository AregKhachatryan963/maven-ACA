package org.example;

import java.util.Arrays;

public class MyArrayList {
    Object[] objects = new Object[4];

    public void add(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = object;
                if (objects.length / 2 <= i) {
                    expandArray();
                }
                break;
            }
        }
    }
    private void expandArray() {
        Object[] tempArray = Arrays.copyOf(objects, objects.length*2);
        objects = tempArray;
    }
    public Object get(int index){
        return objects[index];
    }
    public void remove(int index){
        for (int i = index; i < objects.length-1; i++){
            objects[i] = objects[i+1];
        }
    }
    public void remove(Object object){
        for (int i = 0; i < objects.length -1; i++){
            if(object.equals(objects[i])){
                remove(i);
                break;
            }
        }
    }
}
