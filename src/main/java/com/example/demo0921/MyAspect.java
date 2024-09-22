package com.example.demo0921;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	
//    @Before("execution(* com.example.demo.HpPrinter.*(..))")
//	public void before() {
//		
//		System.out.println("I am before");
//	}
//    
//    @After("execution(* com.example.demo.HpPrinter.*(..))")
//    public void after() {
//    	System.out.println("I am after");
//    }
	@Around("execution(* com.example.demo.HpPrinter.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("I am before");
		//������J�I��k
		Object obj = pjp.proceed();
		System.out.println("I am after");
		return obj;
	}
}
