package ar.edu.unlam.pb2;

public class Bicicleta {

	private Integer  id; //atributos
	private String color;
	private String tipo;
	private Integer rodado;
	
	public Bicicleta(){ //constructor
		this.id=0;
		this.color="blanca";
		this.tipo="playera";
		this.rodado=2;
	}
	//cuando haga NEW BICICLETA, va a usar el constructor segun los parametros q le pase (SOBRECARGA)
	public Bicicleta(Integer id,Integer rodado){ //constructor le paso parametros
		this.id=id;
		this.rodado=rodado;
		this.color="blanca";
		this.tipo="playera";
	}
	
	//setters y getters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getRodado() {
		return rodado;
	}
	public void setRodado(Integer rodado) {
		this.rodado = rodado;
	}
	
	//boton derecho al final de la clase, SOURCE - GENERATE GETTERS(devuelve valores,parametros) Y SETTERS (permite cambiar los atributos)
	//pongo q genero todos los parametros
}
