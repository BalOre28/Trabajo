/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

import java.util.Calendar;

/**
 *
 * @author Balto
 */
public abstract class Empleado {
   protected int codigo;
    protected String nombre;
    protected Calendar contratacion;
    
    public Empleado(int code,String name){
        codigo=code;
        nombre=name;
        contratacion=Calendar.getInstance();
    }
    
    public final int getCodigo(){
        return codigo;
    }
    public final String getNombre(){
        return nombre;
    }
    
    public final Calendar getContratacion(){
        return contratacion;
    }
    
    public final void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public abstract double pagar();
    public abstract double bono();
    
    public void quienSoy(){
        System.out.println("Soy tu padre");
    }
    
    public String toString(){
        return "Empleado(Codigo"+codigo+", Nombre; "+nombre+")";
    }

}
