/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author Balto
 */
public class EmpleadoComun extends Empleado implements Emplea{
    protected double salario;
    public EmpleadoComun(int code, String name, double salario){
        super(code,name);
        this.salario=salario;
    }
    
    public double deduct(){
        return salario*Deductible.deductible_Tasa;
    }
    public boolean validForIncrease(){
        return true;
    }
    public void increaseIncome(){
        if(validForIncrease())
            salario+=salario*0.1;
    }
    
    public double bono(){
        return 0;
    }
    
    public double pagar(){
        return salario-deduct();
    }
    
    public double getSalario(){
        return this.salario=salario;
    }
    
    public String toString(){
        return super.toString()+" salario: $"+salario;
    }
    
    public void quienSoy(){
        System.out.println("Soy un Empleado comun");
    }
    

}
