package Teoria;

import pHerencia1.Persona;

public class Alumno extends Persona { //Alumno hereda de persona
    public int edad; //Sobreescritura de atributos
    public void mostrarEdad (){
        System.out.println("THIS: "+this.edad);
        this.edad=50;
        System.out.println("THIS: "+this.edad);
    }
    public void mosrtarEdades (){
        System.out.println("THIS: "+this.edad);
        System.out.println("SUPER: "+super.edad);
        this.edad=50;
        System.out.println("THIS: "+this.edad);
        System.out.println("SUPER: "+super.edad);
        super.edad=100;
        System.out.println("THIS: "+this.edad);
        System.out.println("SUPER: "+super.edad);
    }
    //THIS hace referecnia a toda la instancia(Superclase y subclase) (Persona y Alumno)
    //SUPER hace referencia expecificamente a la super clase Persona
    public void soy(){ //Sobreescritura de metodos
        //System.out.println("Alumno"); //Sustituyedo funcionalidad o comportamiento (Cambiando el codigo)
        super.soy(); //Llama al de arriba y pone persona
        System.out.println("Alumno");
    }
    /*
    public void metodo (){

    }
     */
    public void mostrarNombres(){
        System.out.println("THIS: "+this.getNombre());
        System.out.println("SUPER: "+super.getNombre());
    }
    public void mostrarPesos(){
        System.out.println("THIS: "+this.peso);
        System.out.println("SUPER: "+super.peso);
    }

}
