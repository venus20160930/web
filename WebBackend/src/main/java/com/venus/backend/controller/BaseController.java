package com.venus.backend.controller;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseController {

	protected Object toObject(Object src, Class dest) {

		Object result = null;
		try {

			if (src != null) {

				Class<?> srcClass = src.getClass().getSuperclass();

				result = dest.newInstance();
				Field[] destProp = dest.getSuperclass().getDeclaredFields();

				for (Field property : destProp) {

					property.setAccessible(true);
					try {
						
						Method method = srcClass.getDeclaredMethod(StringUtils.join("get", StringUtils.capitalize(property.getName())));

						if (method != null) {

							if (String.class.isAssignableFrom(property.getType())) {
								
								property.set(result, StringUtils.trim((String) method.invoke(src)));
							} else {
								
								property.set(result, method.invoke(src));
							}
						}
					} catch (NoSuchMethodException e) {
						
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
	}
}
