package com.example.demo.subham.spring;

import org.springframework.stereotype.Component;

@Component
public class engine {

	private String model="audiV8";
	private int cc=1080;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "engine [model=" + model + ", cc=" + cc + "]";
	}
	
}
