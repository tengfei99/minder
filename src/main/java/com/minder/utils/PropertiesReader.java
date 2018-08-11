package com.minder.utils;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 读取properties内容并转换成map形式
 * 
 * @author Lee
 *
 */
public class PropertiesReader {

	public Map<String, String> getProperties(String propertiesFile) {
		Properties props = new Properties();
		Map<String, String> map = new HashMap<String, String>();
		try {
			InputStream in = getClass().getResourceAsStream(propertiesFile);
			props.load(in);
			Enumeration<?> en = props.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				String property = props.getProperty(key);
				map.put(key, property);
				// System.out.println(key + "=" + property);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return map;
	}

	public static void main(String[] args) {

		PropertiesReader res = new PropertiesReader();

		Map<String, String> map = new HashMap<String, String>();

		map = res.getProperties("/url.properties");

		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}

}
