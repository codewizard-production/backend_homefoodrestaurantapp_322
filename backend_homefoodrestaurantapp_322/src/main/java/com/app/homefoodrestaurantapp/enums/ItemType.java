package com.app.homefoodrestaurantapp.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ItemType{
	    edible,
	    cleaning,
	    grooming; 
    public int value(ItemType itemType) {
        return itemType.ordinal();
    }
    public static ItemType getItemType(int ordinal) {
        for(ItemType itemType : ItemType.values())
                if(itemType.ordinal() == ordinal)
                        return itemType;
        return null;
    }
}


