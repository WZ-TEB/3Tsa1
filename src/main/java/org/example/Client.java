package org.example;

import java.util.UUID;

public class Client {
    private String name;
    private String email;
    private String lastName;
    private String clientId;

    public Client(String name, String lastName, String email, String clientId) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.clientId = UUID.randomUUID().toString();
    }



}