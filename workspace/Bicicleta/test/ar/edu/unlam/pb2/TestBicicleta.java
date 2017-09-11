package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBicicleta {

	@Test
	public void testQueCreaBiciUsandoConstructorVacio() {
		Bicicleta miBicicleta = new Bicicleta(); //puedo usar el vacio o el q tiene parametros,en este caso use el vacio  
		Integer idActual =miBicicleta.getId();//le pregunto si esta vacio

				//assertEquals(0.0,miBicicleta.getId(),0.01); //lo voy a tener en cero en este caso 
				//assertEquals(0.0,idActual,0.01);

		assertTrue(idActual==0); //puedo usar si es verdadera esa condicion
		assertTrue(miBicicleta.getColor()=="blanca");//pregunto si es blanca
		
				//si tengo varios assert y no se cumple alguno, tira rojo
	}//chequeo que se haya creado la bicicleta

		//puedo crear una variable de tipo integer
	@Test 
	public void testQueCreaBiciUsandoConstructorConParametros(){
		Bicicleta miBicicleta = new Bicicleta(2,20);//le paso los integer
		Integer idActual = miBicicleta.getId();
		Integer rodadoActual = miBicicleta.getRodado();
		
		assertEquals(2,idActual,0); 
		assertEquals(20,rodadoActual,0);
	}
	
}
