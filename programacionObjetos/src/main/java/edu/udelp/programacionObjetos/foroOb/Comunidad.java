/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udelp.programacionObjetos.foroOb;

import java.util.Date;
import edu.udelp.programacionObjetos.foroOb.Usuario;

/**
 *
 * @author diego
 */
public class Comunidad {
    Long id;
    String nombre;
    String descripcion;
    Date fechaCreacion;
    String logo;
    Usuario creador;
    Boolean nsfw;
    Boolean plus18;
    Integer numPersonas;
    Tag [] tags;
    
}
