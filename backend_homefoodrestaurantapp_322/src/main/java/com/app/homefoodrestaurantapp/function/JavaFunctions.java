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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.homefoodrestaurantapp.repository.OrderAlertRepository;
import com.app.homefoodrestaurantapp.repository.RestuarantRepository;
import com.app.homefoodrestaurantapp.repository.PurchaseOrderRepository;
import com.app.homefoodrestaurantapp.repository.VendorRepository;
import com.app.homefoodrestaurantapp.repository.DocumentRepository;
import com.app.homefoodrestaurantapp.repository.OperatingSuppliesRepository;
import com.app.homefoodrestaurantapp.repository.InventoryRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
