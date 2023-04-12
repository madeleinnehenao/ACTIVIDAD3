/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fig_geometricas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import fig_geometricas.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Figuras_GEometricas extends JFrame {
    
    private JPanel panel;
    private JLabel CIRCULO,CUADRADO,RECTANGULO,TRIANGULO;
    private JTextField Datos_Circulo,Datos_Cuadrado,Datos_Rectangulo,Datos_Triangulo;
    private JButton Botoncalcular,Botonborrar,Botoncerrar;
    private JTextArea Solve_Circulo,Solve_Cuadrado,Solve_Rectangulo,Solve_Triangulo;
    
    public Figuras_GEometricas(){
        setBounds(50,50,1100,700);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("FIGURAS GEOMETRICAS");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
    
    }
    public void iniciar_interfaz(){
    
        Panel();
        Etiquetas();
        Cajas_de_Texto();
        Botones();
        Areas_de_Texto();
        
    }
    
    public void Panel(){
    
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    
    }
    public void Etiquetas(){
    
        CIRCULO=new JLabel("INGRESE EL RADIO DEL CIRCULO:");
        CIRCULO.setBounds(50,30,500,30);
        panel.add(CIRCULO);
        
        CUADRADO=new JLabel("INGRESE UN LADO DEL CUADRADO:");
        CUADRADO.setBounds(50,80,500,30);
        panel.add(CUADRADO);
        
        RECTANGULO= new JLabel("INGRESE LA BASE Y ALTURA DEL RECTANGULO, SEPARADOS POR UNA COMA:");
        RECTANGULO.setBounds(50,130,500,30);
        panel.add(RECTANGULO);
        
        TRIANGULO= new JLabel("INGRESE LA BASE Y ALTURA DEL TRIANGULO, SEPARADOS POR UNA COMA:");
        TRIANGULO.setBounds(50,180,500,30);
        panel.add(TRIANGULO);
    }
    
    public void Cajas_de_Texto(){
        
        Datos_Circulo=new JTextField();
        Datos_Circulo.setBounds(600,30,200,30);
        panel.add(Datos_Circulo);
        Datos_Circulo.requestFocusInWindow();
        
        Datos_Cuadrado=new JTextField();
        Datos_Cuadrado.setBounds(600, 80, 200, 30);
        panel.add(Datos_Cuadrado);
        Datos_Cuadrado.requestFocusInWindow();
        
        Datos_Rectangulo=new JTextField();
        Datos_Rectangulo.setBounds(600, 130, 200, 30);
        panel.add(Datos_Rectangulo);
        Datos_Rectangulo.requestFocusInWindow();
        
        Datos_Triangulo=new JTextField();
        Datos_Triangulo.setBounds(600,180,200,30);
        panel.add(Datos_Triangulo);
        Datos_Triangulo.requestFocusInWindow();
        
    }
    
    //METODO PARA HACER VISIBLES LOS RESULTADOS
    public void Areas_de_Texto(){
    
        Solve_Circulo=new JTextArea();
        Solve_Circulo.setBounds(50, 280, 200, 150);
        Solve_Circulo.setPreferredSize(new Dimension(200,150));
        Solve_Circulo.setLineWrap(true);
        Solve_Circulo.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(Solve_Circulo);
        
        Solve_Cuadrado=new JTextArea();
        Solve_Cuadrado.setBounds(300, 280, 200, 150);
        Solve_Cuadrado.setPreferredSize(new Dimension(200,150));
        Solve_Cuadrado.setLineWrap(true);
        Solve_Cuadrado.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(Solve_Cuadrado);
        
        Solve_Rectangulo=new JTextArea();
        Solve_Rectangulo.setBounds(550, 280, 200, 150);
        Solve_Rectangulo.setPreferredSize(new Dimension(200,150));
        Solve_Rectangulo.setLineWrap(true);
        Solve_Rectangulo.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(Solve_Rectangulo);
        
        Solve_Triangulo=new JTextArea();
        Solve_Triangulo.setBounds(800, 280, 200, 150);
        Solve_Triangulo.setPreferredSize(new Dimension(200,150));
        Solve_Triangulo.setLineWrap(true);
        Solve_Triangulo.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(Solve_Triangulo);       
    
    }

    public void Botones(){
    
        Botoncalcular= new JButton("CALCULAR");
        Botoncalcular.setBounds(200, 550, 100, 30);
        panel.add(Botoncalcular);
        Botoncalcular.requestFocusInWindow();
        
        Botonborrar= new JButton("BORRAR");
        Botonborrar.setBounds(470,550,100,30);
        panel.add(Botonborrar);
        Botonborrar.requestFocusInWindow();
        
        Botoncerrar=new JButton("CERRAR");
        Botoncerrar.setBounds(700, 550, 100, 30);
        panel.add(Botoncerrar);
        Botoncerrar.requestFocusInWindow();
        
        ActionListener oyenteDeCalcular=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                Circulo solveCirculo=new Circulo(Integer.parseInt(Datos_Circulo.getText()));
                double A=solveCirculo.Area(),P=solveCirculo.Perimetro();
                Solve_Circulo.setText("EL CIRCULO CUENTA CON  UN AREA Y PERIMETRO DE "+A+", "+P+" RESPECTIVAMENTE.");
                Solve_Circulo.setVisible(true);
                
                Cuadrado solveCuadrado= new Cuadrado(Integer.parseInt(Datos_Cuadrado.getText()));
                double A1=solveCuadrado.Area(),P1=solveCuadrado.Perimetro();
                Solve_Cuadrado.setText("EL CUADRADO CUENTA CON  UN AREA Y PERIMETRO DE "+A1+", "+P1+" RESPECTIVAMENTE.");
                Solve_Cuadrado.setVisible(true);
                
                String base_altura=Datos_Rectangulo.getText();
                String [] valores=base_altura.split(",");
                String base=valores[0],altura= valores[1];
                Rectangulo solveRectangulo=new Rectangulo(Integer.parseInt(base),Integer.parseInt(altura));
                double A2=solveRectangulo.Area(),P2=solveRectangulo.Perimetro();
                Solve_Rectangulo.setText("EL RECTANGULO CUENTA CON  UN AREA Y PERIMETRO DE "+A2+", "+P2+" RESPECTIVAMENTE.");
                Solve_Rectangulo.setVisible(true);
                
                String base1_altura1=Datos_Triangulo.getText();
                String [] valores1=base1_altura1.split(",");
                String base1=valores1[0],altura1= valores1[1];
                Triangulo_Rectangulo solveTriangulo=new Triangulo_Rectangulo(Integer.parseInt(base1),Integer.parseInt(altura1));
                double A3=solveTriangulo.Area(),P3=solveTriangulo.Perimetro(),H=solveTriangulo.Hipotenusa();
                String tipo=solveTriangulo.Tipo_Triangulo();
                Solve_Triangulo.setText("EL TRIANGULO RECTANGULO CUENTA CON  UN AREA Y PERIMETRO DE "+A3+", "+P3+" RESPECTIVAMENTE. "
                        + "ADEMAS ES UN TRIANGULO DEL TIPO "+tipo+" Y CON UNA HIPOTENUSA DE "+H);
                Solve_Triangulo.setVisible(true);
    
            }
        };
        Botoncalcular.addActionListener(oyenteDeCalcular);
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Datos_Circulo.setText("");
                Datos_Cuadrado.setText("");
                Datos_Rectangulo.setText("");
                Datos_Triangulo.setText("");
                Solve_Circulo.setText("");
                Solve_Circulo.setVisible(false);
                Solve_Cuadrado.setText("");
                Solve_Cuadrado.setVisible(false);
                Solve_Rectangulo.setText("");
                Solve_Rectangulo.setVisible(false);
                Solve_Triangulo.setText("");
                Solve_Triangulo.setVisible(false);
                
            }
        };
        Botonborrar.addActionListener(oyenteDeBorrar);
        
        ActionListener oyenteDeCerrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        };
        Botoncerrar.addActionListener(oyenteDeCerrar);        
    }
}




