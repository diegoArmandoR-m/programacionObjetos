/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPrimerParcial;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class SistemaDeVehiculos {
    public static void main(String[] args) {
        
        ArrayList<Vehiculos> vehiculos = new ArrayList<>();
        Automovil auto = new Automovil("BMW","modelo1",2000);
        auto.setNumeroPuertas(4);
        Motocicleta moto = new Motocicleta("Yamaha","modelo2",2023);
        moto.setTipo("deportivo");
        
        vehiculos.add(auto);
        vehiculos.add(moto);
        for(int i=0; i<vehiculos.size();i++){
            vehiculos.get(i).mostrarDetalles();
        }
        
        
        
        
    }
}
