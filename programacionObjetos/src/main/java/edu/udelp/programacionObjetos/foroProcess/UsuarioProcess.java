/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udelp.programacionObjetos.foroProcess;
import edu.udelp.programacionObjetos.foroOb.Usuario;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author diego
 */
@Data
public class UsuarioProcess {
    ArrayList<Usuario> usulist = new ArrayList<>();
    ArrayList<Usuario> followers = new ArrayList<>();
    ArrayList<Usuario> bloqueados = new ArrayList<>();
    
    private Usuario usuarioActual;
    
    public void crearUsuarioTest() {
        Usuario usuarioTest = new Usuario();
        
        // Establecer los valores del usuario
        usuarioTest.setNombre("testUsuario");
        usuarioTest.setUsuario("testUsuario123");
        usuarioTest.setPasswords("Contraseña@123");
        usuarioTest.setEmail("test@correo.com");
        usuarioTest.setFechaNacimiento(new Date()); // Asegúrate de tener una fecha válida
        usuarioTest.setRedesSociales("Instagram, Twitter");
        
        // Establecer género (puedes elegir el valor correspondiente)
        usuarioTest.setGenero(Usuario.Genero.MASCULINO);  // Ejemplo: MASCULINO
        
        // Establecer estatus
        usuarioTest.setEstatus(Usuario.Estatus.ACTIVO);
        
        // Añadir el usuario a la lista
        usulist.add(usuarioTest);
        
        System.out.println("Usuario test creado y agregado a la lista.");
    }
    
    public void registro(){
        Usuario usu=new Usuario();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        usu.setNombre(leer.nextLine());
        usu.setUsuario(validarUsuario(leer));
        genero(usu,leer);
        usu.setPasswords(validarContraseña(leer));
        usu.setEmail(validarCorreo(leer));
        usu.setFechaNacimiento(bDate(leer));
        System.out.println("Ingresa tus redes sociales:");
        usu.setRedesSociales(leer.nextLine());
        usu.setEstatus(Usuario.Estatus.ACTIVO);
        usulist.add(usu);
        usu=usuarioActual;
    }
    
    public boolean recorrerCorreo(String correo){
        boolean validar=true;
        for(int i=0;i<usulist.size();i++){
            if(correo.equals(usulist.get(i).getEmail())){
                validar=false;
                break;
            }
        }
        return validar;
    }
    
    public boolean recorrerUsuario(String usuario){
        boolean validar=true;
        for(int i=0;i<usulist.size();i++){
            if(usuario.equals(usulist.get(i).getUsuario())){
                validar=false;
                break;
            }
        }
        return validar;
    }
    
    public int indexUsuario(String usuario){
        int validar=-1;
        for(int i=0;i<usulist.size();i++){
            if(usuario.equals(usulist.get(i).getUsuario())){
                validar=i;
                break;
            }
        }
        return validar;
    }
    
    public int indexCorreo(String correo){
        int validar=-1;
        for(int i=0;i<usulist.size();i++){
            if(correo.equals(usulist.get(i).getEmail())){
                validar=i;
                break;
            }
        }
        return validar;
    }
    
    public static Date bDate(Scanner leer) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); 
        Date fechaNacimiento = null;
        boolean fechaValida = false;

        while (!fechaValida) {
            System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
            String entrada = leer.nextLine();

            try {
                fechaNacimiento = formato.parse(entrada);
                System.out.println("Fecha registrada: " + formato.format(fechaNacimiento));
                fechaValida = true; 
            } catch (ParseException e) {
                System.out.println("Formato incorrecto. Intente nuevamente.");
            }
        }
        return fechaNacimiento;
    }
    
    public String validarUsuario(Scanner leer){
        String usuario=null;
        int index=-1;
        do {
            System.out.println("Ingresa tu usuario:");
            usuario = leer.nextLine();
            if (usuario.isEmpty()) {
                System.out.println("El usuario no puede estar vacio, intenta de nuevo.");
                continue;
            }
            index=indexUsuario(usuario);
            if(index!=-1){
                System.out.println("Este usuario ya existe, intenta con otro");
            }
        } while (index!= -1||usuario.isEmpty());
        return usuario;
    }
    
    private String validarContraseña(Scanner leer){
        String contraseña=null;
        String regex = "^(?=(.*\\d.*){2,})(?=.*[@$#]).{8,}$";
        do{
            System.out.println("Ingresa tu nueva contraseña:"
                + "\n(Debe de tener minimo 8 caracteres que contengan por lo menos 2 dígitos y que por lo menos contenga @,$,#)");
            contraseña=leer.nextLine();
            if (!contraseña.matches(regex)) {
                System.out.println("Contraseña inválida");
            } else {
                System.out.println("Contraseña resgistrada");
            }
        }while(!contraseña.matches(regex));
        return contraseña;
    }
    
    private String validarCorreo(Scanner leer) {
        String correo = null;
        String regex = "^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$";
        do {
            System.out.println("Ingresa tu correo:");
            correo = leer.nextLine();
            if (!correo.matches(regex)) {
                System.out.println("Correo invalido.");
            } else {
                if (!recorrerCorreo(correo)) {
                    System.out.println("Este correo ya esta registrado.");
                } else {
                    System.out.println("Correo registrado.");
                }
            }
        } while (!correo.matches(regex) || !recorrerCorreo(correo));
        return correo;
    }
    
    private static void genero(Usuario usu,Scanner leer){
        String num="";
        boolean validar =true;
        do{
            validar=true;
            System.out.println("Seleciona el numero del genero que prefieres: "
                + "\n1 - Femenino"+ "\n2 - Maculino"+"\n3 - No binario"
                + "\n4 - Prefiero No especificar");
            num=leer.nextLine();
            switch (num) {
                case "1":
                    usu.setGenero(Usuario.Genero.FEMENINO);
                    break;
                case "2":
                    usu.setGenero(Usuario.Genero.MASCULINO);
                    break;
                case "3":
                    usu.setGenero(Usuario.Genero.NO_BINARIO);
                    break;
                case "4":
                    usu.setGenero(Usuario.Genero.OTRO);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    validar=false;
            }
        }while(!validar);
    }
    
    public void editar(){
        Usuario usu=usuarioActual;
        Scanner leer=new Scanner(System.in);
        String num=null;
        boolean vali=true;
        
        do{
            System.out.println("Seleciona el numero de lo que desea editar: "
                    + "\n1 - Nombre"
                    + "\n2 - Usuario"
                    + "\n3 - Descripcion"
                    + "\n4 - Contraseña"
                    + "\n5 - Email"
                    + "\n6 - Redes sociales");
            switch(num){
            case "1":
                usu.setNombre(leer.nextLine());
                System.out.println("Se cambio con exito el nombre");
                break;
            case "2":
                usu.setUsuario(validarUsuario(leer));
                System.out.println("Se cambio con exito el usuario");
                break;
            case "3":
                usu.setDescripcion(leer.nextLine());
                System.out.println("Se cambio con exito la descripcion");
                break;
            case "4":
                usu.setPasswords(validarContraseña(leer));
                System.out.println("Se cambio con exito la contraseña");
                break;
            case "5":
                usu.setEmail(validarCorreo(leer));
                System.out.println("Se cambio con exito el correo");
                break;
            case "6":
                usu.setRedesSociales(leer.nextLine());
                System.out.println("Se cambio con exito las redes sociales");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        }while(!vali);
        
    }
    
    public void darBaja(Usuario usu){
        Scanner leer=new Scanner(System.in);
        String cadena=null;
        for(int i=0;i<3;i++){
            System.out.println("Ingresa la contraseña actual:");
            cadena=leer.nextLine();
            if(cadena.equals(usu.getPasswords())){
                usu.setEstatus(Usuario.Estatus.INACTIVO);
                System.out.println("La cuenta se dio de baja");
                break;
            }else{
                System.out.println("La contraseña es erronea"
                        + "\n(Intento "+(i+1)+" de 3)");
            }
        }
        if (!cadena.equals(usu.getPasswords())) {
            System.out.println("Has excedido el número de intentos permitidos.");
        }
    }
    
    public boolean login() {
        Scanner leer = new Scanner(System.in);
        boolean respuesta = false;
        String usuario = null;
        String password = null;
        int index=-1;
        do {
            System.out.println("Ingresa tu usuario o correo:");
            usuario = leer.nextLine();
            index=indexUsuario(usuario);
            if(index==-1){
                index=indexCorreo(usuario);
            }
        } while(index==-1);
        do {
            System.out.println("Ingresa tu contraseña:");
            password = leer.nextLine();
        } while (!usulist.get(index).getPasswords().equals(password));
        respuesta=true;
        usuarioActual = usulist.get(index);
        System.out.println("Bienvenid@ " + usuarioActual.getUsuario() + "!");
        return respuesta;
    }
    
    public void follow(Usuario usuario){
       if (usuarioActual != null && !followers.contains(usuario)) {
            followers.add(usuario);
            System.out.println(usuarioActual.getUsuario() + " ahora sigue a " + usuario.getUsuario());
        } else {
            System.out.println("No se puede seguir a este usuario.");
        }
    }
    
    public void unfollow(Usuario usuario){
        if (usuarioActual != null && followers.contains(usuario)) {
            followers.remove(usuario);
            System.out.println(usuarioActual.getUsuario() + " ya no sigue a " + usuario.getUsuario());
        } else {
            System.out.println("No se puede dejar de seguir a este usuario.");
        }
    }
    
    public void bloquear(Usuario usuario){
           if (usuarioActual != null && !bloqueados.contains(usuario)) {
            bloqueados.add(usuario);
            System.out.println(usuarioActual.getUsuario() + " ha bloqueado a " + usuario.getUsuario());
        } else {
            System.out.println("No se puede bloquear a este usuario.");
        }
    }
}
