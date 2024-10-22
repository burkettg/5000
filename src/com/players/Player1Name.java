//: Object/players/Player1Name.java
package com.players;

import javax.swing.JOptionPane;
import com.Fivestart;

public class Player1Name  {
	

	public void Player1Name() {
		
	
		// TODO Auto-generated method stub
		String s = (String)JOptionPane.showInputDialog(
                null,
                "Provide your name\n"
                +"por favor..",
                null,
                JOptionPane.PLAIN_MESSAGE);
{

//If a string was returned, say so.
if ((s != null) && (s.length() > 0)) {
	String a = s;
	com.Fivestart.setName1("p1: " + a);
	} else {
		com.Fivestart.setName1("Player 1");	
	}

	
}
	

}

	
	
}