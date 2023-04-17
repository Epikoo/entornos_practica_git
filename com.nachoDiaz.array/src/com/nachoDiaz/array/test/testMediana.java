package com.nachoDiaz.array.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import com.nachoDiaz.array.MisArrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class testMediana {
	int array1[], array2[], array3[];

	@BeforeAll
	void inicializar() {
		array1 = new int[] { 1, 2, 3, 4, 5, 6 };
		array2 = new int[] { 9, 7, 5, 3, 1 };
		array3 = new int[] { 1, 2 };
	}

	@Test
	void test() {
		assertEquals(3.5, MisArrays.mediana(array1));
		assertEquals(5, MisArrays.mediana(array2));
		assertEquals(1.5, MisArrays.mediana(array3));
	}
}
