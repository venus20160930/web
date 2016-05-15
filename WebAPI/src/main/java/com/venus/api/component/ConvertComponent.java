package com.venus.api.component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class ConvertComponent<T> {

	public T toObject(Object src, Class<T> dest) {

		T result = null;
		try {

			if (src != null) {

				Class<?> srcClass = src.getClass();

				result = dest.newInstance();
				Field[] destProp = dest.getDeclaredFields();

				for (Field property : destProp) {

					property.setAccessible(true);
					
					try {
						
						Method method = srcClass.getDeclaredMethod(StringUtils.join("get", 
								StringUtils.capitalize(property.getName())));

						if (method != null) {

							if (String.class.isAssignableFrom(property.getType())) {
								
								property.set(result, StringUtils.trim((String) method.invoke(src)));
							} else {
								
								property.set(result, method.invoke(src));
							}
						}
					} catch (NoSuchMethodException e) {
						
						// to be continue
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
	}

	public List<T> toList(List src, Class<T> dest) {

		Object destObj = null;
		List<T> result = new ArrayList<T>();

		try {

			for (Object obj : src) {

				result.add(toObject(obj, dest));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;
	}
}
