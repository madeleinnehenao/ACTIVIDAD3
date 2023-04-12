/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fig_geometricas;

public class Triangulo_Rectangulo {
    //Atributos
    int base;
    int altura;
    public Triangulo_Rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }
    public double Area(){
        return (base*altura /2);
    }
    public double Hipotenusa(){
        return Math.sqrt(base*base+altura*altura);
    }
    public double Perimetro(){
        
        return (base+altura+Hipotenusa());
    }
    public String Tipo_Triangulo(){
        String a;
        if((base==altura)&&(base==Hipotenusa())&&(Hipotenusa()==altura))
            a="EQUILATERO";
        else if((base!=altura)&&(base!=Hipotenusa())&&(Hipotenusa()!=altura))
            a="ESCALENO";
        else
            a="ISOSCELES";
        return a;
    }

    }
    
