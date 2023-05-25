/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class menu extends JFrame{
    JPanel panel;
    JLabel e,ee,o,P,S,J,K,L,N,Ñ,T,E,Q,oa,Pa,Sa,Ja,Ka,La,Na,Ña,Ta,Ea,Qa;
     JButton btn;
     JTextField c;

    public menu(){
        setTitle("MENU");
        this.setSize(500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        agg();
        this.dispose();
        
    }
    private void agg(){
        colocarpanel();
        colocaretiqueta();
        boton();
        caja();
        //radio();
        
        
        
        
    }
    public void  colocarpanel(){
        panel = new JPanel();
        this.setContentPane(panel);
        setLayout(null);
        setBackground(Color.cyan);
        
     }
    private void colocaretiqueta(){
      this.e = new JLabel();
      this.e.setText("MENU");
      e.setBounds(40, 20, 400, 40);
      e.setOpaque(true);
      e.setBackground(java.awt.Color.BLACK);
      e.setBackground(Color.WHITE);
      e.setHorizontalAlignment(SwingConstants.CENTER);
      e.setFont(new Font("Arial",3,25));
      panel.add(e); 
        
   //ETIQUETAS DE PRECIO
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      oa = new JLabel();
      oa.setText("$5000");
      oa.setBounds(180,150,150,25);
      oa.setOpaque(true);
      oa.setBackground(Color.WHITE);
      oa.setBackground(java.awt.Color.WHITE);
      oa.setHorizontalAlignment(SwingConstants.CENTER);
      oa.setFont(new Font("arial",1,20));
      panel.add(oa);
      
      Pa= new JLabel();
      Pa.setText("$4000 ");
      Pa.setBounds(180,190,150,25);
      Pa.setOpaque(true);
      Pa.setBackground(Color.WHITE);
      Pa.setBackground(java.awt.Color.WHITE);
      Pa.setHorizontalAlignment(SwingConstants.CENTER);
      Pa.setFont(new Font("arial",1,20));
      panel.add(Pa);
      
      Sa = new JLabel();
       Sa.setText("$5000 ");
      Sa.setBounds(180,230,150,25);
      Sa.setOpaque(true);
      Sa.setBackground(Color.WHITE);
      Sa.setBackground(java.awt.Color.WHITE);
      Sa.setHorizontalAlignment(SwingConstants.CENTER);
      Sa.setFont(new Font("arial",1,20));
      panel.add(Sa);
        
      Ja = new JLabel();
      Ja.setText("$1000");
      Ja.setBounds(180,270,150,25);
      Ja.setOpaque(true);
      Ja.setBackground(Color.WHITE);
      Ja.setBackground(java.awt.Color.WHITE);
      Ja.setHorizontalAlignment(SwingConstants.CENTER);
      Ja.setFont(new Font("arial",1,20));
      panel.add(Ja);
      
      Na= new JLabel();
      Na.setText("$1000 ");
      Na.setBounds(180,310,150,25);
      Na.setOpaque(true);
      Na.setBackground(Color.WHITE);
      Na.setBackground(java.awt.Color.WHITE);
      Na.setHorizontalAlignment(SwingConstants.CENTER);
      Na.setFont(new Font("arial",1,20));
      panel.add(Na);
      
       Ka= new JLabel();
       Ka.setText("$1000 ");
       Ka.setBounds(180,350,150,25);
      Ka.setOpaque(true);
      Ka.setBackground(Color.WHITE);
      Ka.setBackground(java.awt.Color.WHITE);
      Ka.setHorizontalAlignment(SwingConstants.CENTER);
      Ka.setFont(new Font("arial",1,20));
      panel.add(Ka);
        
        La= new JLabel();
      La.setText("$1000");
      La.setBounds(180,390,150,25);
      La.setOpaque(true);
      La.setBackground(Color.WHITE);
      La.setBackground(java.awt.Color.WHITE);
      La.setHorizontalAlignment(SwingConstants.CENTER);
      La.setFont(new Font("arial",1,20));
      panel.add(La);
      
      Ña= new JLabel();
      Ña.setText("$ 1000");
      Ña.setBounds(180,430,150,25);
      Ña.setOpaque(true);
      Ña.setBackground(Color.WHITE);
      Ña.setBackground(java.awt.Color.WHITE);
      Ña.setHorizontalAlignment(SwingConstants.CENTER);
      Ña.setFont(new Font("arial",1,20));
      panel.add(Ña);
      
       Ta= new JLabel();
       Ta.setText("$ 1000");
      Ta.setBounds(180,470,150,25);
      Ta.setOpaque(true);
      Ta.setBackground(Color.WHITE);
      Ta.setBackground(java.awt.Color.WHITE);
      Ta.setHorizontalAlignment(SwingConstants.CENTER);
      Ta.setFont(new Font("arial",1,20));
      panel.add(Ta);
        
        Ea= new JLabel();
      Ea.setText("$1000");
      Ea.setBounds(180,510,150,25);
      Ea.setOpaque(true);
      Ea.setBackground(Color.WHITE);
      Ea.setBackground(java.awt.Color.WHITE);
      Ea.setHorizontalAlignment(SwingConstants.CENTER);
     Ea.setFont(new Font("arial",1,20));
      panel.add(Ea);
       
      Qa= new JLabel();
      Qa.setText("$ 1000");
      Qa.setBounds(180,550,150,25);
      Qa.setOpaque(true);
      Qa.setBackground(Color.WHITE);
      Qa.setBackground(java.awt.Color.WHITE);
      Qa.setHorizontalAlignment(SwingConstants.CENTER);
      Qa.setFont(new Font("arial",1,20));
      panel.add(Qa);
    
//  ETIQUETAS DE NOMBRES
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      o = new JLabel();
      o.setText("HAMBURGER:");
      o.setBounds(20,150,150,25);
      o.setOpaque(true);
      o.setBackground(Color.WHITE);
      o.setHorizontalAlignment(SwingConstants.CENTER);
      o.setFont(new Font("arial",1,20));
      panel.add(o);
      
      P= new JLabel();
      P.setText("PERROS: ");
      P.setBounds(20,190,150,25);
      P.setOpaque(true);
      P.setBackground(Color.BLACK);
      P.setBackground(java.awt.Color.WHITE);
      P.setHorizontalAlignment(SwingConstants.CENTER);
      P.setFont(new Font("arial",1,20));
      panel.add(P);
      
      S = new JLabel();
       S.setText("SALCHIPAPAS: ");
      S.setBounds(20,230,150,25);
      S.setOpaque(true);
      S.setBackground(Color.BLACK);
      S.setBackground(java.awt.Color.WHITE);
      S.setHorizontalAlignment(SwingConstants.CENTER);
      S.setFont(new Font("arial",1,20));
      panel.add(S);
        
      J = new JLabel();
      J.setText("LECHUGA:");
      J.setBounds(20,270,150,25);
      J.setOpaque(true);
      J.setBackground(Color.BLACK);
      J.setBackground(java.awt.Color.WHITE);
      J.setHorizontalAlignment(SwingConstants.CENTER);
      J.setFont(new Font("arial",1,20));
      panel.add(J);
      
      N= new JLabel();
      N.setText("SALSA: ");
      N.setBounds(20,310,150,25);
      N.setOpaque(true);
      N.setBackground(Color.BLACK);
      N.setBackground(java.awt.Color.WHITE);
      N.setHorizontalAlignment(SwingConstants.CENTER);
      N.setFont(new Font("arial",1,20));
      panel.add(N);
      
      K= new JLabel();
      K.setText("QUESO: ");
      K.setBounds(20,350,150,25);
      K.setOpaque(true);
      K.setBackground(Color.BLACK);
      K.setBackground(java.awt.Color.WHITE);
      K.setHorizontalAlignment(SwingConstants.CENTER);
      K.setFont(new Font("arial",1,20));
      panel.add(K);
        
        L= new JLabel();
      L.setText("PAPAS:");
      L.setBounds(20,390,150,25);
      L.setOpaque(true);
      L.setBackground(Color.BLACK);
      L.setBackground(java.awt.Color.WHITE );
      L.setHorizontalAlignment(SwingConstants.CENTER);
      L.setFont(new Font("arial",1,20));
      panel.add(L);
      
      Ñ= new JLabel();
      Ñ.setText("TOMATE: ");
      Ñ.setBounds(20,430,150,25);
      Ñ.setOpaque(true);
      Ñ.setBackground(Color.BLACK);
      Ñ.setBackground(java.awt.Color.WHITE);
      Ñ.setHorizontalAlignment(SwingConstants.CENTER);
      Ñ.setFont(new Font("arial",1,20));
      panel.add(Ñ);
      
       T= new JLabel();
       T.setText("PAN: ");
      T.setBounds(20,470,150,25);
      T.setOpaque(true);
      T.setBackground(Color.BLACK);
      T.setBackground(java.awt.Color.WHITE);
      T.setHorizontalAlignment(SwingConstants.CENTER);
      T.setFont(new Font("arial",1,20));
      panel.add(T);
        
        E= new JLabel();
      E.setText("CARNE:");
      E.setBounds(20,510,150,25);
      E.setOpaque(true);
      E.setBackground(Color.WHITE);
      E.setHorizontalAlignment(SwingConstants.CENTER);
     E.setFont(new Font("arial",1,20));
      panel.add(E);
       
      Q= new JLabel();
      Q.setText("SALCHICHAS: ");
      Q.setBounds(20,550,150,25);
      Q.setOpaque(true);
      Q.setBackground(Color.BLACK);
      Q.setBackground(java.awt.Color.WHITE);
      Q.setHorizontalAlignment(SwingConstants.CENTER);
      Q.setFont(new Font("arial",1,20));
      panel.add(Q);
      
   
        
    }
      private void caja(){
      c = new JTextField();
      c.setBounds(20, 100, 150, 30);
      c.setText("DIGITE SU NOMBRE...");
      //panel.add(c);
      
      
        }
    public void boton(){
       btn = new JButton();
       btn.setText("SIGUIENTE");
       btn.setBounds(150,600,100,50);
       btn.setEnabled(true);
      panel.add(btn);
      ventas ventas = new ventas();
      
      MouseListener mou = new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent me) {
               ventas.setVisible(true); 
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
      btn.addMouseListener(mou);
      
      
      ee = new JLabel(new ImageIcon("f.jpg"));
      ee.setBounds(-100, -100, 700, 1000);
       panel.add(ee);
    
    }
        
      
}
