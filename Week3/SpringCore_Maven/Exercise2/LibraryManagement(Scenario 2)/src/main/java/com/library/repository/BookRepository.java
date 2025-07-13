package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> fetchBookList() {
        return Arrays.asList("Effective Java", "Clean Code", "Spring in Action");
    }
}
