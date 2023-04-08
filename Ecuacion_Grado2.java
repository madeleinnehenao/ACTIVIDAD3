/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Ecuacion_Grado2 extends JFrame{
    
    private JPanel panel;//panel de mi ventana.
    private JLabel BloqueA,BloqueB,BloqueC;//mensaje para indicar al usuario donde ingresar los valores.
    private JTextField valorA,valorB,valorC;//caja de texto para que el usuario ingrese los valores.
    private JTextArea Resultado;
    private JButton boton,botonborrar,botoncerrar;//Botones de mi ventana, uno inicia el proceso, el segundo borra los datos ingresados, el tercero cierra la ventana.

    public Ecuacion_Grado2(){        
        setBounds(50,50,600,500);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("Ecuacion_Grado2");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
        
    }
    
    //Ejecuta todos los metodos ahorrando código en la class main.
    public void INICIAR_PROGRAMA(){
        PANEL();
        ETIQUETAS();
        CAJAS_TEXTO();
        AREAS_TEXTO();
        BOTON();
            
    }
    
    //PANEL
    public void PANEL(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    //Etiquetas para indicar donde almacenar los datos.
    public void ETIQUETAS(){
        
        BloqueA=new JLabel("Ingrese el valor de A:");
        BloqueA.setBounds(30,10,200,30);
        panel.add(BloqueA);
       
        BloqueB=new JLabel("Ingrese el valor de B:");
        BloqueB.setBounds(30,50,200,30);
        panel.add(BloqueB);
       
        BloqueC=new JLabel("Ingrese el valor de C");
        BloqueC.setBounds(30, 100, 200, 30);
        panel.add(BloqueC);
    }
    
    public void CAJAS_TEXTO(){
        
        valorA=new JTextField();
        valorA.setBounds(240,10,110,30);
        panel.add(valorA);
        valorA.requestFocusInWindow();

        
        valorB=new JTextField();
        valorB.setBounds(240,50,110,30);
        panel.add(valorB);
        valorB.requestFocusInWindow();

        valorC=new JTextField();
        valorC.setBounds(240, 100, 110, 30);
        panel.add(valorC);
        valorC.requestFocusInWindow();
    }
    
    public void AREAS_TEXTO(){
    
        Resultado=new JTextArea();
        Resultado.setBounds(180, 180, 200, 80);
        Resultado.setPreferredSize(new Dimension(600,70));
        Resultado.setLineWrap(true);
        Resultado.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(Resultado);
    
    }
    
    public void BOTON(){
        boton=new JButton("Calcular");
        boton.setBounds(30,300,100,30);
        panel.add(boton);
        boton.requestFocusInWindow();
       
        
        botonborrar=new JButton("Borrar");
        botonborrar.setBounds(220,300,100,30);
        panel.add(botonborrar);
        botonborrar.requestFocusInWindow();
       
        botoncerrar=new JButton("Cerrar");
        botoncerrar.setBounds(400,300,100,30);
        panel.add(botoncerrar);
        botoncerrar.requestFocusInWindow();

        

        ActionListener oyenteDeAccion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double A=Double.parseDouble(valorA.getText());
                double B=Double.parseDouble(valorB.getText());
                double C=Double.parseDouble(valorC.getText());
                double Determinante=Math.pow(B,2)-(4*A*C);
                if (Determinante>0){
                        double Valor1_X=((B*(-1))+ Math.sqrt(Determinante)) / (2*A);
                        double Valor2_X=((B*(-1))- Math.sqrt(Determinante)) / (2*A);

                        Resultado.setText("Los posibles valores son: "+Valor1_X+" y "+ Valor2_X);
                    }

                else{
                    Resultado.setText("El determinante es negativo asi que no es posible hallar solucion");
                }
                Resultado.setVisible(true);
            }
        };

        boton.addActionListener(oyenteDeAccion);

        // ActionListener para el botón de cerrar
        ActionListener oyenteDeCerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
            }
        };

        botoncerrar.addActionListener(oyenteDeCerrar);
        
        //ActionListener para el boton de borrar.
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                valorA.setText("");
                valorB.setText("");
                valorC.setText("");
                Resultado.setText("");
                Resultado.setVisible(false);
            }
        };
        
        botonborrar.addActionListener(oyenteDeBorrar);
    }
    
}

