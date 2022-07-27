package com.justin.webservice.springwebservice.service.oopSample.lsp.animal;

import org.springframework.stereotype.Service;

public abstract class Animal {

    protected String barkSound = "No Sound";

    public void bark(Animal animal){
        System.out.println(this.barkSound);
    }
}
