package fr.cpe.jms.producer;

import javax.ejb.Local;

@Local
public interface IHelloJmsProducer {
	String sayHello(String name);
}
