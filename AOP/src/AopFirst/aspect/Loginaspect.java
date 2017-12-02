package AopFirst.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Loginaspect {

	
	@Around("allGetters()")
	public Object AroundMethod(ProceedingJoinPoint proceedingjointpoint) {
		
		Object around=null;
	
		try {
		System.out.println("Before Advice");
		around=proceedingjointpoint.proceed();
		System.out.println("After Advice");
	}catch(Throwable e) {
		System.out.println("Throwing Exception");
	} 
		System.out.println("After finall");
		return around;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}

	
	public void LogginAdvice() {
		System.out.println("Loggin in Advice");
		
	}
	
	
	
	
	
	
	
}
