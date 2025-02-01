package edu.udelp.programacionObjetos.proceso;

						//Nomneclaturas <> para poder recibir clases genericas (Se puden usar mas de una pero se separan con coma)
public abstract class FigurasProcess<T>{

	public void calcula(T figura) {
		System.out.println("El perimetro es: "+ perimetro(figura));
		System.out.println("El area es: "+ area(figura));
		
	}
	protected abstract Double perimetro(T figura);
	protected abstract Double area(T figura);
}
