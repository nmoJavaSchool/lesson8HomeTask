package ru.sbertech.buildtools;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Float[] f1 = new Float[]{1.4f, 3.6f, 0.6f};
        WorkIterator<?> witer = new WorkIterator<Object>(f1);
        witer.printAllElements();

        /*String[] s1 = new String[]{"hasNext", "next", "remove"};
        col = new MyCollection<String>(s1);
        it = col.iterator();
        while(it.hasNext())
            System.out.println(it.next());*/
    }
}
