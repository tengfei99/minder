package com.minder.html;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 获取文件内容输出
 * @author Lee
 *
 */
public class GetFileContent {

	public String getHtml(String url) {

		StringBuffer sb = new StringBuffer();

		try {

			FileReader f = new FileReader(url);

			BufferedReader buffer1 = new BufferedReader(f);
			String tempString = null;

			while ((tempString = buffer1.readLine()) != null) {

				sb = sb.append(tempString);
			}

			buffer1.close();
			f.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		GetFileContent res = new GetFileContent();
		
		String out  = res.getHtml("resources/res.html");
		
		System.out.println(out);
	}

}
