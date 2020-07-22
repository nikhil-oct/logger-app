package com.xworkz.logger.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.logger.service.LoggerService;

@org.springframework.stereotype.Controller
public class Controller {
	
	private static final Logger log = Logger.getLogger(Controller.class.getName());
	
	@Autowired
	private LoggerService service;
	
	public Controller() {
		System.out.println("Created "+this.getClass().getSimpleName());
		log.info("LOGGER :: Created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/click")
	public String byClick(@RequestParam String username,@RequestParam String email,@RequestParam String subject,Model model) {
		System.out.println("Invoked Click Method");
		log.info("LOGGER :: Invoked Click Method ");
		try {
			model.addAttribute("name","UserName  : " +username);
			model.addAttribute("email","Email Id : "+email);
			model.addAttribute("subject","Subject is : " +subject);
			service.greetMessage();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			e.printStackTrace();
		}
		
		System.out.println("Calling success.jsp");
		log.info("LOGGER :: Calling success.jsp");
		return "success.jsp";

	}
}
