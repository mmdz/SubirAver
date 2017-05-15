package ar.edu.unlam.basica2;

public class ClaseDisco {
	
	/*atributos*/
	
	private Double radioInterior;  
	private Double radioExterior;
		
	/*operaciones para cambios de radio interno y externo*/
	public ClaseDisco(Double radioInterior, Double radioExterior) {
		this.setRadioInterior(radioInterior);
		this.setRadioExterior(radioExterior);
	}

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
	
	/*metodos */
	public Double calcularPerimetroInterior() { 
		Double perimetroInterior = 2 * Math.PI * this.getRadioInterior();
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior() {
		Double perimetroExterior = 2 * Math.PI * this.getRadioExterior();
		return perimetroExterior;
	}
	
	public Double calcularSuperficieTotalDelDisco() {
		Double superficieInterior = Math.PI * Math.pow(this.getRadioInterior(), 2); /*mathpow da cuadrado*/
		Double superficieExterior = Math.PI * Math.pow(this.getRadioExterior(), 2);
		return (superficieExterior - superficieInterior);
	}
}	
	