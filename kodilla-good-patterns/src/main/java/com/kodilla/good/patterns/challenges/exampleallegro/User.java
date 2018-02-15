package com.kodilla.good.patterns.challenges.exampleallegro;

public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public User(String userName, String firstName, String lastName, String telephoneNumber) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return userName + " - " + telephoneNumber;
    }
}
