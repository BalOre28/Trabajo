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
public final class EmpleadoTemporal extends EmpleadoComun{
    private Calendar finContrato;
    
    public EmpleadoTemporal(int code,String name){
        super(code,name,14000);
        finContrato=Calendar.getInstance();
    }
    
    public double pagar(){
        Calendar hoy=Calendar.getInstance();
        if (hoy.before(finContrato)){
            return super.pagar();
        }
        return 0;
    }
    
    public Calendar getFinContrato(){
        return finContrato;
    }
    
    public void setFinContrato(int year,int mes,int dia){
        Calendar fin=Calendar.getInstance();
        Calendar hoy=Calendar.getInstance();
        
        fin.set(year, mes,dia);;
        
        if (fin.after(hoy)){
            finContrato.set(year, mes,dia);
        }
    }
    
    public String toString(){
        return super.toString()+", fin contrato: "+finContrato.getTime();
    }
}