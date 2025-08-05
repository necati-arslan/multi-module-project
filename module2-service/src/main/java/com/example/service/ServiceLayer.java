package com.example.service;

import com.example.repository.CommonRepository;

public class ServiceLayer {
    private final CommonRepository repository = new CommonRepository();

    public String process() {
        return "Service processed: " + repository.getData();
    }
}
