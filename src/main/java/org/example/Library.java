package org.example;

public interface Library {
    void addClient(Client client);
    void removeClient(String clientId);
    void addBook(Book book);
    void removeBook(String bookId);
    void addBookToClient(String clientId, String bookId);
    void removeBookFromClient(String clientId, String bookId);
}
