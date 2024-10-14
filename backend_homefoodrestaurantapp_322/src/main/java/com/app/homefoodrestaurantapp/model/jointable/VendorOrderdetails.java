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

@Entity(name = "VendorOrderdetails")
@Table(schema = "\"homefoodrestaurantapp\"", name = "\"VendorOrderdetails\"")
@Data
public class VendorOrderdetails{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"VendorID\"")
	private Integer vendorID;

    
    @Column(name = "\"PurchaseOrderId\"")
    private Integer purchaseOrderId;
 
}