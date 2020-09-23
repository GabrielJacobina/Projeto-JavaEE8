package com.projeto.util.jpa;

import org.hibernate.Session;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

    private EntityManagerFactory factory;

    public EntityManagerProducer() {
        this.factory = Persistence.createEntityManagerFactory("usuariosPU");
    }

    @Produces
    @RequestScoped
    public Session createEntityManager() {
        return (Session) factory.createEntityManager();
    }

    public void close(@Disposes Session manager){
        manager.close();
    }
}
