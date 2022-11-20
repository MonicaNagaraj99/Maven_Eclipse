package com.projectsconcepts;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Factorydesign_logger {

	public static Logger log = Logger.getLogger(Factorydesign_logger.class);
	
	public static void main(String[] args) {
		
//		BasicConfigurator.configure();
//		log.debug("--debug--");
//		log.fatal("--fatal--");
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("--info--");
		log.warn("--warn--");
		log.fatal("---fatal---");
	}
}
