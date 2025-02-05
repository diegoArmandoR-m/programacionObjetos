package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Rombo;

public class RomboProcess extends FigurasProcess<Rombo> {

    @Override
    protected Double perimetro(Rombo figura) {
        return figura.getLado()*4;
    }

    @Override
    protected Double area(Rombo figura) {
        return (figura.getDM()*figura.getDn())/2;
    }

	
	
}
/*
public Double perimetro(Rombo rombo) {
		return rombo.getLado()*4;		
	}
	
	public Double area(Rombo rombo) {
		return (rombo.getDM()*rombo.getDn())/2;
	}
*/