package fr.cpe;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ICalcul {

	double add(List<Double> a );
}
