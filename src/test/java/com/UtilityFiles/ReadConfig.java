package com.UtilityFiles;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	String path = System.getProperty("user.dir")+"\\Cofiguration\\config.properties";
	
	Properties prop;
	public ReadConfig() {
		
		prop = new Properties();
		try {
		FileInputStream FIS = new FileInputStream(path);
		prop.load(FIS);
		}
		catch(Exception e ){
			e.printStackTrace();
		}
	}
		public String BaseURL() {
			String url = prop.getProperty("url");
			return url;
		}
		
		public String BrowserVal() {
			String BroVal = prop.getProperty("browser");
			return BroVal;
		}
		
		public String uname() {
			String uname = prop.getProperty("uname");
			return uname;
		}
		
		public String passw() {
			String passw = prop.getProperty("passw");
			return passw;
		}
	}
	
	
	

