import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Box;



 // 1er push : 11/12/17




public class Fenetre extends JFrame implements ActionListener{
	
	
	
	
	JButton bouton = new JButton("+");
	JButton bouton2 = new JButton("*");
	JButton bouton3 = new JButton("-");
	JButton bouton4 = new JButton("/");
	JButton bouton5 = new JButton("%");
	JButton bouton6 = new JButton(" ");

	
	JButton num0 = new JButton("0");
	JButton num1 = new JButton("1");
	JButton num2 = new JButton("2");
	JButton num3 = new JButton("3");
	JButton num4 = new JButton("4");
	JButton num5 = new JButton("5");
	JButton num6 = new JButton("6");
	JButton num7 = new JButton("7");
	JButton num8 = new JButton("8");
	JButton num9 = new JButton("9");






	

    

 // Boolean qui def si on stop ou lance l'action
    
    private boolean animated = true;
    private boolean backX, backY;
    private double x,y;

    
	
public Fenetre() {
	
	this.setTitle("Calculatrice");
	this.setSize(400,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

	
 /*   JPanel b1 = new JPanel();

    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
    
    b1.setBorder(BorderFactory.createEmptyBorder(150, 10, -50, 800));
    b1.add(Box.createHorizontalGlue());
  
    
    b1.add(new JButton("1"));
    b1.add(new JButton("2"));
    
    JPanel b2 = new JPanel();

    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
    b2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 800));
    b2.add(Box.createHorizontalGlue());

    b2.add(new JButton("3"));
    b2.add(new JButton("4"));
    
    JPanel b3 = new JPanel();

    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
    b3.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 800));
    b3.add(Box.createHorizontalGlue());

    b3.add(new JButton("5"));
    b3.add(new JButton("6"));

    JPanel b4 = new JPanel();

    b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
    b4.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 800));
    b4.add(Box.createHorizontalGlue());
    b4.add(new JButton("7"));
    b4.add(new JButton("8"));
    
    JPanel b5 = new JPanel();

    b5.setLayout(new BoxLayout(b5, BoxLayout.LINE_AXIS));
    b5.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 800));
    b5.add(Box.createHorizontalGlue());
    b5.add(new JButton("9"));
    b5.add(new JButton("0"));

    
    JPanel b6 = new JPanel();

  //  Box b6 = Box.createVerticalBox();
    b6.setLayout(new BoxLayout(b6, BoxLayout.PAGE_AXIS));

   // setPreferredSize(new Dimension(80, 90));
    b6.add(b1);
    b6.add(b2);
    b6.add(b3);
    b6.add(b4);
    b6.add(b5);
   
    this.getContentPane().add(b6);
    this.setVisible(true);
*/
    
    JPanel buttonPanel = new JPanel(new GridLayout(0, 2)); 

    buttonPanel.add(bouton);
    buttonPanel.add(bouton2);
    buttonPanel.add(bouton3);
    buttonPanel.add(bouton4);
    buttonPanel.add(bouton5);
    buttonPanel.add(bouton6);
    

    
    this.add(buttonPanel, BorderLayout.WEST);
    this.setVisible(true);

    
    
    JPanel num = new JPanel(new GridLayout(0, 2)); 

    num.add(num0);
    num.add(num1);
    num.add(num2);
    num.add(num3);
    num.add(num4);
    num.add(num5);
    num.add(num6);
    num.add(num7);
    num.add(num8);
    num.add(num9);

    

    
    this.add(num, BorderLayout.EAST);
    this.setVisible(true);


    // Envoie du premier commit
    
    
    /*
    
    JPanel ope1 = new JPanel();

    ope1.setLayout(new BoxLayout(ope1, BoxLayout.LINE_AXIS));
    
    ope1.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 50));
    ope1.add(Box.createHorizontalGlue());
   
    
    ope1.add(new JButton("+"));
    ope1.add(new JButton("-"));
    
    
    
    JPanel ope2 = new JPanel();

    ope2.setLayout(new BoxLayout(ope2, BoxLayout.LINE_AXIS));
    
    ope2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 50));
    ope2.add(Box.createHorizontalGlue());

    
    ope2.add(new JButton("/"));
    ope2.add(new JButton("*"));
    
    
    
    
    JPanel ope3 = new JPanel();

    ope3.setLayout(new BoxLayout(ope3, BoxLayout.LINE_AXIS));
   
    ope3.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 50));
    ope3.add(Box.createHorizontalGlue());

    
    ope3.add(new JButton("%"));
    ope3.add(new JButton(" Entree "));
    
    JPanel ope6 = new JPanel();
    
    //  Box b6 = Box.createVerticalBox();
    ope6.setLayout(new BoxLayout(ope6, BoxLayout.PAGE_AXIS));

   // setPreferredSize(new Dimension(80, 90));
    ope6.add(ope1);
    ope6.add(ope2);
    ope6.add(ope3);


    


    this.getContentPane().add(ope6);
    this.setVisible(true);



	

	
	/*	
		this.setTitle("Calculatrice");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		

		this.setLayout(new GridLayout(5,1));
		
		this.getContentPane().add(new JButton("0"));

		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.getContentPane().add(new JButton("6"));
		this.getContentPane().add(new JButton("7"));
		this.getContentPane().add(new JButton("8"));
		this.getContentPane().add(new JButton("10"));
		
	    this.setVisible(true);

		
		
	
				
		 

		    
		    
		    
		    
	/*	    container.add(label, BorderLayout.NORTH);
		    this.setContentPane(container);
		    this.setVisible(true);
  */

		
	    
	    
	    
	          
	    
	    go();
	  }


private void go(){  
	  
	  
	  
  
    
    //Dans cet exemple, j'utilise une boucle while
    //Vous verrez qu'elle fonctionne très bien
    
    while(this.animated){
    	
    	
    	
     
      
      //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
      
      try {
    	  
        Thread.sleep(3);
        
      } catch (InterruptedException e) {
    	  
        e.printStackTrace();
        
      
      }}}
      




    
    


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	

    	


		
		
}}
