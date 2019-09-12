package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext myAppContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		
				Store myStore = myAppContext.getBean(Store.class);
				
				System.out.println("My Store has on Item"+ myStore.getItem().getName()+"with price: "
						+ ""+myStore.getItem().getPrice());
				
		
			
	}
}
