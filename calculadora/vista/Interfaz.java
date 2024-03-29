package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Interfaz extends JFrame {
    public JButton jButton0;
    public JButton jButton1;
    public JButton jButton2;
    public JButton jButton3;
    public JButton jButton4;
    public JButton jButton5;
    public JButton jButton6;
    public JButton jButton7;
    public JButton jButton8;
    public JButton jButton9;
    public JButton jButtonSum;
    public JButton jButtonRes;
    public JButton jButtonMul;
    public JButton jButtonDiv;
    public JButton jButtonMm;
    public JButton jButtonPunto;
    public JButton jButtonC;
    public JButton jButtonCE;
    public JButton jButtonInv;
    public JButton jButtonTot;
    
    public JTextField txtpantalla;
    
    public Interfaz() {
        initComponents();
    }
        
    private void initComponents() {   
        txtpantalla = new JTextField();
        jButton0 = new JButton();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButtonSum = new JButton();
        jButtonRes = new JButton();
        jButtonMul = new JButton();
        jButtonDiv = new JButton();
        jButtonMm = new JButton();
        jButtonPunto = new JButton();
        jButtonC = new JButton();
        jButtonCE = new JButton();
        jButtonInv = new JButton();
        jButtonTot = new JButton();
               
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);         
        this.setBounds(10,10,280,250);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        setLocationRelativeTo(null);
        
        Font fuente = new Font("Arial", 0, 16);    
        txtpantalla.setBounds(10, 5, 260, 50);
        txtpantalla.setFont(fuente);
        txtpantalla.setHorizontalAlignment(JTextField.RIGHT); 
        add(txtpantalla);
        

        jButton1.setFont(fuente);    
        jButton1.setBackground(new Color(0, 102, 102));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("1"); 
        jButton1.setBounds(10,60,45,30);
        add(jButton1);
        
        jButton4.setFont(fuente);    
        jButton4.setBackground(new Color(0, 102, 102));
        jButton4.setForeground(new Color(255, 255, 255));
        jButton4.setText("4");        
        jButton4.setBounds(10,95,45,30);
        add(jButton4);
        
        jButton7.setFont(fuente);    
        jButton7.setBackground(new Color(0, 102, 102));
        jButton7.setForeground(new Color(255, 255, 255));
        jButton7.setText("7");  
        jButton7.setBounds(10,130,45,30);
        add(jButton7); 

        jButton0.setFont(fuente);    
        jButton0.setBackground(new Color(0, 102, 102));
        jButton0.setForeground(new Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.setBounds(10,165,45,30);
        add(jButton0); 
        
        jButton2.setFont(fuente);    
        jButton2.setBackground(new Color(0, 102, 102));
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setText("2");        
        jButton2.setBounds(60,60,45,30);
        add(jButton2);
        
        jButton5.setFont(fuente);    
        jButton5.setBackground(new Color(0, 102, 102));
        jButton5.setForeground(new Color(255, 255, 255));
        jButton5.setText("5");  
        jButton5.setBounds(60,95,45,30);
        add(jButton5); 

        jButton8.setFont(fuente);    
        jButton8.setBackground(new Color(0, 102, 102));
        jButton8.setForeground(new Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setBounds(60,130,45,30);
        add(jButton8); 
        
        Font fuente2 = new Font("Arial", 0, 9);
        jButtonMm.setFont(fuente2);    
        jButtonMm.setBackground(new Color(0, 102, 102));
        jButtonMm.setForeground(new Color(255, 255, 255));
        jButtonMm.setText("+/-");
        jButtonMm.setBounds(60,165,45,30);
        add(jButtonMm); 
        
        jButton3.setFont(fuente);    
        jButton3.setBackground(new Color(0, 102, 102));
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setText("3");        
        jButton3.setBounds(110,60,45,30);
        add(jButton3);
        
        jButton6.setFont(fuente);    
        jButton6.setBackground(new Color(0, 102, 102));
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setText("6");  
        jButton6.setBounds(110,95,45,30);
        add(jButton6); 

        jButton9.setFont(fuente);    
        jButton9.setBackground(new Color(0, 102, 102));
        jButton9.setForeground(new Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setBounds(110,130,45,30);
        add(jButton9); 

        jButtonPunto.setFont(fuente);    
        jButtonPunto.setBackground(new Color(0, 102, 102));
        jButtonPunto.setForeground(new Color(255, 255, 255));
        jButtonPunto.setText(".");        
        jButtonPunto.setBounds(110,165,45,30);
        add(jButtonPunto);
        
        jButtonSum.setFont(fuente);    
        jButtonSum.setBackground(new Color(0, 102, 102));
        jButtonSum.setForeground(new Color(255, 255, 255));
        jButtonSum.setText("+");        
        jButtonSum.setBounds(160,60,45,30);
        add(jButtonSum);
        
        jButtonRes.setFont(fuente);    
        jButtonRes.setBackground(new Color(0, 102, 102));
        jButtonRes.setForeground(new Color(255, 255, 255));
        jButtonRes.setText("-"); 
        jButtonRes.setBounds(160,95,45,30);
        add(jButtonRes);
        
        
        jButtonMul.setFont(fuente);    
        jButtonMul.setBackground(new Color(0, 102, 102));
        jButtonMul.setForeground(new Color(255, 255, 255));
        jButtonMul.setText("*");  
        jButtonMul.setBounds(160,130,45,30);
        add(jButtonMul); 

        jButtonDiv.setFont(fuente);    
        jButtonDiv.setBackground(new Color(0, 102, 102));
        jButtonDiv.setForeground(new Color(255, 255, 255));
        jButtonDiv.setText("/");
        jButtonDiv.setBounds(160,165,45,30);
        add(jButtonDiv); 

        jButtonC.setFont(fuente);    
        jButtonC.setBackground(new Color(0, 102, 102));
        jButtonC.setForeground(new Color(255, 255, 255));
        jButtonC.setText("C");        
        jButtonC.setBounds(210,60,60,30);
        add(jButtonC);
        
        jButtonCE.setFont(fuente);    
        jButtonCE.setBackground(new Color(0, 102, 102));
        jButtonCE.setForeground(new Color(255, 255, 255));
        jButtonCE.setText("CE"); 
        jButtonCE.setBounds(210,95,60,30);
        add(jButtonCE);
        
        
        jButtonInv.setFont(fuente);    
        jButtonInv.setBackground(new Color(0, 102, 102));
        jButtonInv.setForeground(new Color(255, 255, 255));
        jButtonInv.setText("1/x");  
        jButtonInv.setBounds(210,130,60,30);
        add(jButtonInv); 

        jButtonTot.setFont(fuente);    
        jButtonTot.setBackground(new Color(0, 102, 102));
        jButtonTot.setForeground(new Color(255, 255, 255));
        jButtonTot.setText("=");
        jButtonTot.setBounds(210,165,60,30);
        add(jButtonTot);       
 }
        
}
