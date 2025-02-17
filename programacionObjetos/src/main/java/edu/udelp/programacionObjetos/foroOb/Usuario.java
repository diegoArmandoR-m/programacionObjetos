/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udelp.programacionObjetos.foroOb;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author diego
 */

@Data
public class Usuario {
    private String nombre;
    private String passwords;
    private String descripcion;
    private Genero genero;
    private String email;
    private Date fechaNacimiento;
    private String redesSociales;
    private Comunidad [ ] comunidades;
    private Usuario[ ] followers;
    private String usuario;
    private Enum estatus;
    
    public enum Genero {
        MASCULINO, FEMENINO, NO_BINARIO, OTRO;
    }

    public enum Estatus {
        ACTIVO, INACTIVO;
    }
   
}



