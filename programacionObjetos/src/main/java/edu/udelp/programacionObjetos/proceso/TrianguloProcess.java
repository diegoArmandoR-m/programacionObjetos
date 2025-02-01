package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Triangulo;

public class TrianguloProcess {

	public Double perimetro(Triangulo triangulo) {
		return triangulo.getLado()+triangulo.getLado2()+triangulo.getLado3();		
	}
	
	public Double area(Triangulo triangulo) {
		double s = (triangulo.getLado()+triangulo.getLado2()+triangulo.getLado3())/2;
		return Math.sqrt(s*(s-triangulo.getLado())*(s-triangulo.getLado2())*(s-triangulo.getLado3()));
	}
}
