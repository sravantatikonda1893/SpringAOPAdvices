package services;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import buisness.Bank;
public class LogBeforeService implements MethodBeforeAdvice {
	
	private void before(Method m, Object[] params, Object o)throws Throwable {
		Log l=LogFactory.getLog(Bank.class);
		l.info("deposit method");

	}
	
}
