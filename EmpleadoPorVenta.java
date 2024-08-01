/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

import java.util.Calendar;

/**
 *
 * @author Balto
 */
public class EmpleadoPorVenta  extends EmpleadoComun{
    private double ventas[],tasas;
    
    public EmpleadoPorVenta(int code,String name,double salary){
        super(code,name,salary);
        ventas=new double[12];
        tasas=0.05;
    }
    
    private int mesActual(){
        Calendar hoyM= Calendar.getInstance();
        return hoyM.get(Calendar.MONTH);
    }
    
    public void agregarVentas(double venta){
        ventas[mesActual()]+=venta;
    }
    
    public double comission(){
        return ventas[mesActual()]*tasas;
    }
    
    public double pagar(){
        return super.pagar()+comission();
    }
    
    public String toString(){
        return super.toString()+" Comission: "+comission();
    }
    
    public void increaseIncome(){
        if(tasas<0.2)
            tasas=0.01;
    }
    
    public void quienSoy(){
        System.out.println("Soy un Empleado por Venta");
    }
}
