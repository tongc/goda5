package com.goda5.hagendaz.common.util;

import java.lang.reflect.Field;
import java.util.Collection;

public class DiscrepancyFinder <T> {
	public void hasDiscrepancy(Class<?> clazz, Collection<T> values, String... fieldsToNavigate) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Object fieldValue = null;
		for(Object value:values) {
			for(String fieldStr:fieldsToNavigate) {
				Field field = clazz.getDeclaredField(fieldStr);
				field.setAccessible(true);
				if(fieldValue == null) {
					fieldValue = field.get(value);
				} else {
					if(!fieldValue.equals(field.get(value))) {
						throw new IllegalAccessException("fieldValue is " + fieldValue + " actualValue is " + field.get(value));
					}
				}
			}
		}
	}
}
