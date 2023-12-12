package org.example;

public class MyTreeMap<K extends Comparable<K>, V extends Comparable<V>> {

    Node<K, V> root = new Node<>(null, null);
    K key;
    V value;

    public void put(K key, V value) {
        if (root.getKey() == null) {
            this.key = key;
            this.value = value;
            root.setKey(key);
            root.setValue(value);
            putRecurs(root);
        }
    }

    public void putRecurs(Node<K, V> node) {
        if (key.compareTo(node.getKey()) == 0) {
            return;
        }
        if (key.compareTo(node.getKey()) < 0) {
            if (node.left != null) {
                putRecurs(node.left);
            }
            node.left = new Node<>(null, null);
            node.left.setKey(key);
            node.left.setValue(value);
            return;
        }
        if(key.compareTo(node.getKey())>0){
            if(node.write != null){
                putRecurs(node.write);
            }
            node.left = new Node<>(null, null);
            node.write.setKey(key);
            node.write.setValue(value);
        }
    }



    class Node<K extends Comparable<K>, V extends Comparable<V>> {
        private Node<K, V> left;
        private Node<K, V> write;
        private K key;
        private V value;

        public Node(Node<K, V> left, Node<K, V> write) {
            this.left = left;
            this.write = write;
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
