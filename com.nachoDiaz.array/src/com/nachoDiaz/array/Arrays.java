package com.nachoDiaz.array;

public abstract class Arrays {
	/*
	 * Este metodo nos permite realizar la media de un array de numeros.
	 * @param Una array de numeros de la que vamos a realizar la media.
	 * @return Devuelve un numero double que representa la media del array.
	 */
	public double media(int[] arra) {
		int sum=0;
		for(int numerito:arra) {
			sum+=numerito;
		}
		return sum/arra.length;
	}
}
