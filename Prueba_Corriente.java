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
public class Prueba_Corriente {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("CUENTA CORRIENTE");
        System.out.println("");
        System.out.println("Ingrese el saldo inicial:");
        float Corriente_Saldo=input.nextFloat();
        System.out.println("Ingrese la tasa de interes:");
        float Tasa_Interes=input.nextFloat();
        CuentaCorriente cuenta1=new CuentaCorriente(Corriente_Saldo,Tasa_Interes);
        System.out.println("Ingrese la cantidad a consignar:");
        float Consignar_cantidad=input.nextFloat();
        cuenta1.Consign_Money1(Consignar_cantidad);
        System.out.println("Ingrese la cantidad a retirar:");
        float Retirar_cantidad=input.nextFloat();
        cuenta1.Withdraw1(Retirar_cantidad);
        cuenta1.Monthly_statement1();
        cuenta1.print1();
    }
    
}
