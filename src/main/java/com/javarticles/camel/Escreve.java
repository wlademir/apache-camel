package com.javarticles.camel;

public class Escreve {

	public static void Main(String args[]) {
		StringBuilder geral = new StringBuilder();
		for (int x = 0; x < 1000; x++) {
			geral.append(Texto.TEXTO.toString().replace("#", x + ""));
		}
	}

}
