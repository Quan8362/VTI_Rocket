package com.vti.entity;

import java.lang.reflect.Array;
import java.util.List;

public abstract class Phone {
//    public List<Contact> contacts;

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);

}
