package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class LibraryImplTest {

    @BeforeEach
    void setup(){
        LibraryImpl testLibrary = new LibraryImpl();
    }

    @AfterEach
    void tearDown(){
        LibraryImpl testLibrary = null;
    }

    @org.junit.jupiter.api.Test
    void addClient() {
        //given

        //when

        //then

    }

    @org.junit.jupiter.api.Test
    void removeClient() {

    }

    @org.junit.jupiter.api.Test
    void addBook() {

    }

    @org.junit.jupiter.api.Test
    void removeBook() {

    }

    @org.junit.jupiter.api.Test
    void addBookToClient() {

    }

    @org.junit.jupiter.api.Test
    void removeBookFromClient() {

    }
}