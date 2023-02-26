package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> worldStates = new ArrayList<String>();
        worldStates.add("germany");
        worldStates.add("russia");
        worldStates.add("japan");
        worldStates.add("china");

        ArrayList<String> worldStates1 = new ArrayList<String>();
        worldStates1.add("-----------");
        worldStates1.add("africa");
        worldStates1.add("usa");
        worldStates1.add("canada");
        worldStates1.add("cuba");

        Iterator<String> iterator1 = worldStates.iterator();
        Iterator<String> iterator2 = worldStates1.iterator();

        DoubleIterator<String> doubleIterator = new DoubleIterator<String>(iterator1, iterator2);

        while (doubleIterator.hasNext()) {
            String element = doubleIterator.next();
            System.out.println(element);
        }
    }
}

class DoubleIterator<T> implements Iterator<T> {
    private Iterator<T> iterator1;
    private Iterator<T> iterator2;

    public DoubleIterator(Iterator<T> iterator1, Iterator<T> iterator2) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
    }
    public boolean hasNext() {
        while (iterator1.hasNext()) return true;
        while (iterator2.hasNext()) return true;
        return false;
    }
    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        while (iterator1.hasNext()){
            return iterator1.next();}
        while (iterator2.hasNext()){
            return iterator2.next();}
        return null;
    }
}
