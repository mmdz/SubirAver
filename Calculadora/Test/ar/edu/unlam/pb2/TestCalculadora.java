package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testQueSuma() {
		Calculadora miCalculadora = new Calculadora();
		Double valorObtenido= miCalculadora.sumar(3.0, 2.0); //valor actual
		Double valorEsperado=5.0;
		
	//	assertEquals(4, 4); si tuviera integer pongo directamente asi 
		assertEquals(valorEsperado, valorObtenido); //no hace falta el delta
	}
	
	@Test 
	public void testQueResta(){
		Calculadora miCalculadora = new Calculadora(); //con NEW llamo al constructor
		Double valorObtenido = miCalculadora.restar(5.0,6.0);//guardo el resultado en "variable"
		Double valorEsperado=-1.0;
		assertEquals(valorEsperado, valorObtenido); //no hace falta el delta
	}
	
	@Test
	public void testQueMultiplica(){
		Calculadora miCalculadora = new Calculadora();
		Double valorObtenido = miCalculadora.multiplicar(5.0,3.0);
		Double valorEsperado = 15.0;
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test 
	public void testQueVerificaUltimoResultado() {
		Calculadora miCalculadora = new Calculadora();
//		Double valorObtenido = miCalculadora.multiplicar(5.0,3.0);
//		Double valorEsperado = 15.0;
	//	assertEquals(valorEsperado,valorObtenido);
		
		Double valorActual = miCalculadora.getUltimoResultado() ;
		assertEquals(0.0, valorActual, 0.01);
	}
	
}
