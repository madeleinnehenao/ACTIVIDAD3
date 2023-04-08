/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.*;

import java.awt.event.*;

public class Calculadora_Raiz_Cubo_Cuadrado extends JFrame {
    
    private JPanel panel;
    private JLabel Numero,Raiz,Cuadrado,Cubo;
    private JTextField Num,raiz,cuadrado,cubo;
    private JButton BCalcular,BBorrar,BCerrar;
    
    public Calculadora_Raiz_Cubo_Cuadrado(){
        setBounds(50,50,600,500);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("CALCULADORA");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
    }
    public void EJECUTAR(){  
        
        PANEL();
        ETIQUETAS_CAJAS();
        BOTONES();
        
        
    }
    public void PANEL(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);       
    
    }
    public void ETIQUETAS_CAJAS(){    
        Numero=new JLabel("INGRESE UN NUMERO");
        Numero.setBounds(30,10,200,30);
        panel.add(Numero);
        
        Num=new JTextField();
        Num.setBounds(240,10,250,30);
        panel.add(Num);
        Num.requestFocusInWindow();
    }

    public void BOTONES(){
        BCalcular=new JButton("CALCULAR");
        BCalcular.setBounds(30,300,110,30);
        panel.add(BCalcular);
        BCalcular.requestFocusInWindow();        
        
        BBorrar=new JButton("BORRAR");
        BBorrar.setBounds(220,300,110,30);
        panel.add(BBorrar);
        BBorrar.requestFocusInWindow();
        
        BCerrar=new JButton("CERRAR");
        BCerrar.setBounds(400, 300, 110, 30);
        panel.add(BCerrar);
        BCerrar.requestFocusInWindow();
        
        Raiz=new JLabel();
        Raiz.setBounds(30,50,200,30);
        Raiz.setVisible(false);
        panel.add(Raiz);
        
        Cuadrado=new JLabel();
        Cuadrado.setBounds(30,100,200,30);
        Cuadrado.setVisible(false);
        panel.add(Cuadrado);
        
        Cubo=new JLabel();
        Cubo.setBounds(30,150,200,30);
        Cubo.setVisible(false);
        panel.add(Cubo);
        
        raiz=new JTextField();
        raiz.setBounds(240,50,250,30);
        panel.add(raiz);
        raiz.setVisible(false);
        raiz.requestFocusInWindow();

        cuadrado=new JTextField();
        cuadrado.setBounds(240,100,250,30);
        panel.add(cuadrado);
        cuadrado.setVisible(false);
        cuadrado.requestFocusInWindow();

        cubo=new JTextField();
        cubo.setBounds(240,150,250,30);
        panel.add(cubo);
        cubo.setVisible(false);
        cubo.requestFocusInWindow();
        
        ActionListener oyenteDeCalcular=new ActionListener(){   
        @Override
        public void actionPerformed(ActionEvent e) {
            int num=Integer.parseInt(Num.getText());
            double rz=Math.sqrt(num);
            double cua=num*num;
            double cbo=num*num*num;
            Raiz.setText("LA RAIZ DE "+num+" ES:");
            Raiz.setVisible(true);
            Cuadrado.setText("EL CUADRADO DE "+num+" ES:");
            Cuadrado.setVisible(true);
            Cubo.setText("EL CUBO DE "+num+" ES:");
            Cubo.setVisible(true);
            raiz.setText(String.valueOf(rz));
            raiz.setVisible(true);
            cuadrado.setText(String.valueOf(cua));
            cuadrado.setVisible(true);
            cubo.setText(String.valueOf(cbo));
            cubo.setVisible(true);

        }
        };

        BCalcular.addActionListener(oyenteDeCalcular);
        
        // ActionListener para el botón de cerrar
        ActionListener oyenteDeCerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
            }
        };

        BCerrar.addActionListener(oyenteDeCerrar);
        
        //ActionListener para el boton de borrar,para que el usuario ingrese todos los datos que desee, sin cerrar la ventana.
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Num.setText("");
                Raiz.setText("");
                Cuadrado.setText("");
                Cubo.setText("");
                raiz.setVisible(false);
                cuadrado.setVisible(false);
                cubo.setVisible(false);
            }
        };
        
        BBorrar.addActionListener(oyenteDeBorrar);
        
        }
    
}
    