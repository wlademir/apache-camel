package com.javarticles.camel;

public enum Texto {

	TEXTO("");
	
	private String texto;

	private Texto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return texto;
	}
	
	
}
