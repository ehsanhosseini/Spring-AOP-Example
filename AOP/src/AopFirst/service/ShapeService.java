package AopFirst.service;

import AopFirst.aspect.Logable;
import AopFirst.model.Circle;
import AopFirst.model.Triangle;

public class ShapeService {
	private Circle circle ;
	private Triangle triangle;
	
	@Logable
	public Circle getCircle() {
		System.out.println("This is Circle");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
