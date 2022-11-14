package entity;

public class MyMap<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMap() {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
