/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_herencia;
import java.util.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Prueba_Ahorros {


    public static void main(String[] args) {
        
        //Ejecuciòn para Cuenta de ahorros
        
        Scanner input=new Scanner(System.in);
        System.out.println("CUENTA DE AHORROS");
        System.out.println("");
        System.out.println("Ingrese el saldo inicial:");
        float Ahorros_Saldo=input.nextFloat();
        System.out.println("Ingrese la tasa de interes:");
        float Tasa_Interes=input.nextFloat();
        CuentaAhorros cuenta1=new CuentaAhorros(Ahorros_Saldo,Tasa_Interes);
        System.out.println("Ingrese la cantidad a consignar:");
        float Consignar_cantidad=input.nextFloat();
        cuenta1.Consign_money(Consignar_cantidad);
        System.out.println("Ingrese la cantidad a retirar:");
        float Retirar_cantidad=input.nextFloat();
        cuenta1.Withdraw(Retirar_cantidad);
        cuenta1.Monthly_statement();
        cuenta1.Print();

        
    }
    
}
