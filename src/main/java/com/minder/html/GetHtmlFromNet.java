package com.minder.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetHtmlFromNet {

	/**
	 * 输入商品URL获取商品价格
	 * 
	 * @param url
	 * @return
	 */
	public double getPrice(String url) {
		double price = 0;
		String sprice = null;

		try {
			Document doc = Jsoup.connect(url).get();

			Elements content1 = doc.getElementsByClass("price display-inline-block arrange-fit price price--stylized");
			Elements content2 = content1.select(".price-group");
			sprice = content2.attr("aria-label").trim();

			//System.out.println(sprice);

			sprice = sprice.substring(1, sprice.length());
			price = java.lang.Double.parseDouble(sprice);

		} catch (Exception e) {

		}

		return price;
	}

	public static void main(String[] args) {

		String url = "https://www.walmart.com/ip/HP-15-da053wm-15-6-Touch-Laptop-Windows-10-Home-Intel-Core-i5-8250U-Processor-4GB-SDRAM-Memory-16GB-IntelOptane-Memory-1TB-Hard-Drive-DVD-Natural-Sil/700792078?findingMethod=wpa&tgtp=1&cmp=13261&relRank=1&tax=3944_3951_1089430_1230091_132960&pt=ip&adgrp=14215&bt=1&plmt=1x1_B-C-OG_TI_1-1_PDP-Buybox&wpa_qs=NZgQMPUnu-A0NBhpEGXIA0kaCf0Xdw4-mgG-PlrYKaghMR8PbRjX0kTYBdqAYpM99qdfM5fZvBO8Q0g1XVeupw&bkt=heuristic&mLoc=top&pgid=56168562&isSlr=false&itemId=700792078&relUUID=2daf8e00-2f2b-48b9-89e1-41f3fb55acfb&adUid=70d3ed6b-5566-4d45-83ec-3c8c8dff0ac3&adiuuid=c4d19f86-e8a5-4f7d-ba11-68e7297cffa7&adpgm=wpa&pltfm=desktop";
		GetHtmlFromNet gjf = new GetHtmlFromNet();

		System.out.println(gjf.getPrice(url));

	}

}
