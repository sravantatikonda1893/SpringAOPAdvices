package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import buisness.Bank;
import services.LogBeforeService;

public class Client {
	public static void main(String args[]){


		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/test.xml");
		Bank bProxy=	(Bank)cap.getBean("proxy");

		int amount =bProxy.deposit("sbi123", 5000);
		System.out.println(amount);
		cap.close();
	}
}
