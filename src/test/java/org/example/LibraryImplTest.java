package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    LibraryImpl testLibrary = new LibraryImpl();

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
        testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then
        assertEquals(1, testLibrary.clients.size());
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