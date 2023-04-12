/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fig_geometricas;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Rectangulo {
    int base;
    int altura;
    //Atributos
    
    public Rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
        
    }
    public double Area(){
        return base*altura;
    }
    public double Perimetro(){
        return base*2+altura*2;
    }
}   
