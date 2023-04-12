/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fig_geometricas;


public class Circulo {
    int Radio;
    public Circulo(int Radio){
        this.Radio=Radio;
    }
    //Metodo para calcular el area del circulo
    public double Area(){
    
        return Math.PI*Math.pow(Radio, 2);
    
    }
    //Metodo para calcular el perimetro del circulo.
    public double Perimetro(){
    return (2*Math.PI)*Radio;
    }
    
    
    
}
