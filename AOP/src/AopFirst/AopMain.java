package AopFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AopFirst.service.FactoryService;
import AopFirst.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
//		ApplicationContext apt=new ClassPathXmlApplicationContext("Spring.xml");
	//	ShapeService sh=apt.getBean("shap",ShapeService.class);

		FactoryService fs=new FactoryService();
		ShapeService sh=(ShapeService) fs.getBean("shap");
		
		sh.getCircle();
		
		
		

		
	}

}
