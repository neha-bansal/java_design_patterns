package com.java.pattern.creational.singleton;

public class SingleObjectDemo {

	public static void main(String[] args) {
		
//		SingleObject sin = new SingleObject();
		
		SingleObject.getInstance().showMessage();
	}
}
