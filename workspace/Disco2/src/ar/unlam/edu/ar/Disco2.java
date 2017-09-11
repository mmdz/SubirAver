package ar.unlam.edu.ar;

public class Disco2 {

	private Double radioInterior; 
	private Double radioExterior;
	
//	public Disco2(){ //Constructor sin parametros
//		 this.radioInterior=0.0;
//		 this.radioExterior=0.0;
//		 this.perimetroInterior=0.0;
//		 this.perimetroExterior=0.0;
//		 this.superficie=0.0;
//	}
//	
	public Disco2(Double radioInterior, Double radioExterior){ //Constructor con parametros
		 this.radioInterior = radioInterior;
		 this.radioExterior = radioExterior;
	}
	
	//metodos
	
	public Double calcularPerimetroInterior(){
		Double perimetroInterior ;
		perimetroInterior = 2*Math.PI*radioInterior; //guarda el resultado en "perimetroInterior" el resultado
		return perimetroInterior; //no uso this porq es local
	}
	
	public Double calcularPerimetroExterior(){	
		Double perimetroExterior;
		perimetroExterior = 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularSuperficie(){	
		Double superficie;
		superficie = Math.PI*Math.pow(radioExterior, 2.0);
		return superficie;
	}
	
	//creo setter y getter
	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

//	public Double getPerimetroInterior() {
//		return perimetroInterior;
//	}
//
//	public void setPerimetroInterior(Double perimetroInterior) {
//		this.perimetroInterior = perimetroInterior;
//	}
//
//	public Double getPerimetroExterior() {
//		return perimetroExterior;
//	}
//
//	public void setPerimetroExterior(Double perimetroExterior) {
//		this.perimetroExterior = perimetroExterior;
//	}
//
//	public Double getSuperficie() {
//		return superficie;
//	}
//
//	public void setSuperficie(Double superficie) {
//		this.superficie = superficie;
//	}
	
	
	
}
