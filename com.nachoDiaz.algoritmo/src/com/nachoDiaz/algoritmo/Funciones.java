package com.nachoDiaz.algoritmo;

public abstract class Funciones {
	public static int exponente(int base, int exponente) {
		int pow=1;
		for(int i=0; i<exponente; i ++) {
			pow*=base;
		}
		return pow;
	}
}
