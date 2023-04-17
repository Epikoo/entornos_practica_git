package com.nachoDiaz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nachoDiaz.algoritmo.Funciones;

class TestPotencia {

	@Test
	void testPotencia() {
		assertEquals(Funciones.exponente(1, 0), 1);
		assertEquals(Funciones.exponente(2, 2), 4);
		assertEquals(Funciones.exponente(3, 2), 9);
	}

}
