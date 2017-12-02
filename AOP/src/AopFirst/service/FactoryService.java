package AopFirst.service;

import AopFirst.model.Circle;
import AopFirst.model.Triangle;

public class FactoryService {
	
	public Object getBean(String typeBean) {

		if(typeBean.equals("shap")) 
			return new ShapServiceProxy();
		
		if(typeBean.equals("circle")) 
			return new Circle();
		
		if(typeBean.equals("triangle")) 
			return new Triangle();
		
		
		return null;
	}

}
