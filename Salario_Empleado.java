/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Salario_Empleado extends JFrame {
    
    JPanel panel;
    JLabel NOMBRE,SALARIOBASIC,HORASMES;
    JTextField Name,Salario,HorasMes;
    JButton BCALCULAR,BBORRAR,BCERRAR;
    JTextArea SOLUCION;
    
    public void Salario_Empleado(){
    
        setBounds(50,50,770,600);//Tamaño de mi Ventana.
        setLocationRelativeTo(null);//Centro mi ventana
        setTitle("Salario Empleado");//Nombre de mi ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierro mi ventana.       
        
    }
    
    public void Mostrar_Resultados(){
    
        Salario_Empleado();
        PANEL();
        ETIQUETAS();
        CAJAS_TEXTO();
        BOTONES();
        TEXTO_AREA();
    }
    
    public void PANEL(){
    
        panel=new JPanel();
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
          
    }
    
    public void ETIQUETAS(){
    
        NOMBRE=new JLabel("NOMBRE DEL EMPLEADO");
        NOMBRE.setBounds(40,40,200,30);
        panel.add(NOMBRE);
        
        SALARIOBASIC=new JLabel("SALARIO BASICO POR HORA");
        SALARIOBASIC.setBounds(40, 120, 200, 30);
        panel.add(SALARIOBASIC);
        
        HORASMES=new JLabel("HORAS TRABAJADAS AL MES");
        HORASMES.setBounds(40,200,200,30);
        panel.add(HORASMES);
    
    }
    
    public void CAJAS_TEXTO(){
    
        Name=new JTextField();
        Name.setBounds(320,40,300,30);
        panel.add(Name);
        Name.requestFocusInWindow();
        
        Salario=new JTextField();
        Salario.setBounds(320, 120, 300, 30);
        panel.add(Salario);
        Salario.requestFocusInWindow();
        
        HorasMes= new JTextField();
        HorasMes.setBounds(320,200,300,30);
        panel.add(HorasMes);
        HorasMes.requestFocusInWindow();
           
    }
    
    public void TEXTO_AREA(){
    
        SOLUCION=new JTextArea();
        SOLUCION.setBounds(290, 280, 200, 100);
        SOLUCION.setPreferredSize(new Dimension(600,70));
        SOLUCION.setLineWrap(true);
        SOLUCION.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(SOLUCION);
    
    }
    
    public void BOTONES(){
    
        BCALCULAR= new JButton("CALCULAR");
        BCALCULAR.setBounds(60, 420, 100, 30);
        panel.add(BCALCULAR);
        BCALCULAR.requestFocusInWindow();
        
        BBORRAR= new JButton("BORRAR");
        BBORRAR.setBounds(330,420,100,30);
        panel.add(BBORRAR);
        BBORRAR.requestFocusInWindow();
        
        BCERRAR=new JButton("CERRAR");
        BCERRAR.setBounds(600, 420, 100, 30);
        panel.add(BCERRAR);
        BCERRAR.requestFocusInWindow();
        
        
        ActionListener oyenteDeCalcular=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double SalarioMensual=Double.valueOf(Salario.getText())*Double.valueOf(HorasMes.getText());
                if (SalarioMensual>450000){
                    SOLUCION.setText("EL SALARIO MENSUAL DEL EMPLEADO "+Name.getText()+" ES DE $"+SalarioMensual);
                }
                else{
                    SOLUCION.setText("EL EMPLEADO CON NOMBRE "+Name.getText());
                }
                SOLUCION.setVisible(true);
            }
        };
        BCALCULAR.addActionListener(oyenteDeCalcular);
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                Name.setText("");
                Salario.setText("");
                HorasMes.setText("");
                SOLUCION.setText("");
                SOLUCION.setVisible(false);
                
            }
        };
        BBORRAR.addActionListener(oyenteDeBorrar);
        
        ActionListener oyenteDeCerrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        };
        BCERRAR.addActionListener(oyenteDeCerrar);
    
    }
   
}
