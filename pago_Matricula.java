/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pago_matricula;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class pago_Matricula extends JFrame {
    private JPanel panel;
    private JLabel NI,NOM,PAT,EST; //Indican al usuario donde almacenar los datos y la ultilma indica donde estará almacenado el resultado.
    private JTextArea SOL;
    private JTextField Numeroi,Nombre,Patrimonio,Estrato; //Almacenan los datos ingresados por el usuario
    private JButton BPago,BBorrar,BCerrar;//Boton que realiza la operación, Boton que borra los datos , Boton cierre de la ventana
    
    public void pago_Matricula(){
        setBounds(50,50,770,600);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);
        setTitle("Pago Matricula");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.
        
    }
    
    public void mostrarDatos(){
        pago_Matricula();
        PANEL();
        ETIQUTAS();
        CAJAS_TEXTO();
        TEXTO_AREA();
        BOTONES();
    }
    public void PANEL(){
    
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    
    public void ETIQUTAS(){
        
        NI=new JLabel("NUMERO DE INSCRIPCIÓN");
        NI.setBounds(30,10,200,30);
        panel.add(NI);
        
        NOM=new JLabel("NOMBRE DEL ESTUDIANTE");
        NOM.setBounds(30, 80, 200, 30);
        panel.add(NOM);
        
        PAT=new JLabel("PATRIMONIO DEL ESTUDIANTE");
        PAT.setBounds(30,150,200,30);
        panel.add(PAT);
        
        EST=new JLabel("ESTRATO DEL ESTUDIANTE");
        EST.setBounds(30, 220, 200, 30);
        panel.add(EST);
    }

    public void CAJAS_TEXTO(){
    
        Numeroi=new JTextField();
        Numeroi.setBounds(300, 10, 300, 30);
        panel.add(Numeroi);
        Numeroi.requestFocusInWindow();

        
        Nombre=new JTextField();
        Nombre.setBounds(300, 80, 300, 30);
        panel.add(Nombre);
        Nombre.requestFocusInWindow();

        
        Patrimonio=new JTextField();
        Patrimonio.setBounds(300, 150, 300, 30);
        panel.add(Patrimonio);
        Patrimonio.requestFocusInWindow();
       
        Estrato=new JTextField();
        Estrato.setBounds(300, 220, 300, 30);
        panel.add(Estrato);
        Estrato.requestFocusInWindow();
    }
    //Metodo que permite mostrar los resultados
    public void TEXTO_AREA(){
        SOL=new JTextArea();
        SOL.setBounds(310, 300, 200, 100);
        SOL.setPreferredSize(new Dimension(600,70));
        SOL.setLineWrap(true);
        SOL.setWrapStyleWord(true);//Evita que las palabras se corten,realizando el salto de linea
        panel.add(SOL);
        }    
 
    public void BOTONES(){
    
        BPago=new JButton("CALCULAR");
        BPago.setBounds(70, 450, 100, 30);
        panel.add(BPago);
        BPago.requestFocusInWindow();

        
        BBorrar=new JButton("BORRAR");
        BBorrar.setBounds(300, 450, 100, 30);
        panel.add(BBorrar);
        BBorrar.requestFocusInWindow();
        
        BCerrar=new JButton("CERRAR");
        BCerrar.setBounds(530, 450, 100, 30);
        panel.add(BCerrar);
        BCerrar.requestFocusInWindow();
        
        
        ActionListener oyenteDePago=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a=Double.valueOf(Patrimonio.getText());
                int b=Integer.parseInt(Estrato.getText());
                double PAG=50000;
                if (a>2000000 && b>3){
                    PAG=PAG+(a*0.03);
                }
                SOL.setText("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+Numeroi.getText()+" Y NOMBRE "+Nombre.getText()+" DEBE PAGAR "+PAG);
                SOL.setVisible(true);
            }
        };
        BPago.addActionListener(oyenteDePago);
       
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                Numeroi.setText("");
                Nombre.setText("");
                Patrimonio.setText("");
                Estrato.setText("");
                SOL.setText("");
                SOL.setVisible(false);
                
            }
        };
        BBorrar.addActionListener(oyenteDeBorrar);
        
        ActionListener oyenteDeCerrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        };
        BCerrar.addActionListener(oyenteDeCerrar);
    
    }
}
