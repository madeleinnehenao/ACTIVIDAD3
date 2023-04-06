/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compararnumeros;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Comparar_Numeros extends JFrame{
    
    private JPanel panel;//panel de mi ventana.
    
    private JLabel BloqueA,BloqueB,Comparacion;//mensaje para indicar al usuario donde ingresar los valores.
    
    private JTextField valorA,valorB,Resultado;//caja de texto para que el usuario ingrese los valores.
    
    private JButton boton,botonborrar,botoncerrar;//Botones de mi ventana, uno inicia el proceso, el segundo borra los datos ingresados, el tercero cierra la ventana.
    
    public Comparar_Numeros(){
        
        setBounds(50,50,600,400);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("Comparar Numeros");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
        
    }
    
    //Ejecuta todos los metodos ahorrando código en la class main.
    public void INICIAR_PROGRAMA(){
        PANEL();
        ETIQUETAS();
        CAJAS_TEXTO();
        BOTON();
        valorA.requestFocusInWindow();
        valorB.requestFocusInWindow();
        Resultado.requestFocusInWindow();
        boton.requestFocusInWindow();
        botonborrar.requestFocusInWindow();
        botoncerrar.requestFocusInWindow();
            
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
        
        Comparacion=new JLabel("Comparacion");
        Comparacion.setBounds(30, 100, 110, 30);
        
        panel.add(BloqueA);
        panel.add(BloqueB);
        panel.add(Comparacion);
    }
    
    public void CAJAS_TEXTO(){
        
        valorA=new JTextField();
        valorA.setBounds(240,10,110,30);
        
        valorB=new JTextField();
        valorB.setBounds(240,50,110,30);
        
        Resultado=new JTextField();
        Resultado.setBounds(240, 100, 150, 30);
        
        panel.add(valorA);
        panel.add(valorB);
        panel.add(Resultado);
    }
    
    public void BOTON(){
        boton=new JButton("Comparar");
        boton.setBounds(30,200,100,30);
        panel.add(boton);
        
        botonborrar=new JButton("Borrar");
        botonborrar.setBounds(240,200,100,30);
        panel.add(botonborrar);
        
        botoncerrar=new JButton("Cerrar");
        botoncerrar.setBounds(400,200,100,30);
        panel.add(botoncerrar);
        

        ActionListener oyenteDeAccion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(valorA.getText());
                int b=Integer.parseInt(valorB.getText());
                if (a>b){
                    Resultado.setText("A ES MAYOR QUE B");
                }else if(a<b){
                    Resultado.setText("A ES MENOR QUE B");
                }else{
                    Resultado.setText("A ES IGUAL A B");
                }
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
                Resultado.setText("");
            }
        };
        
        botonborrar.addActionListener(oyenteDeBorrar);
    }
    
}
