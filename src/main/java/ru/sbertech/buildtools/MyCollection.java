package ru.sbertech.buildtools;

import java.util.Iterator;

/**
 * Created by MВидео on 08.08.2016.
 */
public class MyCollection<T> implements Iterable<T> {

    public T[] collection;
    public int collection_size;

    public MyCollection(T[] _collection){
        this.collection = _collection;
        this.collection_size = _collection.length;
    }

    public Iterator<T> iterator(){
        Iterator<T> iter = new Iterator<T>() {

            private int counter = 0;

            public boolean hasNext() {
                return (counter < collection_size && collection[counter] != null);
            }

            public T next() {
                T elem = collection[counter];
                counter++;
                return elem;
            }

            public void remove(){
            }

        };
        return iter;
    }
}
