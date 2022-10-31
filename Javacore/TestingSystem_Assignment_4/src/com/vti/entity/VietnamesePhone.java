package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnamesePhone extends Phone {
    public List<Contact> contacts;//null
    public Scanner sc;

    public VietnamesePhone() {
        contacts = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        System.out.println("them thanh cong");

    }

    @Override
    public void removeContact(String name) {
        if (contacts.removeIf(contact -> contact.getName().equals(name))){
            System.out.println("Xoa thanh cong");
        }else {
            System.out.println("Xoa ko thanh cong");
        }


    }

    @Override
    public void updateContact(String name, String newPhone) {
        boolean ktra= false;
        for (Contact contact: contacts) {
            if(contact.getName().equals(name)){
                contact.setphone(newPhone);
                ktra= true;
            }
        }
        if (ktra==true)
            System.out.println("cap nhat thanh cong");
        else
            System.out.println("cap nhat ko thanh cong");


    }

    @Override
    public void searchContact(String name) {
        boolean ktra= false;
        for (Contact contact : contacts) {
            if(contact.getName().equals(name)){
                System.out.println(contact);
                ktra= true;
            }
        }
        if (ktra==false){
            System.out.println("khong co thong tin");
        }
    }
}
