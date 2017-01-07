package services;

import org.springframework.aop.ThrowsAdvice;

public class LogINExceptionService implements ThrowsAdvice{

	/*
	public void afterThrowing(Exception ex)
	public void afterThrowing(RemoteException)
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
	public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)*/
//	It wont force us to ovveride any of these methods of this interface. FROM these we can write any method 
	public void afterThrowing(Exception e)
	{
		Log l=LogFactory.getLog(Bank.class);
		l.info("incase of exception this executes");
	}
}
