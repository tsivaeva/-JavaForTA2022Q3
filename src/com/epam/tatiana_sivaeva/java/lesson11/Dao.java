package com.epam.tatiana_sivaeva.java.lesson11;

import java.util.List;

public interface Dao<T> {
    T get(int id);

    T get(int id, String city);

    List<T> getall();

    void add(T object);

    void add();
}
