package com.app.homefoodrestaurantapp.repository;

import com.app.homefoodrestaurantapp.model.Inventory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class InventoryRepository extends SimpleJpaRepository<Inventory, String> {
    private final EntityManager em;
    public InventoryRepository(EntityManager em) {
        super(Inventory.class, em);
        this.em = em;
    }
    @Override
    public List<Inventory> findAll() {
        return em.createNativeQuery("Select * from \"homefoodrestaurantapp\".\"Inventory\"", Inventory.class).getResultList();
    }
}