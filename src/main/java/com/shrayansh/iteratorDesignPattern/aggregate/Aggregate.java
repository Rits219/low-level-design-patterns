package com.shrayansh.iteratorDesignPattern.aggregate;

import com.shrayansh.iteratorDesignPattern.iterator.Iterator;

public interface Aggregate {
    Iterator createIterator();
}
