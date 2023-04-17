package com.nachoDiaz.array;

public abstract class MisArrays {
	/*
	 * Este metodo realiza la media de un array de numeros.
	 * 
	 * @param Una array de numeros enteros de la que vamos a realizar la media.
	 * 
	 * @return Devuelve un numero double que representa la media del array.
	 */
	public static double media(int[] arra) {
		int sum = 0;
		for (int numerito : arra) {
			sum += numerito;
		}
		return (double)sum / arra.length;
	}

	/*
	 * Realiza la mediana de un array
	 * 
	 * @param Un array de numeros entreros del que se realiza la mediana
	 * 
	 * @return devuelve un numero double que representa la mediana
	 */
	public static double mediana(int[] arra) {
		if(arra.length%2==0) {
			int n1 = arra[arra.length/2];
			int n2 = arra[arra.length/2-1];
			return (((double)n1) + n2 )/ 2;
		}else {
			return (arra[arra.length/2]);
		}
	}
	/*
	 * Devuelve el numero mayor del array
	 * @param Un array de numeros enteros del que se saca el mayor
	 * @return Devuelve el mayor del array
	 */
	public static int maxi(int[] arra) {
		int mayor=0;
		for (int numerito:arra) {
			if (numerito>mayor) mayor=numerito;
		}
		return mayor;
	}
}
