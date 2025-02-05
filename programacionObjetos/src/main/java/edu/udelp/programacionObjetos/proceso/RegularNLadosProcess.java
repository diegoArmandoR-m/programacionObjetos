package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.RegularNLados;

public class RegularNLadosProcess implements IFiguraProcess<RegularNLados>{

    @Override
    public Double perimetro(RegularNLados figura) {
        return figura.getNLados()*figura.getLado();		
    }

    @Override
    public Double area(RegularNLados figura) {
        return ((figura.getNLados() * figura.getLado()) * figura.getApotema()) / 2;
    }


}

/*
public Double perimetro(RegularNLados regularN) {
		return regularN.getNLados()*regularN.getLado();		
	}
	
	public Double area(RegularNLados regularN) {
		return ((regularN.getNLados() * regularN.getLado()) * regularN.getApotema()) / 2;
	}
*/