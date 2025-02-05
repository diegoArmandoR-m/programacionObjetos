package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Rectangulo;

public class RectanguloProcess implements IFiguraProcess<Rectangulo> {

    @Override
    public Double perimetro(Rectangulo figura) {
        return 2*(figura.getLado()+figura.getAncho());		
    }

    @Override
    public Double area(Rectangulo figura) {
        return figura.getLado()*figura.getAncho();
    }

	
}

/*
    public Double perimetro(Rectangulo rectangulo) {
		return 2*(rectangulo.getLado()+rectangulo.getAncho());		
	}
	
	public Double area(Rectangulo rectangulo) {
		return rectangulo.getLado()*rectangulo.getAncho();
	}
*/