/**
 * 
 */
package com.pramod.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pramod.common.service.OrderService;

/**
 * @author kkpramod
 *
 */
public class App {
	
	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");
		OrderService orderService = context.getBean(OrderService.class);
		System.out.println("Done");
	}
	
}