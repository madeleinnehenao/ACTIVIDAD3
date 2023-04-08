/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Triangulo_Equilatero extends JFrame {
    
    private JPanel panel;//panel de mi ventana.
    private JLabel BloqueA;//mensaje para indicar al usuario donde ingresar los valores.
    private JTextField valorA;//caja de texto para que el usuario ingrese los valores.
    private JTextArea Resultado;
    private JButton boton,botonborrar,botoncerrar;//Botones de mi ventana, uno inicia el proceso, el segundo borra los datos ingresados, el tercero cierra la ventana.

    public Triangulo_Equilatero(){        
        setBounds(50,50,550,400);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("TRIANGULO_EQUILATERO");//Nombre de mi ventana.
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
        
        BloqueA=new JLabel("INGRESE EL LADO DEL TRIANGULO:");
        BloqueA.setBounds(90,70,200,30);
        panel.add(BloqueA);

    }
    
    public void CAJAS_TEXTO(){
        
        valorA=new JTextField();
        valorA.setBounds(290,70,110,30);
        panel.add(valorA);
        valorA.requestFocusInWindow();

    }
    
    public void AREAS_TEXTO(){
    
        Resultado=new JTextArea();
        Resultado.setBounds(165, 150, 200, 80);
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
                double Perimetro=Double.parseDouble(valorA.getText())*3;
                double a=Math.pow(Double.parseDouble(valorA.getText()), 2);
                double b=Math.pow((Double.parseDouble(valorA.getText())/2), 2);
                double c= a-b;
                double altura=Math.sqrt(c);
                double area=Double.parseDouble(valorA.getText())*altura;
                
                Resultado.setText("EL TRIANGULO TIENE UN PERIMETRO "+Perimetro+",UNA ALTURA "+altura+" Y UN AREA "+area);
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
                Resultado.setText("");
                Resultado.setVisible(false);
            }
        };
        
        botonborrar.addActionListener(oyenteDeBorrar);
    }
    
}
