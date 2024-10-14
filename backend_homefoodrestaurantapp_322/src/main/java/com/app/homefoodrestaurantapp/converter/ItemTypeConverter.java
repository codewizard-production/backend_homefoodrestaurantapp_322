package com.app.homefoodrestaurantapp.converter;

import com.app.homefoodrestaurantapp.enums.ItemType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class ItemTypeConverter implements AttributeConverter<ItemType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ItemType itemType) {
        return itemType != null ? itemType.ordinal() : null;
    }

    @Override
    public ItemType convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return ItemType.getItemType(dbData);
    }
}
