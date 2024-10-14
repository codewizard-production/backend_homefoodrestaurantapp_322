package com.app.homefoodrestaurantapp.repository;

import com.app.homefoodrestaurantapp.model.OperatingSupplies;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OperatingSuppliesRepository extends SimpleJpaRepository<OperatingSupplies, String> {
    private final EntityManager em;
    public OperatingSuppliesRepository(EntityManager em) {
        super(OperatingSupplies.class, em);
        this.em = em;
    }
    @Override
    public List<OperatingSupplies> findAll() {
        return em.createNativeQuery("Select * from \"homefoodrestaurantapp\".\"OperatingSupplies\"", OperatingSupplies.class).getResultList();
    }
}