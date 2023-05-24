package com.mundoanimal;

public class Wolf extends Canine{

	private String rol;

	public Wolf(String name, String rol) {
		super(name);
		this.rol = rol;
	}
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@Override
	public String makeNoise() {
		return "AAAaauu AAAaauu";
	}
	
	@Override
	public String showFigure() {
		return "http://lomito-aullador.com";
	}

}
