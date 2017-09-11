package ar.edu.unlam.pb2;

//calculadora que suma,resta, multiplica 
public class Calculadora {
	 private Double operando1;
	 private Double operando2;
	 private Double ultimoResultado;//atributo
	 
	/* public Calculadora(){
		 //constructor por defecto,genera el enlace	, esta vacio 
	 }*/
	 
	 public Calculadora(){ //CONSTRUCTOR le pongo algo especifico al constructor
		 this.ultimoResultado=0.0; //para inicializar los valores, cuando creamos los objetos
	 }
	 
	public Double sumar(Double operando1, Double operando2){//
		//return operando1+operando2;
		ultimoResultado = operando1+operando2;
		return this.ultimoResultado;
	}
	 
	public Double restar(Double operando1, Double operando2){ 
		//metodo
		//return operando1-operando2 forma resumida
		ultimoResultado = operando1-operando2;
		return this.ultimoResultado;
	}
	
	public Double multiplicar(Double operando1, Double operando2){
		//return operando1*operando2;
		ultimoResultado = operando1*operando2;
		return this.ultimoResultado;
	}
	 
	public Double getUltimoResultado(){//metodo
		return this.ultimoResultado;
	}
	
	
}
