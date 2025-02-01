package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.RegularNLados;

public class RegularNLadosProcess {

	public Double perimetro(RegularNLados regularN) {
		return regularN.getNLados()*regularN.getLado();		
	}
	
	public Double area(RegularNLados regularN) {
		return ((regularN.getNLados() * regularN.getLado()) * regularN.getApotema()) / 2;
	}
}
