package com.logos.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class UseDB {

	private Properties prop = new Properties();
	private String url;
	private InputStream in;
	private Connection con;
	private Statement query; 
	private ResultSet res;

	public UseDB() {
		prop = new Properties();
		in = UseDB.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			connect();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean connect() {
		try {
			prop.load(in);
			url = prop.getProperty("url");
			return true;
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}
 
	

}
