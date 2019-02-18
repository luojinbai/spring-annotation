package com.yibai.spring.annotation.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorAspect {

	public CalculatorAspect() {
	}

	@Pointcut(value = "execution(public int com.yibai.spring.annotation.aop.Calculator.*(..))")
	public void pointCutCalculator() {
	}

	@Before("pointCutCalculator()")
	public void before(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String methodName = joinPoint.getSignature().getName();
		System.out.println("@Before ... 方法名： " + methodName + ", 方法参数： " + Arrays.asList(args));
	}

	@After("pointCutCalculator()")
	public void after(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String methodName = joinPoint.getSignature().getName();
		System.out.println("@After ... 方法名： " + methodName + ", 方法参数： " + Arrays.asList(args));
	}

	// returning: 接收返回值
	@AfterReturning(value = "pointCutCalculator()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		Object[] args = joinPoint.getArgs();
		String methodName = joinPoint.getSignature().getName();
		System.out.println(
				"@AfterReturning ... 方法名： " + methodName + ", 方法参数： " + Arrays.asList(args) + ", 正常返回值： " + result);
	}

	// throwing: 接收异常信息
	@AfterThrowing(value = "pointCutCalculator()", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Exception e) {
		Object[] args = joinPoint.getArgs();
		String methodName = joinPoint.getSignature().getName();
		System.out.println("@AfterThrowing ... 方法名： " + methodName + ", 方法参数： " + Arrays.asList(args) + ", 异常信息： " + e);
	}

}
