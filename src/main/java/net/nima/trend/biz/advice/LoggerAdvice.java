/**
 * 
 */
package net.nima.trend.biz.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 定义一个通知，在目标对象被调用之前执行
 * 
 * @author Kevin Lee
 *
 */
public class LoggerAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
	
	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("在切面执行前执行...");
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("返回值为" + returnValue);
	}

}
