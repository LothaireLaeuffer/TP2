package fr.cpe.impl;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import fr.cpe.IHello;
import fr.cpe.IHelloRestService;

public class HelloRestService implements IHelloRestService {

	Logger logger = Logger.getLogger(HelloRestService.class.getName());
	
	@Inject
	private IHello helloService;
	
	@Override
	public String hello(String name){
		logger.info(">>> hello()");
		
		return helloService.sayHello(name);
	}
}