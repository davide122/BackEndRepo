package com.example.SETT4ES1.demo.Configure_component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component("TestComponent")
@Scope("prototype")

public class Testcomponent {
private String Helloworld;

public String readTxt() {
	return Helloworld;
}
}
