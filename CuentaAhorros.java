/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_herencia;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class CuentaAhorros extends Cuenta{
    boolean Active;/*Atributo para determinar 
    si la cuenta de ahorros está activa*/
    
    public CuentaAhorros( float Saldo, float tasa){
        super(Saldo,tasa);
        if (Saldo<10000){
            Active=false;
        }else{
            Active=true;
        }     
    }
    
    /** Método que recibe una cantidad de dinero a consignar y actualiza
    el saldo de la cuenta*/
    public void Consign_money(float amount){
        if(Active){
            super.Consign_money(amount);
        }
    
    }
    /*Método que recibe una cantidad de dinero a retirar y actualiza el
    saldo de la cuenta*/
    public void Withdraw(float amount){
        if (Active){
            super.Withdraw_money(amount);}
    }

    /*Método que genera el extracto mensual de una cuenta de ahorros*/
    public void Monthly_statement(){
        if(Nwithdrawals>4){
            Mcomission+=(Nwithdrawals-4)*100;
        }
        super.monthly_statement();
        if(Saldo<10000){
            Active=false;
        }
    }
    /*Método que muestra en pantalla los datos de una cuenta de
    ahorros*/
    
    public void Print(){
        System.out.println("Saldo=$"+Saldo);
        System.out.println("Comisión mensual= $" + Mcomission);
        System.out.println("Numero de transacciones = "+
                (Nconsignments+Nwithdrawals));
        System.out.println();
    }
    
}
