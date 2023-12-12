package org.example;

public class MyTreeMap<K extends Comparable<K>, V > {
    K key;
    V value;
    Node<K, V> root = new Node<>(null, null, null, null);


    public void put(K key, V value) {
        if(root.getKey() == null){
            root.setKey(key);
            root.setValue(value);
            return;
        }
        putRecurs(key, value, root);
    }

    private void putRecurs(K key, V value, Node<K, V> node) {

        if (key.compareTo(node.getKey()) == 0) {
            node.setValue(value);
        }

        if (key.compareTo(node.getKey()) < 0) {
            if(node.left == null){
                node.left = new Node<>(key, value, null, null);
                return;
            }
            putRecurs(key, value, node.left);
        }
        if (key.compareTo(node.getKey()) > 0) {
            if(node.write == null){
               node.write = new Node<>(key, value, null, null);
               return;
            }
            putRecurs(key, value, node.write);
        }
    }

    public void print() {
        if (root == null) {
            return;
        }
        printRecurs(root);
    }

    private void printRecurs(Node<K, V> node) {
        if (node == null) {
            return;
        }
        printRecurs(node.left);
        System.out.println(node.getKey() + ", " + node.getValue());
        printRecurs(node.write);
    }

    class Node<K extends Comparable<K>, V> {
        private Node<K, V> left;
        private Node<K, V> write;
        private K key;
        private V value;

        public Node(K key, V value, Node<K, V> left, Node<K, V> write) {
            this.left = left;
            this.write = write;
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
