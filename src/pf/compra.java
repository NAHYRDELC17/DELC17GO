/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author USUARIO
 */
public class compra extends JFrame  {

    private static void setModel(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JPanel panel;
    JLabel eA,rr,e1,e2,e3,e4,e5,e6,e7,e8,e9;
    int i;
              ArrayList<persona> arregl = new ArrayList<persona>(); //int arrays[] = new arrays[20];  

    public  compra(){
        
    setTitle("COMPRA");
        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        agregar();
        this.dispose();
          

    }
    
     private void agregar(){
        colocarpanel();
       // etiquetas();
        table();
    }

private void colocarpanel(){
    panel =  new JPanel();
    this.setContentPane(panel);
    setLayout(null);
}
 private void etiquetas(){
     
      eA = new JLabel();
      eA.setText("COMPRA");
      eA.setBounds(120, 20, 260, 40);
      eA.setOpaque(true);
      eA.setBackground(java.awt.Color.BLACK);
      eA.setBackground(Color.WHITE);
      eA.setHorizontalAlignment(SwingConstants.CENTER);
      eA.setFont(new Font("Arial",3,25));
      panel.add(eA); 
       
      rr = new JLabel();
      menu menu = new menu();
      rr.setText("");
      rr.setBounds(20,70,150,30);
      panel.add(rr);
      
      
     
      e1 = new JLabel();
      String mostrar="";
      ventas vent = new ventas();
      e1.setText("HAMBURGUER: ");
      e1.setBounds(20,100,170,25);
      panel.add(e1);
      
       e2 = new JLabel();
      e2.setText("SALCHIPAPA ");
      e2.setBounds(20,200,170,25);
      panel.add(e2);
      
      e3 = new JLabel();
      e3.setText("PERROS ");
      e3.setBounds(20,150,170,25);
      panel.add(e3);
      
       e4 = new JLabel();
      e4.setText("xxxx");
      //e4.setBounds(20,150,170,25);
      //panel.add(e4);    
      
      
      
      
 }
 
    private void table(){
      
        
              
        
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("nombre");
        tabla.addColumn("");
        tabla.addColumn("");
        tabla.addColumn("");
        
        
        
         String[]p0={"","","",""};
        String[]p1={"HAMBURGER","","",""};
          String[]p2={"PERROS","","",""};
            String[]p3={"SALCHIPAPAS","","",""};
              String[]p4={"LECHUGA","","",""};
              String[]p5={"SALSA","","",""};
              String[]p6={"QUESO","","",""};
              String[]p7={"PAPAS","","",""};
              String[]p8={"TOMATE","","",""};
              String[]p9={"PAN","","",""};
              String[]p10={"CARNE","","",""};
              String[]p11={"SALCHICHAS","","",""};
              String[]p12={"","","",""};

              tabla.addRow(p0);
              tabla.addRow(p1);
              tabla.addRow(p2);
              tabla.addRow(p3);
              tabla.addRow(p4);
              tabla.addRow(p5);
              tabla.addRow(p6);
              tabla.addRow(p7);
              tabla.addRow(p8);
              tabla.addRow(p9);
              tabla.addRow(p10);
              tabla.addRow(p11);
              tabla.addRow(p12);   
              JTable modelo= new JTable(tabla);
              modelo.setBounds(35,100,400,210);
              panel.add(modelo);
              
              
               JLabel fo = new JLabel();
              fo.setText("SU PEDIDO ES:");
              fo.setBounds(130,10,250,30);
              setLayout(null);
               fo.setBackground(Color.black);
               fo.setBackground(java.awt.Color.white);
               fo.setHorizontalAlignment(SwingConstants.CENTER);
               fo.setFont(new Font("Arial",3,25));
              panel.add(fo);
              
              
              
              JButton bton = new JButton ();
              bton.setText("IR A PAGINA DE INICIO");
              bton.setBounds(130,350,250,30);
              panel.add(bton);
              
              MouseListener mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                ventanap1 ventanap1 = new  ventanap1();
                ventanap1.llamar();
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
              bton.addMouseListener(mouse);
        
        
        JLabel fondo = new JLabel(new ImageIcon("kkj.jpg"));
              
              fondo.setBounds(-10,-1,500,500);
              panel.add(fondo);
              setLayout(null);
        
        
    }
    
   

}
