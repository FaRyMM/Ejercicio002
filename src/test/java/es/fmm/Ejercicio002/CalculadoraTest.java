package es.fmm.Ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calc;

	@BeforeEach
	void setUp() throws Exception {
		this.calc = new Calculadora();
	}

	@Test
	void testSumar() {
		calc.sumar(4.3);
		double resultado = calc.getResultado();
		assertEquals(4.3, resultado);
	}

	@Test
	void testRestar() {
		calc.sumar(4.3);
		calc.restar(4);
		double resultado = calc.getResultado();
		assertEquals(0.3, resultado, 0.000001);
	}

	@Test
	void testMultiplicar() {
		calc.sumar(3);
		calc.multiplicar(3);
		double resultado = calc.getResultado();
		assertEquals(9, resultado);
	}

}
