package com.nachoDiaz.algoritmo;

/**
 * Es una clase para realizar distintos calculos matematicos
 * @author Nacho
 * @version 1.0
 */
public abstract class Algoritmo {
	/**
	 * Calcula el valor de un numero dentro de la serie de fibonacci
	 * 	 * @param numero
	 * @return valor del numero en la serie de fibonacci
	 */
	public static long fibonacci(int numero) {
		
		if (numero == 0)
			return 0;
		if (numero == 1 || numero == 2)
			return 1;

		long anterior = -1;
		long res = 1;
		
		for (int i = 0; i <= numero; i++) {
			long sum = res + anterior;
			anterior = res;
			res = sum;
		}
		return res;
	}
	/**
	 * Calcula el factorial de un numero
	 * @param numero
	 * @return factorial del numero
	 */
	public static long factorial(int numero) {
		long res = 1;
		
		for (int i = 2; i <= numero; i++) {
			res *= i;
		}
		return res;
	}
	/**
	 * Comprueba si el numero introducido es primo o no.
	 * @param numero
	 * @return true si es primo false si no.
	 */
	public static boolean primo (int numero) {
		for(int i=2; i<numero-1; i++) {
			if (numero%i==0) return false;
			
		}return true;
	}
}
