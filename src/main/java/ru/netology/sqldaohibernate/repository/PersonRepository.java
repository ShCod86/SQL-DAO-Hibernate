package ru.netology.sqldaohibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.sqldaohibernate.entity.Person;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        return entityManager.createQuery("select p from Person p where lower(p.city) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
