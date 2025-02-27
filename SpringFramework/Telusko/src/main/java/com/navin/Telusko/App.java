package com.navin.Telusko;
 
 import org.springframework.context.ApplicationContext;
 /**
  * Hello world!
  * 
  */
 public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car obj = (Car)context.getBean("car");
		obj.drive();

	}
}