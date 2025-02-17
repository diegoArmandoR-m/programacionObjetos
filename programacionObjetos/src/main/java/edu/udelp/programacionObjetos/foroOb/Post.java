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
public class Post {
    Long id;
    Usuario usario;
    String descripcion;
    String imagen;
    Post originalPost;
    String archivo;
    Date fecha;
    CalificacionUsuario [ ] calificaciones;
    Boolean nsfw;
    Boolean plus18;
    Comunidad comunidad;
    Tag[] tags;
}
