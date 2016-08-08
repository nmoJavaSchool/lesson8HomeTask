package ru.sbertech.buildtools;

import java.util.Iterator;

/**
 * Created by MВидео on 08.08.2016.
 */
public class WorkIterator<T> {

    MyCollection<T> col;

    public WorkIterator(T[] array){
        this.col = new MyCollection<T>(array);
    }

    public void printAllElements(){
        Iterator<?> iter = col.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }

    public T GetElem(int index){
        int counter = 0;
        Iterator<?> iter = col.iterator();
        Object elem = null;
        while(counter <= index){
             elem = iter.next();
            counter++;
        }
        return (T)elem;

    }
}
