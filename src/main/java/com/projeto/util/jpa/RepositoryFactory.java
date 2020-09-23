package com.projeto.util.jpa;

import com.projeto.dao.UserDAO;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
/*
public class RepositoryFactory {

    @Produces
    @SuppressWarnings("unchecked")
    public UserDAO createGenericRepository (InjectionPoint injection, EntityManager em) {
        ParameterizedType type = (ParameterizedType) injection.getType();
        Class clazz = (Class) type.getActualTypeArguments()[0];
        return new UserDAO(clazz, em);
    }
}*/
