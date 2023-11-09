package com.example.demo.subham.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class car {
 private String name="audi Q7";
 private String color= "Black";
 
 public car() {
	 System.out.println("making object!!!");
 }
@Autowired
private engine carengine;

public engine getCarengine() {
	return carengine;
}
public void setCarengine(engine carengine) {
	this.carengine = carengine;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
