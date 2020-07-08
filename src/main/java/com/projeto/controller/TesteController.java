package com.projeto.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteController {

    public String teste(){
        System.out.println("Controller funcionando");
        return "Tudo certo";
    }
}
