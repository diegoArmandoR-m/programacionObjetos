package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Circulo;
public class CirculoProcess {

	public Double perimetro(Circulo circulo) {
		return 2*circulo.getRadio()*Math.PI;		
	}
	
	public Double area(Circulo circulo) {
		return Math.PI*(circulo.getRadio()*circulo.getRadio());
	}
}
