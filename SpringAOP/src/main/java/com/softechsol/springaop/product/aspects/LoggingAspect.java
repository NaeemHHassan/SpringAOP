package com.softechsol.springaop.product.aspects;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.softechsol.springaop.product.ProductServiceImplementation.multiply(..))")
	public void logBefore(JoinPoint jp) {
		System.out.println("Before Multiply");
	}

	@After("execution(* com.softechsol.springaop.product.ProductServiceImplementation.multiply(..))")
	public void logAfter(JoinPoint jp) {
		System.out.println("After Multiply");
	}

}
