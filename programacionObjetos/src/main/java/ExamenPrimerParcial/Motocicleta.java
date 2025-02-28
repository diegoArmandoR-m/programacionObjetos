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
public class Motocicleta extends Vehiculos{
    private String tipo;

    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Es de tipo "+tipo+"\n");
    }
}
