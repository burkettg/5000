//: Object/players/Player2Name.java
package com.players;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Player2Name  {	
	public Player2Name() {		
		JTextField playerOne = new JTextField(8);
	      JTextField playerTwo = new JTextField(8);
	      JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Player 1 Name: "));
	      myPanel.add(playerOne);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Player 2 Name: "));
	      myPanel.add(playerTwo);
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Please enter player names :)", JOptionPane.OK_CANCEL_OPTION);
	      if (result == JOptionPane.OK_OPTION) {
	    	  String a = playerOne.getText();
	    	  if ((a != null) && (a.length() > 0)) {
	    			String play1 = a;
	    			com.Fivestart.setName1("p1: " + play1);
	    			} else {
	    				com.Fivestart.setName1("Player 1");	
	    			}
	    	 
	    	  String b = playerTwo.getText();
	    	  if ((b != null) && (b.length() > 0)) {
	    			String play2 = b;
	    			com.Fivestart.setName2("p2: " + play2);
	    			} else {
  				com.Fivestart.setName2("Player 2");	
  			  }
	    	  
	      } else {
	    	  com.Fivestart.setName1("Player 1");	
	    	  com.Fivestart.setName2("Player 2");	
	      }
	    	 
	}

	public void Player2Name() {
		// TODO Auto-generated method stub
		
	}		
}