package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Rombo;

public class RomboProcess {

	public Double perimetro(Rombo rombo) {
		return rombo.getLado()*4;		
	}
	
	public Double area(Rombo rombo) {
		return (rombo.getDM()*rombo.getDn())/2;
	}
	
}
