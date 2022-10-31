package com.vti.entity;

public class Contact {
    private String phone;
    private String name;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                '}';
    }
}
