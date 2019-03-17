package com.jwilyandi.pbkk;

import org.springframework.cglib.transform.AbstractClassFilterTransformer;

public class DivOperation implements Operation {
	private int num1;
	private int num2;
	public DivOperation(int num1,int num2) {
		
	}
	
	public void setDivOperation(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int operate() {
		int ans;
		ans = this.num1 / this.num2;
		return ans;
	}
	
}
