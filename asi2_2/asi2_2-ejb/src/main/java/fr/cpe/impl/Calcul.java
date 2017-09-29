package fr.cpe.impl;

import java.util.List;

import javax.ejb.Stateless;

import org.jboss.logging.Logger;

import fr.cpe.ICalcul;

@Stateless
public class Calcul implements ICalcul {

	Logger logger = Logger.getLogger(Calcul.class.getName());
	
	@Override
	public double add(List<Double> a)
	{
		
		logger.info(">>> add()  "+ a);
		
/*		int result=0;
		for(Double item : a) 
		{
			result+=item;
		}
		return result;
*/		
		return a.stream().mapToDouble(Double::doubleValue).sum();
		
	}
	
}
