package com.nachoDiaz.array;

public abstract class MisArrays{
	/*
	 * Este metodo realiza la media de un array de numeros.
	 * @param Una array de numeros enteros de la que vamos a realizar la media.
	 * @return Devuelve un numero double que representa la media del array.
	 */
	public static double media(int[] arra) {
		int sum=0;
		for(int numerito:arra) {
			sum+=numerito;
		}
		return sum/arra.length;
	}
	/*
	 * Realiza la mediana de un array
	 * @param Un array de numeros entreros del que se realiza la mediana
	 * @return devuelve un numero double que representa la mediana
	 */
	public static double mediana(int[] arra) {
		if(arra.length%2==0) {
			return (arra[arra.length/2])/(arra[(arra.length/2)-1]);
		}else {
			return (arra[arra.length/2]);
		}
	}
}
