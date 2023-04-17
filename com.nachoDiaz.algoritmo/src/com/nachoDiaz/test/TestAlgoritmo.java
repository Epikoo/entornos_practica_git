package com.nachoDiaz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nachoDiaz.algoritmo.Algoritmo;

class TestAlgoritmo {

	@Test
	void testFibonacci() {
		long resultado1 = Algoritmo.fibonacci(1);
		long resultadoesp1 = 1;
		long resultado2 =Algoritmo.fibonacci(2);
		long resultadoesp2 = 1;
		long resultado3=Algoritmo.fibonacci(3);
		long resultadoesp3=2;
		assertEquals(resultadoesp1, resultado1); // comprueba si son iguales
		assertEquals(resultadoesp2, resultado2);
		assertEquals(resultadoesp3, resultado3);
		
	}
	@Test
	void testFactorial() {
	 assertEquals(Algoritmo.factorial(1), 1);
	 assertEquals(Algoritmo.factorial(2), 2);
	 assertEquals(Algoritmo.factorial(3), 6);
	 assertEquals(Algoritmo.factorial(8), 40320);
	 
	}
	@Test
	void testPrimo() {
	 assertEquals(Algoritmo.primo(1), true);
	 assertEquals(Algoritmo.primo(2), true);
	 assertEquals(Algoritmo.primo(3), true);
	 assertEquals(Algoritmo.primo(8), false);
	 
	}

}
