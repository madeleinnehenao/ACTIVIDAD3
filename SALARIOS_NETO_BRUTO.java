/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salarios;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class SALARIOS_NETO_BRUTO extends JFrame {
        
    private JPanel panel;
    private JLabel CODIGO,NOMBRE,HORASMES,VALORHORA,RETENCION;
    private JTextField Codigo,Name,HorasMes,VHora,RFuente;
    private JButton BCALCULAR,BBORRAR,BCERRAR;
    private JTextArea SOLUCION;
    
    public void Salario_Empleado(){
    
        setBounds(50,50,850,700);//Tamaño de mi Ventana.
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
        CODIGO=new JLabel("CODIGO DEL EMPLEADO:");
        CODIGO.setBounds(40, 40, 200, 30);
        panel.add(CODIGO);
        
        NOMBRE=new JLabel("NOMBRE DEL EMPLEADO:");
        NOMBRE.setBounds(40,120,200,30);
        panel.add(NOMBRE);
        
        HORASMES=new JLabel("HORAS TRABAJADAS AL MES:");
        HORASMES.setBounds(40, 200, 200, 30);
        panel.add(HORASMES);
        
        VALORHORA=new JLabel("VALOR POR HORA TRABAJADA;");
        VALORHORA.setBounds(40,280,200,30);
        panel.add(VALORHORA);
        
        RETENCION=new JLabel("PORCENTAJE DE RETENCION EN LA FUENTE:");
        RETENCION.setBounds(40, 360, 250, 30);
        panel.add(RETENCION);
    
    }
    
    public void CAJAS_TEXTO(){
        
        Codigo=new JTextField();
        Codigo.setBounds(320,40,300,30);
        panel.add(Codigo);
        Codigo.requestFocusInWindow();
        
        Name=new JTextField();
        Name.setBounds(320,120,300,30);
        panel.add(Name);
        Name.requestFocusInWindow();
        
        HorasMes=new JTextField();
        HorasMes.setBounds(320, 200, 300, 30);
        panel.add(HorasMes);
        HorasMes.requestFocusInWindow();
        
        VHora= new JTextField();
        VHora.setBounds(320,280,300,30);
        panel.add(VHora);
        VHora.requestFocusInWindow();
        
        RFuente=new JTextField();
        RFuente.setBounds(320,360,300,30);
        panel.add(RFuente);
        RFuente.requestFocusInWindow();
           
    }
    
    public void TEXTO_AREA(){
    
        SOLUCION=new JTextArea();
        SOLUCION.setBounds(200, 420, 400, 100);
        SOLUCION.setPreferredSize(new Dimension(500,70));
        SOLUCION.setLineWrap(true);
        SOLUCION.setWrapStyleWord(true);//Evita que las palabras se corten
        panel.add(SOLUCION);
    
    }
    
    public void BOTONES(){
    
        BCALCULAR= new JButton("CALCULAR");
        BCALCULAR.setBounds(60, 560, 100, 30);
        panel.add(BCALCULAR);
        BCALCULAR.requestFocusInWindow();
        
        BBORRAR= new JButton("BORRAR");
        BBORRAR.setBounds(330,560,100,30);
        panel.add(BBORRAR);
        BBORRAR.requestFocusInWindow();
        
        BCERRAR=new JButton("CERRAR");
        BCERRAR.setBounds(600, 560, 100, 30);
        panel.add(BCERRAR);
        BCERRAR.requestFocusInWindow();
        
        
        ActionListener oyenteDeCalcular=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double F=Double.parseDouble(RFuente.getText());
                if (F!=F/100){
                    F=F/100;
                }
                double sbruto=Double.parseDouble(HorasMes.getText())*Double.parseDouble(VHora.getText());
                double sneto= sbruto-((sbruto)*(F));
                SOLUCION.setText("EL EMPLEADO CON CODIGO "+Codigo.getText()+" DE NOMBRE "+Name.getText()+" CUENTA CON UN SALARIO BRUTO DE $"+sbruto+" Y SALARIO NETO DE $"+sneto);
                SOLUCION.setVisible(true);
            }
        };
        BCALCULAR.addActionListener(oyenteDeCalcular);
        
        ActionListener oyenteDeBorrar=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                Codigo.setText("");
                Name.setText("");
                HorasMes.setText("");
                VHora.setText("");
                RFuente.setText("");
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
