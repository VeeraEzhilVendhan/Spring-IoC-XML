package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp 
{
	public static void main(String[] args) 
	{		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach=context.getBean("footballcoach",Coach.class);
		Coach coach2=context.getBean("baseballcoach",Coach.class);
		
		//call methods on the bean
		String instrc=coach.getDailyWorkout();
		System.out.println(instrc);
		String instrc2=coach2.getDailyWorkout();
		System.out.println(instrc2);

		//close context
		context.close();
	}

}
