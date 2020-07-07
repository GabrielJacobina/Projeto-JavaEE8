package com.projeto.controller;

import javax.inject.Named;

@Named
public class TesteController {
    public String getTeste(){
        System.out.println("Controller funcionando");
        return "Tudo certo";
    }
}
