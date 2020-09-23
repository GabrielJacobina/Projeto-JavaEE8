package com.projeto.dao;

import com.projeto.model.User;
import com.projeto.util.jpa.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class UserDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public User getUser(int id) {
        return manager.find(User.class, id);
    }

    public void saveUser(User user) {
        manager.merge(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> getAllUser(){
        Query query = manager.createQuery("SELECT e FROM User e");
        return (List<User>) query.getResultList();
    }

    @Transactional
    public void deleteUser(int id) throws Exception {
        User user = getUser(id);
        try {
            manager.remove(user);
            manager.flush();
        } catch (PersistenceException e) {
            throw new Exception("User não pode ser excluido");
        }
    }

    public void updateUser(User user){
        try {
            //User user1 = getUser(user.getId());
            manager.find(User.class, user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
