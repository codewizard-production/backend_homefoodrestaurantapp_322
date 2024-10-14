package com.app.homefoodrestaurantapp.function;

import com.app.homefoodrestaurantapp.model.Document;
import com.app.homefoodrestaurantapp.model.OperatingSupplies;
import com.app.homefoodrestaurantapp.model.Vendor;
import com.app.homefoodrestaurantapp.model.OrderAlert;
import com.app.homefoodrestaurantapp.model.Inventory;
import com.app.homefoodrestaurantapp.model.PurchaseOrder;
import com.app.homefoodrestaurantapp.model.Restuarant;




import com.app.homefoodrestaurantapp.enums.ItemType;
import com.app.homefoodrestaurantapp.converter.ItemTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  