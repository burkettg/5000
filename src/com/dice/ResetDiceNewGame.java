package com.dice;

import com.Fivestart;

public class ResetDiceNewGame {

		public ResetDiceNewGame() {}
		
		public void ResetDiceNowNewGame(){
			 
			 Fivestart.numberOfDiceToRoll = 5;
			
			 Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);
			 Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);
			 Fivestart.rdie3.setIcon(Fivestart.dicePics[0]);
			 Fivestart.rdie4.setIcon(Fivestart.dicePics[0]);
			 Fivestart.rdie5.setIcon(Fivestart.dicePics[0]);
			 
			 Fivestart.rdie1.setBackground(null);
			 Fivestart.rdie2.setBackground(null);
			 Fivestart.rdie3.setBackground(null);
			 Fivestart.rdie4.setBackground(null);
			 Fivestart.rdie5.setBackground(null);
			 
			 Fivestart.tdie1.setIcon(null);
			 Fivestart.tdie2.setIcon(null);
			 Fivestart.tdie3.setIcon(null);
			 Fivestart.tdie4.setIcon(null);
			 Fivestart.tdie5.setIcon(null);
			 
			 Fivestart.tdie1.setBackground(null);
			 Fivestart.tdie2.setBackground(null);
			 Fivestart.tdie3.setBackground(null);
			 Fivestart.tdie4.setBackground(null);
			 Fivestart.tdie5.setBackground(null);
			 
			 Fivestart.tdie1.setText(null);
			 Fivestart.tdie2.setText(null);
			 Fivestart.tdie3.setText(null);
			 Fivestart.tdie4.setText(null);
			 Fivestart.tdie5.setText(null);
			 
			 Fivestart.heaterDieReserved = 0;
			 Fivestart.previousHeaterDieReserved = 0;
			 
	/** I tried to change (reset) values of the getSelectedDie[] with:
	 *  Fivestart.getSelectedDie[0] = "no";  .. etc. 
	 *  Not valid java code.  Below I create a new array with 
	 *  the values I want and just assign the getSelectedDie[] array
	 *  those values. Cool.
	 */		 
			 String[] fixSelectedDie = { "no", "no", "no", "no", "no" };
			 Fivestart.getSelectedDie = fixSelectedDie;
				 
			 DieSelected.rdie1Checked = "no";
			 DieSelected.rdie2Checked = "no";
			 DieSelected.rdie3Checked = "no";
			 DieSelected.rdie4Checked = "no";
			 DieSelected.rdie5Checked = "no";
			 
			 AssignReservedDieLocations.useDie1 = 0;
			 AssignReservedDieLocations.useDie2 = 0;
			 AssignReservedDieLocations.useDie3 = 0;
			 AssignReservedDieLocations.useDie4 = 0;
			 AssignReservedDieLocations.useDie5 = 0;
			 
			 Fivestart.rdie1Result = 0;
			 Fivestart.rdie2Result = 0;
			 Fivestart.rdie3Result = 0;
			 Fivestart.rdie4Result = 0;
			 Fivestart.rdie5Result = 0;
			 
			 Fivestart.keepDie.setEnabled(false);
			 Fivestart.rollDie.setEnabled(false);
			 Fivestart.takeScore.setEnabled(false);
			 
			 
		}
		
		
		
	}
