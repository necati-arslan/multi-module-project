package com.example.user;

import com.example.service.ServiceLayer;

public class UserApp {
    public static void main(String[] args) {
        ServiceLayer service = new ServiceLayer();
        System.out.println(service.process());
    }
}
