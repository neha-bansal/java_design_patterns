package com.java.pattern.creational.factory;

public class FactoryDemo {

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
