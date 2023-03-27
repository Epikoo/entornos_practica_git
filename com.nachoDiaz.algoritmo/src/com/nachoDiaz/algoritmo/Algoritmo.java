package com.nachoDiaz.algoritmo;
/**
 * 
 * Es una clase para realizar distintos calculos matematicos
 * @author Nacho
 * @version 1.0
 *
 */
public abstract class Algoritmo {
	/**
	 * 
	 * Calcula el valor de un numero dentro de la serie de fibonacci
	 * @param numero
	 * @return valor del numero en la serie de fibonacci
	 */
public static int fibonacci(int numero) {

    if (numero == 0)
        return 0;
    if (numero == 1 || numero == 2)
        return 1;

    int anterior = -1;
    int res = 1;

    for (int i = 0; i <= numero; i++) {

        int sum = res + anterior;
        anterior = res;
        res = sum;
    }

    return res;
    }
}
