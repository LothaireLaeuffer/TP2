package fr.cpe.impl;

import javax.ejb.Stateless;

import fr.cpe.IHello;

@Stateless
public class Hello implements IHello {
	
	@Override
	public String sayHello(String name){
		//return "Hello "+name;
		
		return "Hello " + ( name == null || name.length() <= 0 ? "world" : name);
	}
	
	
	
	

	
	
}
