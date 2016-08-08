package ru.sbertech.buildtools;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MВидео on 08.08.2016.
 */
public class WorkIteratorTest {
    @Test
    public void GetElem() throws Exception {
        Long[] numbers = new Long[]{1l,2l,3l,4l,5l};
        WorkIterator<?> witer = new WorkIterator<Object>(numbers);
        Long obj = (Long)witer.GetElem(1);
        assertEquals(3l, (long)obj);
    }

}