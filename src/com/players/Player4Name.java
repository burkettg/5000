//: Object/players/Player4Name.java
package com.players;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Player4Name  {	
	public Player4Name() {		
		JTextField playerOne = new JTextField(8);
	      JTextField playerTwo = new JTextField(8);
	      JTextField playerThree = new JTextField(8);
	      JTextField playerFour = new JTextField(8);
	      JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Player 1 Name: "));
	      myPanel.add(playerOne);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Player 2 Name: "));
	      myPanel.add(playerTwo);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Player 3 Name: "));
	      myPanel.add(playerThree);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Player 4 Name: "));
	      myPanel.add(playerFour);
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
	    	  String c = playerThree.getText();
	    	  if ((c != null) && (c.length() > 0)) {
	    			String play3 = c;
	    			com.Fivestart.setName3("p3: " + play3);
	    			} else {
  				com.Fivestart.setName3("Player 3");	
  			  }
	    	  String d = playerFour.getText();
	    	  if ((d != null) && (d.length() > 0)) {
	    			String play4 = d;
	    			com.Fivestart.setName4("p4: " + play4);
	    			} else {
  				com.Fivestart.setName4("Player 4");	
  			  }
	    	  
	      } else {
	    	  com.Fivestart.setName1("Player 1");	
	    	  com.Fivestart.setName2("Player 2");
	    	  com.Fivestart.setName3("Player 3");
	    	  com.Fivestart.setName4("Player 4");
	      }
	}

	public void Player4Name() {
		// TODO Auto-generated method stub
		
	}		
}