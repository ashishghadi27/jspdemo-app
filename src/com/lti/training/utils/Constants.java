package com.lti.training.utils;


public class Constants {

	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String USERNAME = "system";
	public static final String PASSWORD = "27Dec1998";
	public static final String DB_NAME = "orcl";
	public static final String DOMAIN = "@localhost:1521";
	public static final String DRIVER_ADDRESS = String.format("jdbc:oracle:thin:%s:%s", DOMAIN,DB_NAME);
	public static final String TABLE_NAME = "student";
	
}

