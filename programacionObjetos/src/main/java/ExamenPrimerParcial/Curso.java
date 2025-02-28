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
public class Curso {
    private String nombreCurso;
    private Profesor profesor;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante); 
    }
    
    public void mostrarDetallesCurso(){
        System.out.println("El curso es: "+nombreCurso);
        System.out.println("Profesor del Curso: ");
        profesor.mostrarInformación();
        System.out.println("Los estudiantes son:");
        for(int i=0; i<listaEstudiantes.size();i++){
            listaEstudiantes.get(i).mostrarInformación();
        }
    }
}
