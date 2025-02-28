/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPrimerParcial;

import lombok.Data;
/**
 *
 * @author diego
 */
@Data
public class Profesor extends Personas{
    private double salario;

    public Profesor(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override 
    public void mostrarInformación(){
        super.mostrarInformación();
        System.out.println("Salario de: "+salario);
    }
}
