package com.xworkz.logger.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.xworkz.logger.controller.Controller;

@Service
public class LoggerServiceImpl implements LoggerService{
	
	private static final Logger log = Logger.getLogger(Controller.class.getName());

	
	public LoggerServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
		log.info("LOGGER :: CREATED"+this.getClass().getSimpleName());
	}

	public void greetMessage() {
		System.out.println("Invoked getMessage Method");
		log.info("Logger :: Invoked getMessage Method");
	}

}
