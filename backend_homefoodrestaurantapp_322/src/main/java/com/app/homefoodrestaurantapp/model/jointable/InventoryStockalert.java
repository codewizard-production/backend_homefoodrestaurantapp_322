package com.app.homefoodrestaurantapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.homefoodrestaurantapp.model.Document;
import com.app.homefoodrestaurantapp.model.OperatingSupplies;
import com.app.homefoodrestaurantapp.model.Vendor;
import com.app.homefoodrestaurantapp.model.OrderAlert;
import com.app.homefoodrestaurantapp.model.Inventory;
import com.app.homefoodrestaurantapp.model.PurchaseOrder;
import com.app.homefoodrestaurantapp.model.Restuarant;
import com.app.homefoodrestaurantapp.enums.ItemType;
import com.app.homefoodrestaurantapp.converter.ItemTypeConverter;

@Entity(name = "InventoryStockalert")
@Table(schema = "\"homefoodrestaurantapp\"", name = "\"InventoryStockalert\"")
@Data
public class InventoryStockalert{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InventoryId\"")
	private String inventoryId;

    
    @Column(name = "\"OrderAlertId\"")
    private Integer orderAlertId;
 
}