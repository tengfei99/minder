package com.minder.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * 获取文件内容进行分析
 * @author Lee
 *
 */
public class GetPrice {

	public static void main(String[] args) {
		
		GetFileContent gfc = new GetFileContent();
		
		String htm = gfc.getHtml("resources/res.html");
		
		Document doc = Jsoup.parse(htm);
			
		Elements content1 = doc.getElementsByClass("price display-inline-block arrange-fit price price--stylized");
		Elements content2 = content1.select(".price-group");
		String price = content2.attr("aria-label");
		
		System.out.println(price);
		

		

	}

}
