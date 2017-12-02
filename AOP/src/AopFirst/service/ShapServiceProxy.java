package AopFirst.service;

import AopFirst.aspect.Loginaspect;
import AopFirst.model.Circle;

public class ShapServiceProxy extends ShapeService {
	
	public Circle getCircle() {
		
		new Loginaspect().LogginAdvice();
		return super.getCircle();
	}

}
