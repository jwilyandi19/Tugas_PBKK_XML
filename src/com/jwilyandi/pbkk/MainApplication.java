package com.jwilyandi.pbkk;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
			
			
			
			
		}
		scanner.close();
		
		
		
	}
	

}
