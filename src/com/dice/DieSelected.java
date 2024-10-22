//: Object/dice/DieSelected.java
package com.dice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.Fivestart;

public class DieSelected extends Fivestart {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static boolean toggleSwitch1 = true;
	public static boolean toggleSwitch2 = true;
	public static boolean toggleSwitch3 = true;
	public static boolean toggleSwitch4 = true;
	public static boolean toggleSwitch5 = true;
	public static String rdie1Checked = "no";
	public static String rdie2Checked = "no";
	public static String rdie3Checked = "no";
	public static String rdie4Checked = "no";
	public static String rdie5Checked = "no";
	
//	public static String[] rdieChecked = { rdie1Checked };
	
	
/** ActionListeners on the rdieX buttons toggle 'yes' and 'no' as 
 * 	you click the rolled die.  They also set rdieXChecked values
 * 	which are returned as an array when whichDieAreChecked() is 
 *  called.  The array always returns 5 values with yes, or
 * 	no returned.
 */
	public static String[] whichDieAreChecked() {
		String[] rdieChecked = { rdie1Checked, rdie2Checked, rdie3Checked, rdie4Checked, rdie5Checked };
		System.out.println(rdieChecked[0] + rdieChecked[1] + rdieChecked[2] + rdieChecked[3] + rdieChecked[4]);
		return rdieChecked;
	}
	
	
	public static ActionListener rdiePress1 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(toggleSwitch1) {
    			rdie1.setBackground(currentPlayerColor);
    			toggleSwitch1 = false;
    			rdie1Checked = "yes";
    		} else {
    			rdie1.setBackground(null);
    			toggleSwitch1 = true;
    			rdie1Checked = "no";
    		}
    	}
    };
    public static ActionListener rdiePress2 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(toggleSwitch2) {
    			rdie2.setBackground(currentPlayerColor);
    			toggleSwitch2 = false;
    			rdie2Checked = "yes";
    		} else {
    			rdie2.setBackground(null);
    			toggleSwitch2 = true;
    			rdie2Checked = "no";
    		}
    	}
    };
    public static ActionListener rdiePress3 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(toggleSwitch3) {
    			rdie3.setBackground(currentPlayerColor);
    			toggleSwitch3 = false;
    			rdie3Checked = "yes";
    		} else {
    			rdie3.setBackground(null);
    			toggleSwitch3 = true;
    			rdie3Checked = "no";
    		}
    	}
    };
    public static ActionListener rdiePress4 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(toggleSwitch4) {
    			rdie4.setBackground(currentPlayerColor);
    			toggleSwitch4 = false;
    			rdie4Checked = "yes";
    		} else {
    			rdie4.setBackground(null);
    			toggleSwitch4 = true;
    			rdie4Checked = "no";
    		}
    	}
    };
    public static ActionListener rdiePress5 = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		if(toggleSwitch5) {
    			rdie5.setBackground(currentPlayerColor);
    			toggleSwitch5 = false;
    			rdie5Checked = "yes";
    		} else {
    			rdie5.setBackground(null);
    			toggleSwitch5 = true;
    			rdie5Checked = "no";
    		}
    	}
    };
    
  
    
}
