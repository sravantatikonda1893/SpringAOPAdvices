package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import buisness.Bank;
import services.LogBeforeService;

public class Client {
	public static void main(String args[])
	//create the target(Buisness)
	Bank b=new Bank();
	//create a service(here, logging service)
	LogINExceptionService lex=new LogINExceptionService();
	//	create a proxy and add service+buisness
	ProxyFactoryBean pfb=new ProxyFactoryBean();
	pfb.setTarget(b);
	pfb.addAdvice(lex);
	//	Get generated proxy object
	Bank bProxy=(Bank)pfb.getObject();
	int amount =bProxy.deposit("sbi123", 5000);
	System.out.println(amount);
}
}
 