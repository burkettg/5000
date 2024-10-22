package com.dice;

import java.util.ArrayList;

import com.Fivestart;
import com.scoring.DetermineRollPoints;

public class AssignReservedDieLocations {
	public static int useDie1;
	public static int useDie2;
	public static int useDie3;
	public static int useDie4;
	public static int useDie5;
	String[] currentHeaterDie = {"null","null","null","null","null"};	
	public AssignReservedDieLocations() {}
	
	
	
public void AssignReservedDieLocations(
				ArrayList<Integer> verRes, 
				String[] getSelectedDie, 
				int[] actualDieRollResults, 
				int checkScore) {
		
	 
	 DetermineRollPoints currentScore = new DetermineRollPoints();

	 			 
/** Here we pass several bits of info to the class that gets the score.
*  We get back a score or a 0.
*/
	 int currentRollDieUtilizedScore = currentScore.DetermineRollPoints(verRes, getSelectedDie, actualDieRollResults, checkScore);
	 Fivestart.commentScreen.setText("Good job. Add another " + currentRollDieUtilizedScore + " to your Heater!");

/** currentHeaterTotal can continue across rolls of the same
*  player set.  Once a valid score is 'taken', the currentHeaterTotal
*  will be added to the players overall score and the currentHeaterScore
*  and currentHeaterTotal will be reset for the next player/turn.			 
*/
	 Fivestart.currentHeaterScore = currentRollDieUtilizedScore;
	 int latestCurrentHeaterTotal = Fivestart.currentHeaterTotal + Fivestart.currentHeaterScore;
	 Fivestart.currentPlayerScore.setText("" + latestCurrentHeaterTotal);
	 	 
	Fivestart.currentHeaterTotal = latestCurrentHeaterTotal;


Object[] whichDieToUse = verRes.toArray();

if(Fivestart.heaterDieReserved + checkScore <= 5) {
	 if(Fivestart.heaterDieReserved == 0) {
		 switch(checkScore) {
		 case 1: currentHeaterDie[0] = "yes"; 
		 		 useDie1 = (Integer) whichDieToUse[0];break;
		 case 2: currentHeaterDie[0] = "yes";currentHeaterDie[1] = "yes";
		 	  	 useDie1 = (Integer) whichDieToUse[0];useDie2 = (Integer) whichDieToUse[1]; break;
		 case 3: currentHeaterDie[0] = "yes";currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes";
		 		 useDie1 = (Integer) whichDieToUse[0];useDie2 = (Integer) whichDieToUse[1];useDie3 = (Integer) whichDieToUse[2]; break;
		 case 4: currentHeaterDie[0] = "yes";currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes";
		 		 useDie1 = (Integer) whichDieToUse[0];useDie2 = (Integer) whichDieToUse[1];useDie3 = (Integer) whichDieToUse[2];useDie4 = (Integer) whichDieToUse[3]; break;
		 case 5: currentHeaterDie[0] = "yes";currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes";currentHeaterDie[4] = "yes";
		 		 useDie1 = (Integer) whichDieToUse[0];useDie2 = (Integer) whichDieToUse[1];useDie3 = (Integer) whichDieToUse[2];useDie4 = (Integer) whichDieToUse[3];useDie5 = (Integer) whichDieToUse[4]; break;
		 default: {};
		 }
	 }
	 if(Fivestart.heaterDieReserved == 1) {
		 switch(checkScore) {
		 case 1: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "yes"; 
		 	 	 useDie2 = (Integer) whichDieToUse[0]; break;
		 case 2: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes"; 
		 		 useDie2 = (Integer) whichDieToUse[0];useDie3 = (Integer) whichDieToUse[1]; break;
		 case 3: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes"; 
		 		 useDie2 = (Integer) whichDieToUse[0];useDie3 = (Integer) whichDieToUse[1];useDie4 = (Integer) whichDieToUse[2]; break;
		 case 4: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "yes";currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes";currentHeaterDie[4] = "yes"; 
		 		 useDie2 = (Integer) whichDieToUse[0];useDie3 = (Integer) whichDieToUse[1];useDie4 = (Integer) whichDieToUse[2];useDie5 = (Integer) whichDieToUse[3]; break;
		 default: {};
		 }
	 }
	if(Fivestart.heaterDieReserved == 2) {
		 switch(checkScore) {
		 case 1: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "yes"; 
		 		 useDie3 = (Integer) whichDieToUse[0]; break;
		 case 2: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes"; 
		 		 useDie3 = (Integer) whichDieToUse[0];useDie4 = (Integer) whichDieToUse[1]; break;
		 case 3: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "yes";currentHeaterDie[3] = "yes";currentHeaterDie[4] = "yes"; 
		 		 useDie3 = (Integer) whichDieToUse[0];useDie4 = (Integer) whichDieToUse[1];useDie5 = (Integer) whichDieToUse[2];break;
		 default: {};
		 }
	 }
	 if(Fivestart.heaterDieReserved == 3) {
		 switch(checkScore) {
		 case 1: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "null"; currentHeaterDie[3] = "yes"; 
		 		 useDie4 = (Integer) whichDieToUse[0]; break;
		 case 2: currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "null"; currentHeaterDie[3] = "yes";currentHeaterDie[4] = "yes"; 
		 		 useDie4 = (Integer) whichDieToUse[0];useDie5 = (Integer) whichDieToUse[1]; break;
		 default: {};
		 }
	 }
	 if(Fivestart.heaterDieReserved == 4) {
		 currentHeaterDie[0] = "null"; currentHeaterDie[1] = "null"; currentHeaterDie[2] = "null"; currentHeaterDie[3] = "null"; currentHeaterDie[4] = "yes"; 
		 useDie5 = (Integer) whichDieToUse[0];			
	 }
	 
	 moveTheDie();
	 
	 
} 




	Fivestart.heaterDieReserved = checkScore + Fivestart.previousHeaterDieReserved;

	/** below is where I 'reset' the rdie so only
	 *  die that can be rolled are shown.
	 */
	if ( Fivestart.heaterDieReserved < 5 ) {
		 Fivestart.numberOfDiceToRoll = (5 - Fivestart.heaterDieReserved);
		 Fivestart.keepDie.setEnabled(false);
		 switch(Fivestart.numberOfDiceToRoll) {
		 case 1: Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);Fivestart.rdie1.setBackground(null);
		 		 Fivestart.rdie2.setIcon(null);Fivestart.rdie2.setBackground(null);
		 		 Fivestart.rdie3.setIcon(null);Fivestart.rdie3.setBackground(null);
		 		 Fivestart.rdie4.setIcon(null);Fivestart.rdie4.setBackground(null);
		 		 Fivestart.rdie5.setIcon(null); Fivestart.rdie5.setBackground(null); break;
		 case 2: Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);Fivestart.rdie1.setBackground(null);
		 		 Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);Fivestart.rdie2.setBackground(null);
		 		 Fivestart.rdie3.setIcon(null);Fivestart.rdie3.setBackground(null);
		 		 Fivestart.rdie4.setIcon(null);Fivestart.rdie4.setBackground(null);
		 		 Fivestart.rdie5.setIcon(null); Fivestart.rdie5.setBackground(null); break;
		 case 3: Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);Fivestart.rdie1.setBackground(null);
		 		 Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);Fivestart.rdie2.setBackground(null);
		 		 Fivestart.rdie3.setIcon(Fivestart.dicePics[0]);Fivestart.rdie3.setBackground(null);
		 		 Fivestart.rdie4.setIcon(null);Fivestart.rdie4.setBackground(null);
		 		 Fivestart.rdie5.setIcon(null); Fivestart.rdie5.setBackground(null); break;
		 case 4: Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);Fivestart.rdie1.setBackground(null);
		 		 Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);Fivestart.rdie2.setBackground(null);
		 		 Fivestart.rdie3.setIcon(Fivestart.dicePics[0]);Fivestart.rdie3.setBackground(null);
		 		 Fivestart.rdie4.setIcon(Fivestart.dicePics[0]);Fivestart.rdie4.setBackground(null);
		 		 Fivestart.rdie5.setIcon(null); Fivestart.rdie5.setBackground(null); break;
		 case 5: Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);Fivestart.rdie1.setBackground(null);
		 		 Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);Fivestart.rdie2.setBackground(null);
		 		 Fivestart.rdie3.setIcon(Fivestart.dicePics[0]);Fivestart.rdie3.setBackground(null);
		 		 Fivestart.rdie4.setIcon(Fivestart.dicePics[0]);Fivestart.rdie4.setBackground(null);
		 		 Fivestart.rdie5.setIcon(Fivestart.dicePics[0]); Fivestart.rdie5.setBackground(null); break;
		 default: System.out.println("Greg MADE IT HERE NOW..." + checkScore + "   DUDE"); 				 			
		 }
	} else {
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 ResetDice resetTheDice = new ResetDice();
		 resetTheDice.ResetDiceNow();		 
	} 
	
	
	Fivestart.previousHeaterDieReserved = Fivestart.heaterDieReserved;
	Fivestart.takeScore.setEnabled(true);
  }


private void moveTheDie() {
	
	DieSelected.toggleSwitch1 = true;
	DieSelected.toggleSwitch2 = true;
	DieSelected.toggleSwitch3 = true;
	DieSelected.toggleSwitch4 = true;
	
	if(currentHeaterDie[0] == "yes") {
		Fivestart.rdie1.setBackground(null);
		Fivestart.rdie1.setIcon(null);
		Fivestart.tdie1.setBackground(Fivestart.currentPlayerColor);
		switch (useDie1) {
		case 1: Fivestart.tdie1.setIcon(Fivestart.dicePics[1]);Fivestart.tdie1.setText(null); break;
		case 2: Fivestart.tdie1.setIcon(Fivestart.dicePics[2]);Fivestart.tdie1.setText(null); break;
		case 3: Fivestart.tdie1.setIcon(Fivestart.dicePics[3]);Fivestart.tdie1.setText(null); break;
		case 4: Fivestart.tdie1.setIcon(Fivestart.dicePics[4]);Fivestart.tdie1.setText(null); break;
		case 5: Fivestart.tdie1.setIcon(Fivestart.dicePics[5]);Fivestart.tdie1.setText(null); break;
		case 6: Fivestart.tdie1.setIcon(Fivestart.dicePics[6]);Fivestart.tdie1.setText(null); break;
		default: Fivestart.tdie1.setIcon(null);Fivestart.tdie1.setText(null);;
		}
	} 
	if(currentHeaterDie[1] == "yes") {
		Fivestart.rdie2.setBackground(null);
		Fivestart.rdie2.setIcon(null);
		Fivestart.tdie2.setBackground(Fivestart.currentPlayerColor);
		switch (useDie2) {
		case 1: Fivestart.tdie2.setIcon(Fivestart.dicePics[1]); Fivestart.tdie2.setText(null); break;
		case 2: Fivestart.tdie2.setIcon(Fivestart.dicePics[2]); Fivestart.tdie2.setText(null); break;
		case 3: Fivestart.tdie2.setIcon(Fivestart.dicePics[3]); Fivestart.tdie2.setText(null); break;
		case 4: Fivestart.tdie2.setIcon(Fivestart.dicePics[4]); Fivestart.tdie2.setText(null); break;
		case 5: Fivestart.tdie2.setIcon(Fivestart.dicePics[5]); Fivestart.tdie2.setText(null); break;
		case 6: Fivestart.tdie2.setIcon(Fivestart.dicePics[6]); Fivestart.tdie2.setText(null); break;
		default:Fivestart.tdie2.setIcon(null);Fivestart.tdie2.setText(null);
		}
	} 
	if(currentHeaterDie[2] == "yes") {
		Fivestart.rdie3.setBackground(null);
		Fivestart.rdie3.setIcon(null);
		Fivestart.tdie3.setBackground(Fivestart.currentPlayerColor);
		switch (useDie3) {
		case 1: Fivestart.tdie3.setIcon(Fivestart.dicePics[1]); Fivestart.tdie3.setText(null); break;
		case 2: Fivestart.tdie3.setIcon(Fivestart.dicePics[2]); Fivestart.tdie3.setText(null); break;
		case 3: Fivestart.tdie3.setIcon(Fivestart.dicePics[3]); Fivestart.tdie3.setText(null); break;
		case 4: Fivestart.tdie3.setIcon(Fivestart.dicePics[4]); Fivestart.tdie3.setText(null); break;
		case 5: Fivestart.tdie3.setIcon(Fivestart.dicePics[5]); Fivestart.tdie3.setText(null); break;
		case 6: Fivestart.tdie3.setIcon(Fivestart.dicePics[6]); Fivestart.tdie3.setText(null); break;
		default:Fivestart.tdie3.setIcon(null);Fivestart.tdie3.setText(null);
		}
	} 
	if(currentHeaterDie[3] == "yes") {
		Fivestart.rdie4.setBackground(null);
		Fivestart.rdie4.setIcon(null);
		Fivestart.tdie4.setBackground(Fivestart.currentPlayerColor);
		switch (useDie4) {
		case 1: Fivestart.tdie4.setIcon(Fivestart.dicePics[1]); Fivestart.tdie4.setText(null); break;
		case 2: Fivestart.tdie4.setIcon(Fivestart.dicePics[2]); Fivestart.tdie4.setText(null); break;
		case 3: Fivestart.tdie4.setIcon(Fivestart.dicePics[3]); Fivestart.tdie4.setText(null); break;
		case 4: Fivestart.tdie4.setIcon(Fivestart.dicePics[4]); Fivestart.tdie4.setText(null); break;
		case 5: Fivestart.tdie4.setIcon(Fivestart.dicePics[5]); Fivestart.tdie4.setText(null); break;
		case 6: Fivestart.tdie4.setIcon(Fivestart.dicePics[6]); Fivestart.tdie4.setText(null); break;
		default:Fivestart.tdie4.setIcon(null);Fivestart.tdie4.setText(null);
		}
	} 
	if(currentHeaterDie[4] == "yes") {
		Fivestart.rdie5.setBackground(null);
		Fivestart.rdie5.setIcon(null);
		Fivestart.tdie5.setBackground(Fivestart.currentPlayerColor);
		switch (useDie5) {
		case 1: Fivestart.tdie5.setIcon(Fivestart.dicePics[1]); Fivestart.tdie5.setText(null); break;
		case 2: Fivestart.tdie5.setIcon(Fivestart.dicePics[2]); Fivestart.tdie5.setText(null); break;
		case 3: Fivestart.tdie5.setIcon(Fivestart.dicePics[3]); Fivestart.tdie5.setText(null); break;
		case 4: Fivestart.tdie5.setIcon(Fivestart.dicePics[4]); Fivestart.tdie5.setText(null); break;
		case 5: Fivestart.tdie5.setIcon(Fivestart.dicePics[5]); Fivestart.tdie5.setText(null); break;
		case 6: Fivestart.tdie5.setIcon(Fivestart.dicePics[6]); Fivestart.tdie5.setText(null); break;
		default:Fivestart.tdie5.setIcon(null);Fivestart.tdie5.setText(null);
		}
	}						
}

}
