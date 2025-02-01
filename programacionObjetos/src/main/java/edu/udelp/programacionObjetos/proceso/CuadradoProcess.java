package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Cuadrado;

public class CuadradoProcess extends FigurasProcess<Cuadrado> {

	@Override
	protected Double perimetro(Cuadrado figura) {
		// TODO Auto-generated method stub
		return figura.getLado()*4;
	}

	@Override
	protected Double area(Cuadrado figura) {
		// TODO Auto-generated method stub
		return figura.getLado()*figura.getLado();
	}

	
	
	
	
	
	/*public Double perimetro(Cuadrado cuadrado) {
		return cuadrado.getLado()*4;		
	}
	
	public Double area(Cuadrado cuadrado) {
		return cuadrado.getLado()*cuadrado.getLado();
	}*/
}
