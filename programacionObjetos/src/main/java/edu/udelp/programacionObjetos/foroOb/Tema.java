/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udelp.programacionObjetos.foroOb;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Tema {
    Long id;
    String descripcion;
    String nombre;
    Categoria categoria;
    Boolean nsfw;
    Boolean plus18;
    Usuario usuario;
    Date fecha;
    Tag[] tags;
    
}
