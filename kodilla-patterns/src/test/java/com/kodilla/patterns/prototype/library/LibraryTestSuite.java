package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Library");
        for (int n = 0; n < 5; n++) {
            library.getBooks().add(new Book("Title" + n, "Author" + n,
                    LocalDate.of(2020 - n, 1 + n, 1 + n)));
        }

        //Shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Library
        System.out.println(library.getName());
        library.getBooks().stream()
                .forEach(x -> System.out.println(x));

        //Shallow Library
        System.out.println(shallowClonedLibrary.getName());
        shallowClonedLibrary.getBooks().stream()
                .forEach(x -> System.out.println(x));

        //Deep Library
        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks()
                .forEach(System.out::println);

        Book b = new Book("Title" + 0, "Author" + 0,
                LocalDate.of(2020, 1, 1));
        System.out.println(library.getBooks().size());
        library.getBooks().remove(b);
        System.out.println(library.getBooks().size());

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}