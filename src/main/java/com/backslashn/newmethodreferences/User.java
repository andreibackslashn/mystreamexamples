package com.backslashn.newmethodreferences;

public class User {
    private String name;
    private String address;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public static Boolean isRealUser(User user) {
        return true;
    }

    public boolean isLegalName(User user) {
        return user.getName().length() > 3 && user.getName().length() < 16;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
