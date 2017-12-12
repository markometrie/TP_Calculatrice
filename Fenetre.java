import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Fenetre extends JFrame {
	
	
	
	
	JButton bouton = new JButton("+");
	JButton bouton2 = new JButton("*");
	JButton bouton3 = new JButton("-");
	JButton bouton4 = new JButton("/");
	JButton bouton5 = new JButton("%");
	JButton bouton6 = new JButton(".");

	
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
	
	


    private JLabel label = new JLabel(" ");
    private JPanel container = new JPanel();


	

    

 // Boolean qui def si on stop ou lance l'action
    
    private boolean animated = true;
    private boolean backX, backY;
    private double x,y;

    
	
public Fenetre() {
	
	this.setTitle("Calculatrice");
	this.setSize(400,400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

	
	

	container.setBackground(Color.white);
	container.setLayout(new BorderLayout());

	Font police = new Font("Tahoma", Font.BOLD,16);
	label.setFont(police);
	label.setForeground(Color.blue);label.setHorizontalAlignment(JLabel.CENTER);
	container.add(label, BorderLayout.NORTH);
	this.setContentPane(container);
	this.setVisible(true);
	
	
	
	
	
    JPanel buttonPanel = new JPanel(new GridLayout(0, 2)); 

    buttonPanel.add(bouton);
    buttonPanel.add(bouton2);
    buttonPanel.add(bouton3);
    buttonPanel.add(bouton4);
    buttonPanel.add(bouton5);
    buttonPanel.add(bouton6);
    

    
    this.add(buttonPanel, BorderLayout.SOUTH);
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
    
    
    bouton.addActionListener(new BoutonListener());
    bouton2.addActionListener(new BoutonListener());
    bouton3.addActionListener(new BoutonListener());
    bouton4.addActionListener(new BoutonListener());
    bouton5.addActionListener(new BoutonListener());
    bouton6.addActionListener(new BoutonListener());



    num0.addActionListener(new BoutonListener());
    
    num1.addActionListener(new BoutonListener());
    num2.addActionListener(new BoutonListener());
    num3.addActionListener(new BoutonListener());
    num4.addActionListener(new BoutonListener());
    num5.addActionListener(new BoutonListener());
    num6.addActionListener(new BoutonListener());
    num7.addActionListener(new BoutonListener());
    num8.addActionListener(new BoutonListener());
    num9.addActionListener(new BoutonListener());

          
	    
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
      


      class BoutonListener implements ActionListener{
    	  
    	  public void actionPerformed(ActionEvent arg0) {
    		  
    		  if(arg0.getSource() == bouton)
    				label.setText("+");
    		  
    		  if(arg0.getSource() == bouton2)
    				label.setText("*"); 
    			
    			if(arg0.getSource() == bouton3)
    				label.setText("-");
    			
    			if(arg0.getSource() == bouton4)
    				label.setText("/");
    			
    			if(arg0.getSource() == bouton5)
    				label.setText("%");
    			
    			if(arg0.getSource() == bouton6)
    				label.setText(".");
    			 
    			if(arg0.getSource() == num0)
    				label.setText("0");
    			
    			if(arg0.getSource() == num1)
    				label.setText("1");
    		
    			if(arg0.getSource() == num2)
    				label.setText("2");
    			
    			if(arg0.getSource() == num3)
    				label.setText("3");
    			
    			if(arg0.getSource() == num4)
    				label.setText("4");
    			
    			if(arg0.getSource() == num5)
    				label.setText("5");
    			
    			if(arg0.getSource() == num6)
    				label.setText("6");
    			
    			if(arg0.getSource() == num7)
    				label.setText("7");
    			
    			if(arg0.getSource() == num8)
    				label.setText("8");
    			
    			if(arg0.getSource() == num9)
    				label.setText("9");
    		  
    		  
    	  
    	  }}}



	
		
		
 // deuxieme commit	
	
		


	



    
    



		
	

    	


		
	

