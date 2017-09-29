package fr.cpe.jms.producer.impl;


import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Queue;
import javax.jms.JMSContent;

import fr.cpe.jms.producer.IHelloJmsProducer;

@Stateless
public class HelloJmsProducer implements IHelloJmsProducer {
	
	
	@Resource(name="java:/asi2-hello")
	private Queue queue;
	
	private JMSContent context;
	
	
	
	@Override
	public String sayHello(String name){
		context.createProducer()
		.send(queue,name);
	}

}
