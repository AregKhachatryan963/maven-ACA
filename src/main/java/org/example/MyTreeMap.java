package org.example;

public class MyTreeMap<K extends Comparable<K>, V> {
    K key;
    V value;
    Node<K, V> root = new Node<>(null, null, null, null);
    Node<K, V> tempNode = new Node<>(null, null, null, null);


    public void put(K key, V value) {
        if (root.getKey() == null) {
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
            if (node.left == null) {
                node.left = new Node<>(key, value, null, null);
                return;
            }
            putRecurs(key, value, node.left);
        }
        if (key.compareTo(node.getKey()) > 0) {
            if (node.write == null) {
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
        System.out.println();
    }

    private void printRecurs(Node<K, V> node) {
        if (node == null) {
            return;
        }
        printRecurs(node.left);
        System.out.print(node.getKey() + ", ");
        printRecurs(node.write);
    }

    public void remove(K key) {
        if (root == null) {
            return;
        }
        remove(key, root);
    }

    private Node<K, V> remove(K key, Node<K, V> node) {
        if(node == null){
            return null;
        }
        if (node.left == null && node.write == null) {
            return null;
        }
        if (key.compareTo(node.getKey()) < 0) {
            node.left = remove(key, node.left);
        }
        if (key.compareTo(node.getKey()) > 0) {
            node.write = remove(key, node.write);
        }
        if (key.compareTo(node.getKey()) == 0) {
            if (node.write != null && node.left == null) {
                return node.write;
            }
            if (node.left != null && node.write == null) {
                return node.left;
            } else {
                tempNode = find(node.write);
                node.setKey(tempNode.getKey());
                node.setValue(tempNode.getValue());
                node.write = remove(key, tempNode);
            }
        }
        return node;
    }

    private Node<K, V> find(Node<K, V> node) {
        if(node.left != null){
            find(node.left);
        }
        return node;
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
