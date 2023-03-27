package com.nachoDiaz.algoritmo;

public class mainAlgoritmos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int numeros[] = new int[5];
		long resultadoFibonacci[] = new long[numeros.length];
		long resultadoFactorial[] = new long[numeros.length];
		boolean resultadoPrimos[] = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 20 + 1);
			resultadoFibonacci[i] = Algoritmo.fibonacci(numeros[i]);
			resultadoFactorial[i] = Algoritmo.factorial(numeros[i]);
			resultadoPrimos[i] = Algoritmo.primo(numeros[i]);
		}
		
	}
}
