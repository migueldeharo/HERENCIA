package Teoria;

import pHerencia1.*; //Abarca todo
public class Principal {
    //Hay dos formas de crear clases a partir de otras
    //HERENCIA:Consiste en ampliar o modificar una clase existente
    //CLIENTELA:ASOCIACION/AGREGACION O COMPOSICION:Uitlizamos otras clases como atributos
    public static void main(String[] args) {
        Persona p= new Persona ();
        Alumno a= new Alumno();
        //a.mostrarEdad();
        a.mosrtarEdades();
        p.soy();
        a.soy();
    }


}
