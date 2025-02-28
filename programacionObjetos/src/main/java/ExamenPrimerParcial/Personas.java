/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPrimerParcial;

/**
 *
 * @author diego
 */
public class Personas {
    private String nombre;
    private int edad;
    
    Personas(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public void mostrarInformación(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("Tiene "+edad+" años");
    }
}
