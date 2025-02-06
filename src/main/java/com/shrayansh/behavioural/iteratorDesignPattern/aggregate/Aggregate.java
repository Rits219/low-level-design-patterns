package com.shrayansh.behavioural.iteratorDesignPattern.aggregate;

import com.shrayansh.behavioural.iteratorDesignPattern.iterator.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
