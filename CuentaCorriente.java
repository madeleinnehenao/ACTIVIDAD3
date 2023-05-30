/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_herencia;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class CuentaCorriente extends Cuenta {
    float overdraft;
    
    public CuentaCorriente(float saldo,float tasa){
        super(saldo,tasa);
        overdraft=0;
    }
    /*Método que recibe una cantidad de dinero a retirar y actualiza el
    saldo de la cuenta*/
    
    public void Withdraw1(float amount2){
        float result=Saldo-amount2;
        
        if(result<0){
            overdraft+=Math.abs(result);
            Saldo=0;
        }else{
            super.Withdraw_money(amount2);
        }
    }
    
    /*Método que recibe una cantidad de dinero a consignar y actualiza
    el saldo de la cuenta*/
    public void  Consign_Money1(float amount2){

        if(overdraft>0){
            if(amount2>overdraft){
                Saldo+=amount2-overdraft;
                overdraft=0;
            }else{
                overdraft=-amount2;
                Saldo=0;
            }
        }else{
            super.Consign_money(amount2);
        }
    }
    /*Método que genera el extracto mensual de la cuenta*/
    public void Monthly_statement1(){
        super.monthly_statement();
    }
    
    /*Método que muestra en pantalla los datos de una cuenta corriente*/
    public void print1(){
        System.out.println("El Saldo de la cuenta es: $"+Saldo);
        System.out.println("El número de transacciones realizadas: ");
        System.out.println("El valor del sobregiro es: "+overdraft);
    }
}
