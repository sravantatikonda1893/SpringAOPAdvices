package services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class c) 
	{
	String methodName=m.getName();
if(methodName.equals("deposit"))
	return true;
else
		return false;
	}

}
