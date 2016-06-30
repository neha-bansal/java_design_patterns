package com.java.pattern.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		
		shape = shapeFactory.getShape("rectangle");
		shape.draw();
		
		shape = shapeFactory.getShape("Square");
		shape.draw();
	}

}
