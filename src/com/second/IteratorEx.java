package com.second;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> bio = new LinkedList<>();
        bio.add("dog");
        bio.add("cat");
        bio.add("man");
        bio.add("ant");

        Iterator<String> it = bio.iterator();
        ListIterator<String> lit = bio.listIterator(bio.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(bio);

    }
}
