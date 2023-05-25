/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pf;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class start extends JFrame{
     
    public start (){
        setTitle("PERSONAL");
        this.setSize(350,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        aggcomponentes();
    }
    private void aggcomponentes(){
        aggpanel();
    }
    private void aggpanel(){
        JPanel panel = new JPanel();
         this.setContentPane(panel);
          setLayout(null);
    }
}
