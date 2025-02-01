package edu.udelp.programacionObjetos;

import edu.udelp.programacionObjetos.modelo.Animal;
import edu.udelp.programacionObjetos.modelo.Gato;
import edu.udelp.programacionObjetos.modelo.Perro;

public class SonidoAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.sonido();
		a= new Perro();
		a.sonido();
		a= new Gato();
		a.sonido();
		//Necesario colocar a.sonido(); para que se aplique lo de las clases hijos

	}

}
