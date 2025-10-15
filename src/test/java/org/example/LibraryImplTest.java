package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    LibraryImpl testLibrary;

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
        //given -> tutaj umieszczamy dane wstepne potrzebne do testu
        //when -> wywolujemy metode testowana
        String clientId = testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then -> assert na podstawie ktorego oceniamy dzialanie testu, expected value wpisujemy z palca w assertEquals
        assertEquals(1, testLibrary.clients.size());
        assertTrue(testLibrary.clients.containsKey(clientId));
        assertNotNull(testLibrary.clients.keySet());
    }

    @org.junit.jupiter.api.Test
    void removeClient() {
        //given
        String clientId = testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then
        testLibrary.removeClient(clientId);
        //when
        assertEquals(0, testLibrary.clients.size());
        assertFalse(testLibrary.clients.containsKey(clientId));
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