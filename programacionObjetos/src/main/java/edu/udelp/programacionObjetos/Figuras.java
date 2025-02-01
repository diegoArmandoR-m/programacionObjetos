package edu.udelp.programacionObjetos;

import edu.udelp.programacionObjetos.modelo.Circulo;
import edu.udelp.programacionObjetos.modelo.Cuadrado;
import edu.udelp.programacionObjetos.modelo.Rectangulo;
import edu.udelp.programacionObjetos.modelo.RegularNLados;
import edu.udelp.programacionObjetos.modelo.Rombo;
import edu.udelp.programacionObjetos.modelo.Triangulo;
import edu.udelp.programacionObjetos.proceso.CirculoProcess;
import edu.udelp.programacionObjetos.proceso.CuadradoProcess;
import edu.udelp.programacionObjetos.proceso.RectanguloProcess;
import edu.udelp.programacionObjetos.proceso.RegularNLadosProcess;
import edu.udelp.programacionObjetos.proceso.RomboProcess;
import edu.udelp.programacionObjetos.proceso.TrianguloProcess;

//import edu.udelp.programacionObjetos.modelo.*;
//import edu.udelp.programacionObjetos.proceso.*;

public class Figuras {
    public static void main(String[] args) {
        Cuadrado cua= new Cuadrado();
        Circulo cir = new Circulo();
        Rectangulo rec = new Rectangulo();
        RegularNLados regu =new RegularNLados();
        Rombo rom = new Rombo();
        Triangulo tri = new Triangulo();
        
        
        cua.setLado(5D);
        cir.setRadio(3D);
        rec.setLado(4D);
        rec.setAncho(6D);
        regu.setApotema(3.46D);
        regu.setLado(4D);
        regu.setNLados(6D);
        rom.setDn(8D);
        rom.setDM(6D);
        rom.setLado(5D);
        tri.setLado(3D);
        tri.setLado2(4D);
        tri.setLado3(5D);
        
        CuadradoProcess processcua = new CuadradoProcess();
        CirculoProcess processcir = new CirculoProcess();
        RectanguloProcess processrec = new RectanguloProcess();
        RegularNLadosProcess processregu = new RegularNLadosProcess();
        RomboProcess processrom =new RomboProcess();
        TrianguloProcess processtri=new TrianguloProcess();
        
        
        System.out.println("Cuadrado");
        processcua.calcula(cua);
        //System.out.println(processcua.perimetro(cua));
        //System.out.println(processcua.area(cua));
        System.out.println("Circulo");
        System.out.println(processcir.perimetro(cir));
        System.out.println(processcir.area(cir));
        System.out.println("Rectangulo");
        System.out.println(processrec.perimetro(rec));
        System.out.println(processrec.area(rec));
        System.out.println("Regular");
        System.out.println(processregu.perimetro(regu));
        System.out.println(processregu.area(regu));
        System.out.println("Rombo");
        System.out.println(processrom.perimetro(rom));
        System.out.println(processrom.area(rom));
        System.out.println("Triangulo");
        System.out.println(processtri.perimetro(tri));
        System.out.println(processtri.area(tri));
        
        
        /////29/01/25
        //Poom archivo de librerias, de donde las vamos a exportar 
        //1.18.36
        //Libreria lombok para generar gets y sets de forma automática
        
        //Herencia 
        // obtener los datos del "papa"
        
    }
}
