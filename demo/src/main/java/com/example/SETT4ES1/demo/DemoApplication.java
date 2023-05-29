package com.example.SETT4ES1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.SETT4ES1.demo.Configure_component.Testcomponent;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		configure();
	}
public static  void configure() {
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    appContext.scan("com.example.SETT4ES1.demo.Configure_component");
    appContext.refresh();
    Testcomponent T1 = (Testcomponent) appContext.getBean("TestComponent");
    T1.setHelloworld("HELLOWORLD");
    System.out.println(T1.readTxt());
    appContext.close();
}; 
}
