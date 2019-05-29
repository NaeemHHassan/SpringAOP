package com.softechsol.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softechsol.springaop.product.ProductService;

public class TestAspects {
	public static void main(String[] args) {

		ApplicationContext cont = new ClassPathXmlApplicationContext("/com/softechsol/springaop/test/config.xml");
		try {
			ProductService service = (ProductService) cont.getBean("productService");
			System.out.println(service.multiply(2, 5));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
