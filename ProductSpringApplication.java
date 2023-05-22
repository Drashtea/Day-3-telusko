package com.telusko.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService service =context.getBean(ProductService.class);

		List<Product> products = service.getAllProducts();
		for(Product p : products){
			System.out.println(p);
		}


		List<Product> pname = service.getByName("Type C");
		for(Product p : pname){
			System.out.println(p);
		}
		
		List<Product> warranty = service.getOutofWarranty(2023);
		for(Product p : warranty){
			System.out.println(p);
		}
		
		List<Product> place = service.getByPlace("Black Drawer");
		for(Product p : place){
			System.out.println(p);
		}
		
		
		
		
		
	}

}
