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
public class Vehiculos {
    private String marca;
    private String modelo;
    private int año;

    Vehiculos(String marca, String modelo, int año) {
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }
    
    
    public void mostrarDetalles(){
        System.out.println("La marca es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("Es del ano : "+año);
    }
}
