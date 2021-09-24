package com.aca.homework.week7.listandsetassertion;

import java.util.Collection;

public class CollectionUtil {

    public static <T> boolean checkSize(final Collection<T> collection, final int size) {
        if (collection.size() != size) {
            throw new RuntimeException("Senc chexav");
        }
        return true;
    }
}
