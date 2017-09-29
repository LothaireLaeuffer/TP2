package fr.cpe.impl;

import java.util.List;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import fr.cpe.ICalcul;
import fr.cpe.ICalculRestService;

public class CalculRestService implements ICalculRestService{
	
	
	Logger logger = Logger.getLogger(CalculRestService.class.getName());
	
	@Inject
	private ICalcul calculService;
	
	@Override
	public Double add(List<Double> a){
		logger.info(">>> calcul()  " + a);
		
		return calculService.add(a);
	}
}
