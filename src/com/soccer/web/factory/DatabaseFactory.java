package com.soccer.web.factory;

public class DatabaseFactory {
	
	public static Database createDatabase(String vendor) {
		
		Database db = null;
				
		switch(vendor) {
		case "oracle":
			db = new Oracle();
			break;
		case "mariadb":
			break;
		case "mysql":
			break;
		case "h2":
			break;
		case "db2":
			break;
		}
		
		return db;
		
	}
}
