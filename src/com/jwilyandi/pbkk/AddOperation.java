package com.jwilyandi.pbkk;

public class AddOperation implements Operation{
	private int num1;
	private int num2;
	private Message addMessage;
	public AddOperation(int num1,int num2,Message message) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.addMessage = message;
	}
	
	public AddOperation(Message message) {
		super();
		this.addMessage = message;
	}
	
	public AddOperation() {
		super();
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
	}

	public int operate() {
		return this.num1 + this.num2;
	}
	
	public void setMessage(Message message) {
		this.addMessage = message;
	}
	
	public Message getMessage() {
		return addMessage;
	}
	
	public String returnMessage() {
		return Integer.toString(num1) + "+" + Integer.toString(num2) + "="
				+ Integer.toString(operate());
	}
	
	
}
