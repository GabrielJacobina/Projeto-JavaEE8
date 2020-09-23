package com.projeto.controller;

import com.projeto.dao.UserDAO;
import com.projeto.model.User;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Initialized;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class TesteController implements Serializable {

    private static final long serialVersionUID = 1L;

    private User user;
    private List<User> users;

    @Inject
    private UserDAO userDAO;

    @PostConstruct
    public void init(){
        this.user = new User();
        this.users = this.userDAO.getAllUser();
        System.out.println("Rodou");
    }

    public String teste(){
        System.out.println("Controller funcionando");
        this.user = userDAO.getUser(1);
        return "Tudo certo";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
