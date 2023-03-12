/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_7_this;

/**
 *
 * @author eduar
 */
public class EVA2_7_THIS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //imprimir();
        //this no se puede usar en un contexto estático
    }
    public void imprimir(){
        //aquí también es visible this
    }
}

//this es una referencia  una instancia de la clase
//todos los objetos tienen this
//se puede usar this en cualquier clase
class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable (parámetro) declarado en el método
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
    public void imprimirDatos(){
        System.out.println("El nombre es: "+this.nombre);
    }
}