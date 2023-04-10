/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayor_numero;

import javax.swing.*;
import java.awt.event.*;

public class MayorValor extends JFrame{
    private JPanel panel;
    private JLabel Valores,VText;
    private JTextField VIngresados,Resultado;
    private JButton BR,BB,BC;
    
    public MayorValor(){
    
        setBounds(50,70,800,500);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("MAYOR VALOR");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
    
    }
    public void iniciar_Interfaz(){
        PANEL();
        ETIQUETAS_AREA();
        BOTONES();
    }
    public void PANEL(){
    
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);  
        
    }
    
    public void ETIQUETAS_AREA(){
    
        Valores=new JLabel("INGRESE LOS NUMEROS POSITIVOS SEPARADOS POR COMAS");
        Valores.setBounds(30,30,400,30);
        panel.add(Valores);
        
        VIngresados= new JTextField();
        VIngresados.setBounds(450,30,250,30);
        panel.add(VIngresados);
        VIngresados.requestFocusInWindow();
 
    }
    
    public void BOTONES(){
        
        VText=new JLabel();
        VText.setBounds(30, 100, 200, 30);
        panel.add(VText);
        VText.requestFocusInWindow();
        
        Resultado=new JTextField();
        Resultado.setBounds(450,100,250,30);
        panel.add(Resultado);
        Resultado.setVisible(false);
        Resultado.requestFocusInWindow();
        
        BR=new JButton("CALCULAR");
        BR.setBounds(110,300,110,30);
        panel.add(BR);
        BR.requestFocusInWindow();        
        
        BB=new JButton("BORRAR");
        BB.setBounds(330,300,110,30);
        panel.add(BB);
        BB.requestFocusInWindow();
        
        BC=new JButton("CERRAR");
        BC.setBounds(550, 300, 110, 30);
        panel.add(BC);
        BC.requestFocusInWindow();
        
        ActionListener oyenteDeCalcular=new ActionListener(){   
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String valores=VIngresados.getText();
                String[] values= valores.split(",");
                int max=0;
                for(String valor:values){
                    int num=Integer.parseInt(valor.trim());
                    if(num>max){
                        max=num;
                    }
                }
                VText.setText("EL NUMERO MAYOR ES: ");
                VText.setVisible(true);
                Resultado.setText(String.valueOf(max));
                Resultado.setVisible(true);
            }
        };
        BR.addActionListener(oyenteDeCalcular);
        
        // ActionListener para el botón de cerrar
        ActionListener oyenteDeCerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
            }
        };

        BC.addActionListener(oyenteDeCerrar);
        
        //ActionListener para el boton de borrar,para que el usuario ingrese todos los datos que desee, sin cerrar la ventana.
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Resultado.setText("");
                VIngresados.setText("");
                VText.setText("");
                Resultado.setVisible(false);
                VText.setVisible(false);
            }
        };
        
        BB.addActionListener(oyenteDeBorrar);
    
    }
}

