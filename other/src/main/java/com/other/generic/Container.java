package com.other.generic;

/**
 * Created by Administrator on 2016/5/3.
 */
public class Container<K, V> {

    private K key;
    private V value;

    public Container(K key, V value) {
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
