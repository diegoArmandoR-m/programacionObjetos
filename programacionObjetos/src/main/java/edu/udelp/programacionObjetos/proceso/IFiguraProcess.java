package edu.udelp.programacionObjetos.proceso;

public interface IFiguraProcess <T>{

	//En la interfaz todo es public no es necesario colocarlo
	Double perimetro(T figura);
	Double area(T figura);
	
	
}
