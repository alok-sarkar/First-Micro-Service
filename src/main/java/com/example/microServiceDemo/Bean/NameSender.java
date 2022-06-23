package com.example.microServiceDemo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("first-microservice-demo")
public class NameSender {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public NameSender() {
    }

    public NameSender(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
