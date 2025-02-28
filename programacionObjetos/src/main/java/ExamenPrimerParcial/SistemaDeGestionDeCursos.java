/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPrimerParcial;

/**
 *
 * @author diego
 */
public class SistemaDeGestionDeCursos {
    public static void main(String[] args) {
        Profesor profe= new Profesor("Carlos",35);
        profe.setSalario(3000);
        Estudiante estudiante=new Estudiante("Diego",20);
        estudiante.setPromedio(8.4);
        Estudiante estudiante2=new Estudiante("Armando",21);
        estudiante.setPromedio(7.8);
        Curso curso=new Curso("Arquitectura de computadoras",profe);
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        
        curso.mostrarDetallesCurso();
    }
}
