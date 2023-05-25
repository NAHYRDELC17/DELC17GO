/*
 * To change this license header, c
hoose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ventas extends JFrame  {
    JPanel panel;
    JLabel e,ee,etis,o;
    JButton RadioBoton1,RadioBoton2,RadioBoton3,R1,R2,R3,R4,R5,R6,R7,R8,R9;
    JTextField caja;
    int H,P=0,SP=0,Q=0,L=0,S=0,PP=0,TM=0,PAN=0,CN=0,SL=0,valor;
    JButton bv;           
    int yyyy;
 

    public ventas (){
        
        setTitle("PARCIAL FINAL");
        this.setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        aggcomponentes();
        
        
        
    }

    private void aggcomponentes (){
                
        colocarpanel();
        colocaretiqueta();
        //radio();
        //caja();
     //  colocarboton();
      //boton();
        
    }
    
       private void colocarpanel(){
       this.panel = new JPanel();
       this.setContentPane(panel);
       setLayout(null);
      // panel.setBackground(Color.cyan);
            
            
            
        }
      public void colocaretiqueta(){
          
      this.e = new JLabel();
      e.setText("LISTA DE COMIDA");
      e.setBounds(120, 20, 450, 40);
      e.setOpaque(true);
      e.setBackground(java.awt.Color.BLACK);
      e.setBackground(Color.WHITE);
      e.setHorizontalAlignment(SwingConstants.CENTER);
      e.setFont(new Font("Arial",3,25));
      panel.add(e); 
       
      
      
      
      etis= new JLabel();
      etis.setText("¿Que ingredientes extra desea?");
      etis.setBounds(290,150,350,30);
      etis.setBackground(java.awt.Color.BLACK);
      etis.setOpaque(true);
      etis.setBackground(Color.WHITE);
      etis.setHorizontalAlignment(SwingConstants.CENTER);
      etis.setFont(new Font("arial",1,20));
      panel.add(etis);
      
     
      o = new JLabel();
      o.setText("SEÑOR(A): ");
      o.setBounds(40,150,150,30);
      o.setOpaque(true);
      o.setBackground(Color.WHITE);
      o.setHorizontalAlignment(SwingConstants.CENTER);
      o.setFont(new Font("arial",1,20));
      panel.add(o);
       
         
       
    JButton ba = new JButton();
    ba.setText("AGREGAR");
    ba.setBounds(300,400,140,30);
    panel.add(ba);
    
    RadioBoton1 = new JButton();
    RadioBoton1.setText("HAMBURGER");
    RadioBoton1.setBounds(90, 90, 140, 30);
    RadioBoton1.setEnabled(true);
    panel.add(RadioBoton1);
     MouseListener rrr = new MouseListener() {
        
          @Override
          public void mouseClicked(MouseEvent me) {
             
              
              H=(H+5000); 
             // compra compra = new compra();
              //compra.arregl.add(new persona(H));
          
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
    RadioBoton1.addMouseListener(rrr);
       
        
        
        
        
   
      
    
    
    RadioBoton2 = new JButton();
    RadioBoton2.setText("PERROS");
    RadioBoton2.setBounds(300, 90, 100, 30);
     RadioBoton2.setEnabled(true);
    panel.add(RadioBoton2);
    
    MouseListener mmm = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              SP=+4000;
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
    RadioBoton2.addMouseListener(mmm);
   
    
    
    RadioBoton3 = new JButton();
    RadioBoton3.setText("SALCHIPAPA");
    RadioBoton3.setBounds(500, 90, 110, 30);
    RadioBoton3.setEnabled(true);
    panel.add(RadioBoton3);
     MouseListener mm = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              P=+5000;
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
    
    RadioBoton3.addMouseListener(mm);
    
    
    R1 = new JButton();
    R1.setBounds(90, 200, 100, 30);
    R1.setText("LECHUGA");
    R1.setEnabled(true);
    panel.add(R1);
    MouseListener r1 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              Q=+1000;
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
    R1.addMouseListener(r1);
    
    R2 = new JButton();
    R2.setBounds(90, 250, 100, 30);
    R2.setText("SALSA");
      R2.setEnabled(true);
    panel.add(R2);
      
    MouseListener r2 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              L=+1000;
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
    R2.addMouseListener(r2);
    
    
    R3 = new JButton();
    R3.setBounds(90, 300, 100, 30);
    R3.setText("QUESO");
    R3.setEnabled(true);
    panel.add(R3);
     
    MouseListener r3 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              S=+1000;
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
    R3.addMouseListener(r3);
    
    
    R4 = new JButton();
    R4.setBounds(300, 200, 100, 30);
    R4.setText("PAPAS");
    R4. setEnabled(true);
    panel.add(R4);
     
    MouseListener r4 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              PP=+1000;
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
    R4.addMouseListener(r4);
    
    
    
    R5 = new JButton();
    R5.setBounds(300, 250, 100, 30);
    R5.setEnabled(true);
    R5.setText("TOMATE");
    panel.add(R5);
      
    MouseListener r5 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              TM=+1000;
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
    R5.addMouseListener(r5);
    
    
    R6 = new JButton();
    R6.setBounds(300, 300, 100, 30);
    R6.setEnabled(true);
    R6.setText("PAN");
    panel.add(R6);
      
    MouseListener r6 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              PAN=+1000;
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
    R6.addMouseListener(r6);
    
    
    R7 = new JButton();
    R7.setBounds(500, 200, 100, 30);
    R7.setEnabled(true);
    R7.setText("CARNE");
    panel.add(R7);
      
    MouseListener r7 = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              CN=+1000;
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
    R7.addMouseListener(r7);
    
    
    R8 = new JButton();
    R8.setBounds(500, 250, 100, 30);
    R8.setEnabled(true);
    R8.setText("SALCHICHA");
    panel.add(R8);
      
    MouseListener r8= new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              SL=+1000;
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
    R8.addMouseListener(r8);
    
    
       
    
    R9 = new JButton();
    R9.setText("ninguno  xd");
    R9.setBounds(500, 300, 100, 30);
    R9.setEnabled(true);
    panel.add(R9);
        
     MouseListener rb = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            valor=0;caja = new JTextField();
      
            caja.setBounds(90, 350, 100, 30);
      
            caja.setText("Valor: "+(valor=+H+SP+P+Q+L+S+PP+TM+PAN+CN+SL));
           
            
            panel.add(caja);
            
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
    ba.addMouseListener(rb);
    
    
            
     JLabel i = new JLabel();
    i.setBounds(530,380,100,50);
    i.setText("COMER");
    panel.add(i);
    
         
     
  
       JLabel ee = new JLabel(new ImageIcon("porf.jpg"));
      ee.setBounds(-20, -50, 700, 508);
     panel.add(ee);
       
   
        
        
        
            JButton bc = new JButton();
       bc.setText("REGRESAR");
       bc.setBounds(300,350,100,30);
       panel.add(bc);
       
       MouseListener mo = new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent me) {
                    menu mee = new menu();
                    ventas v = new ventas();
                    v.setVisible(false);
                    mee.setVisible(true);
                    
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
       bc.addMouseListener(mo);
       
       
       
            JButton bs = new JButton();
       bs.setText("EAT");
       bs.setBounds(500,350,100,50);
       ImageIcon gokug = new ImageIcon("cccc.jpg"); // crear obecjto imagen
   bs.setIcon(new ImageIcon(gokug.getImage().getScaledInstance(bs.getWidth(), bs.getHeight(),Image.SCALE_SMOOTH)));//agg img al boton
  // boton2.setBackground(java.awt.Color.blue);
        MouseListener y = new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent me) {
              compra tt = new compra();
              tt.setVisible(true);
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
        bs.addMouseListener(y);
    panel.add(bs);
    
   
}
      public void mostrarH(){
       
                      
          }
          
          
          
          
      }
      
        
        
    
     
  