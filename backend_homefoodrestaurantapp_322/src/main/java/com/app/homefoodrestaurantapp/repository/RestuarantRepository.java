package com.app.homefoodrestaurantapp.repository;

import com.app.homefoodrestaurantapp.model.Restuarant;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RestuarantRepository extends SimpleJpaRepository<Restuarant, String> {
    private final EntityManager em;
    public RestuarantRepository(EntityManager em) {
        super(Restuarant.class, em);
        this.em = em;
    }
    @Override
    public List<Restuarant> findAll() {
        return em.createNativeQuery("Select * from \"homefoodrestaurantapp\".\"Restuarant\"", Restuarant.class).getResultList();
    }
}