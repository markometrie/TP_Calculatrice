
import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Calculatrice extends JFrame  {
	
	
	
	
	JButton bouton = new JButton("+");
	JButton bouton2 = new JButton("*");
	JButton bouton3 = new JButton("-");
	JButton bouton4 = new JButton("/");
	JButton bouton5 = new JButton("C");
	JButton bouton6 = new JButton("=");


	
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
	JButton num10 = new JButton(".");

	
	


    private JLabel label = new JLabel("");
    private JPanel container = new JPanel();
    protected double chiffre1;
	 protected String operateur = "";
	protected boolean clicOperateur = false, update = false;
	


	

    

 
    
	
public Calculatrice() {
	
	this.setTitle("Calculatrice");
	this.setSize(250,300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);

	// On initialise le conteneur avc les composants
	
			initComposant();
			
			// Conteneur
			
			this.setContentPane(container);
			this.setVisible(true);
			
}

private void initComposant() {
	

	container.setBackground(Color.white);
	container.setLayout(new BorderLayout());

	Font police = new Font("Tahoma", Font.BOLD,16);
	label.setFont(police);
	label.setForeground(Color.blue);label.setHorizontalAlignment(JLabel.CENTER);
	container.add(label, BorderLayout.NORTH);
	this.setContentPane(container);
	this.setVisible(true);
	
	
    
     
     
    
	
	
    JPanel buttonPanel = new JPanel(new GridLayout(0, 1)); 

    buttonPanel.add(bouton);
    buttonPanel.add(bouton2);
    buttonPanel.add(bouton3);
    buttonPanel.add(bouton4);
    buttonPanel.add(bouton5);
    buttonPanel.add(bouton6);
    

    
    this.add(buttonPanel, BorderLayout.EAST);
    this.setVisible(true);

    

	
    
    
    JPanel num = new JPanel(new GridLayout(0, 3)); 

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
    num.add(num10);

    

    
    this.add(num, BorderLayout.SOUTH);
    this.setVisible(true);
    
    
    bouton.addActionListener(new PlusListener());
    bouton2.addActionListener(new MultiListener());
    bouton3.addActionListener(new MoinsListener());
    bouton4.addActionListener(new DivListener());
    bouton5.addActionListener(new ResetListener());
    bouton6.addActionListener(new EgalListener());


    


    num0.addActionListener(new ChiffreListener());
    
    num1.addActionListener(new ChiffreListener());
    num2.addActionListener(new ChiffreListener());
    num3.addActionListener(new ChiffreListener());
    num4.addActionListener(new ChiffreListener());
    num5.addActionListener(new ChiffreListener());
    num6.addActionListener(new ChiffreListener());
    num7.addActionListener(new ChiffreListener());
    num8.addActionListener(new ChiffreListener());
    num9.addActionListener(new ChiffreListener());
    num10.addActionListener(new ChiffreListener());



          
	    
	    go();
	  }





private void go(){  
	  
    	
	  if (operateur.equals("+")){
          chiffre1 = chiffre1 + Double.valueOf(label.getText()).doubleValue();
          label.setText(String.valueOf(chiffre1));
      }
      if (operateur.equals("-")){
          chiffre1 = chiffre1 - Double.valueOf(label.getText()).doubleValue();
          label.setText(String.valueOf(chiffre1));
      }
      if (operateur.equals("*")){
          chiffre1 = chiffre1 * Double.valueOf(label.getText()).doubleValue();
          label.setText(String.valueOf(chiffre1));
      }
      if (operateur.equals("/")){
          try{
              chiffre1 = chiffre1 / Double.valueOf(label.getText()).doubleValue();
              label.setText(String.valueOf(chiffre1));
          }catch(ArithmeticException e){
              label.setText("0");
          }
      }
    	
     
      
      //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
      
      try {
    	  
        Thread.sleep(3);
        
      } catch (InterruptedException e) {
    	  
        e.printStackTrace();
        
      
      }}
      


   
//Listener utilisé pour les chiffres
//Permet de stocker les chiffres et de les afficher


      class ChiffreListener implements ActionListener {
           public void actionPerformed(ActionEvent e){
      //On affiche le chiffre additionnel dans le label
      String str = ((JButton)e.getSource()).getText();
      if(update){
        update = false;
      }
      else{
        if(!label.getText().equals("0"))
          str = label.getText() + str;
      }
      label.setText(str);
    }
  }



  //Listener affecté au bouton =
class EgalListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      go();
      update = true;
      clicOperateur = false;
    }
}
 //Listener affecté au bouton +

class PlusListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        go();
        label.setText(String.valueOf(chiffre1));
      }
      else{
        chiffre1 = Double.valueOf(label.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "+";
      update = true;
    }
}
//Listener affecté au bouton -

class MoinsListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        go();
        label.setText(String.valueOf(chiffre1));
      }
      else{
        chiffre1 = Double.valueOf(label.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "-";
      update = true;
    }
}
//Listener affecté au bouton *

class MultiListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        go();
        label.setText(String.valueOf(chiffre1));
      }
      else{
        chiffre1 = Double.valueOf(label.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "*";
      update = true;
    }
}
//Listener affecté au bouton /

class DivListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      if(clicOperateur){
        go();
        label.setText(String.valueOf(chiffre1));
      }
      else{
        chiffre1 = Double.valueOf(label.getText()).doubleValue();
        clicOperateur = true;
      }
      operateur = "/";
      update = true;

    
    
    }
}
//Listener affecté au bouton de remise à zéro

class ResetListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0){
      clicOperateur = false;
      update = true;
      chiffre1 = 0;
      operateur = "";
      label.setText("");
      //System.out.println("j'ai appuye sur reset");
    }
  }     

    		  
    		  
    	
	
}
    	       