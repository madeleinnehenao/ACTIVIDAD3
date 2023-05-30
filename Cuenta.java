/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_herencia;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Cuenta {
    
    protected float Saldo; //Saldo
    protected int Nconsignments=0; //Número de consignaciones con valor inicial cero
    protected int Nwithdrawals=0; //Número de retiros con valor inicial cero
    protected float Anual_rate; //Tasa anual (porcentaje)
    protected float Mcomission=0; //Comisión mensual con valor inicial cero
    
    //Constructor que inicializa los atributos saldo y tasa anual
    
    public Cuenta(float Saldo,float rate){
        this.Saldo=Saldo;
        this.Anual_rate= rate;
    }
    
    /*Método que recibe una cantidad a consignar y actualiza 
    el saldo de la cuenta*/
    public void Consign_money(float amount){
        
        Saldo=Saldo + amount;
        Nconsignments=Nconsignments+1;
    }
    
    /*Método que recibe una cantidad de dinero a retirar y actualiza el
    saldo de la cuenta*/
    public void Withdraw_money(float amount1){
        Float NewSaldo=Saldo-amount1;
        if(amount1<=NewSaldo){
            
            Saldo-=amount1; 
            Nwithdrawals+=1;
        }else{
            System.out.println("La cantida a retirar excede el saldo actual");
        }
    }
    /*Método que calcula interés mensual de la cuenta a partir de la tasa
    anual aplicada*/
    public void Account_interest(){
    
        float monthly_rate=Anual_rate/12;
        float monthly_interest= monthly_rate*Saldo;
        Saldo+=monthly_interest;
    
    }
    /** Método que genera un extracto aplicando al saldo actual una
    comisión y calculando sus intereses*/
    public void monthly_statement(){
    
        Saldo-=Mcomission;
        Account_interest();
    }
    
    //Metodo para imprimir los atributos
    public void Print_Atributos(){
        System.out.println(Saldo + "\n"+
                Nconsignments+"\n"+Nwithdrawals+"\n"+
                Anual_rate +"\n"+Mcomission+"\n");
    
    }
}
