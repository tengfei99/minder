package com.minder.mail;

import java.io.IOException;
import java.util.Properties;

import com.minder.html.GetUrlFromFile;

public class mail {
	
	try {
		Properties mailprop = new Properties();
		mailprop
				.load(GetUrlFromFile.class.getResourceAsStream("url.properties"));

		from = mailprop.getProperty("From");

		to = mailprop.getProperty("To");

		server = mailprop.getProperty("SMTPHost");

	
	} catch (IOException ioe) {
		Log.error("SSQMail read log4j.properties file error!");
	}

}
