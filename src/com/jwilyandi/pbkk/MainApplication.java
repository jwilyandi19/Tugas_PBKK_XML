package com.jwilyandi.pbkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("XML Example");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		//Inversion of Control
		Operation operationDiv =  context.getBean("divOp", Operation.class);
		DivOperation op1 = (DivOperation)operationDiv;
		System.out.println(op1.returnMessage());
		
		//DI Constructor Injection
		Operation operationMul =  context.getBean("mulOp", Operation.class);
		MulOperation op2 = (MulOperation)operationMul;
		System.out.println(op2.returnMessage() + ' ' +
				op2.getMessage().returnMessage());
		
		//DI Setter Injection
		Operation operationAdd =  context.getBean("addOp", Operation.class);
		AddOperation op3 = (AddOperation)operationAdd;
		System.out.println(op3.returnMessage() + ' ' +
				op3.getMessage().returnMessage());
		
		//IoC With Properties
		Operation operationSub =  context.getBean("subOp", Operation.class);
		SubOperation op4 = (SubOperation)operationSub;
		System.out.println(op4.returnMessage());
		
		context.close();
	}
}
