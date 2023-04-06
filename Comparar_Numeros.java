/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compararnumeros;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Comparar_Numeros extends JFrame{
    
    private JPanel panel;//panel de mi ventana.
    
    private JLabel BloqueA,BloqueB,Comparacion;//mensaje para indicar al usuario donde ingresar los valores.
    
    private JTextField valorA,valorB;//caja de texto para que el usuario ingrese los valores.
    
    private JButton boton;//boton que iniciara el proceso de comparacion.
    
    public Comparar_Numeros(){
        
        setBounds(50,50,600,400);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("Comparar Numeros");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
        
    }
    public void INICIAR_PROGRAMA(){
        PANEL();
        ETIQUETAS();
        CAJAS_TEXTO();
        BOTON();
        setVisible(true);
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
        
        BloqueB=new JLabel("Ingrese el valor de B:");
        BloqueB.setBounds(30,50,200,30);
        
        panel.add(BloqueA);
        panel.add(BloqueB);
    }
    
    public void CAJAS_TEXTO(){
        
        valorA=new JTextField();
        valorA.setBounds(240,10,110,30);
        
        valorB=new JTextField();
        valorB.setBounds(240,50,110,30);
        
        panel.add(valorA);
        panel.add(valorB);
    }
    
    public void BOTON(){
        boton=new JButton("Click para comparar");
        boton.setBounds(30,100,200,30);
        panel.add(boton);
        
        Comparacion=new JLabel();
        Comparacion.setBounds(240, 100, 110, 30);
        panel.add(Comparacion);
        
        ActionListener oyenteDeAccion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a=Integer.parseInt(valorA.getText());
            int b=Integer.parseInt(valorB.getText());
            if (a>b){
                Comparacion.setText("A ES MAYOR QUE B");
            }else if(a<b){
                Comparacion.setText("A ES MENOR QUE B");
            }else{
                Comparacion.setText("A ES IGUAL A B");
            }
        }
    };
        
        boton.addActionListener(oyenteDeAccion);
    }
    
}
