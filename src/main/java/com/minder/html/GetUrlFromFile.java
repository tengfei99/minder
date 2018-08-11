package com.minder.html;

import java.util.HashMap;
import java.util.Map;

import com.minder.utils.PropertiesReader;

public class GetUrlFromFile {
	
	GetHtmlFromNet ghf = new GetHtmlFromNet();

	public void aa() {

		Map<String, String> map = new HashMap<String, String>();
		PropertiesReader pr = new PropertiesReader();
		map = pr.getProperties("/url.properties");

		for (String key : map.keySet()) {
			
			String value = map.get(key).trim();
			
			System.out.println(key + "=" + value);
			
			ghf.getPrice(url)
			
		}

	}

	public static void main(String[] args) {
		
		GetUrlFromFile gff = new GetUrlFromFile();
		gff.aa();

	}

}
