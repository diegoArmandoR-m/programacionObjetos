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
public class Automovil extends Vehiculos {
    private int numeroPuertas ;

    public Automovil(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Tiene "+numeroPuertas+" puertas\n");
    }
}
