package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Rectangulo;

public class RectanguloProcess {

	public Double perimetro(Rectangulo rectangulo) {
		return 2*(rectangulo.getLado()+rectangulo.getAncho());		
	}
	
	public Double area(Rectangulo rectangulo) {
		return rectangulo.getLado()*rectangulo.getAncho();
	}
}
