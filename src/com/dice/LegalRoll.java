//: Object/dice/LegalRoll.java
package com.dice;

import com.Fivestart;
/** Once the die are thrown, a check is
 * done to ensure there is a possible score to
 * take/reservations to keep with the results
 * of the roll.  If nothing valid, then the player
 * 'BUNKS'.  If there is something valid- then the 
 * player gets to choose what points the want to 
 * reserve/take.
 * @author Greg
 *
 */
public class LegalRoll {
	int res1;int res2;int res3;int res4;int res5;
	private static String legal;
	public LegalRoll(){		
	}
		
	public void isRollLegal(int numRolled,int result1,int result2,int result3,int result4,int result5) {	
	int jojo = numRolled;	
	switch(jojo) {
	case 1: System.out.println("num of Die: " + numRolled + " die1: " + result1); 
			Fivestart.legalResult(testDie(result1)); break;
	case 2: System.out.println("num of Die: " + numRolled + " die1: " + result1 + " die2: " + result2); 
			Fivestart.legalResult(testDie(result1, result2)); break;
	case 3: System.out.println("num of Die: " + numRolled + " die1: " + result1 + " die2: " + result2 + " die3: " + result3); 
			Fivestart.legalResult(testDie(result1, result2, result3)); break;
	case 4: System.out.println("num of Die: " + numRolled + " die1: " + result1 + " die2: " + result2 + " die3: " + result3 + " die4: " + result4); 
			Fivestart.legalResult(testDie(result1, result2, result3, result4)); break;
	case 5: System.out.println("num of Die: " + numRolled + " die1: " + result1 + " die2: " + result2 + " die3: " + result3 + " die4: " + result4 + " die5: " + result5); 
			Fivestart.legalResult(testDie(result1, result2, result3, result4, result5)); break;
	default:System.out.println("Who knows what happened..  Stopped before implementing legal roll testDie()"); legal = "invalid"; 
			Fivestart.legalResult("Stopped before implementing legal roll testDie() in class LegalRoll.");
	}
	}
	
	private String testDie(int result1) {
		res1 = result1;
		if( res1 == 1 ) {Fivestart.commentScreen.setText(res1 + " Valid"); legal = "valid"; return legal; }
		else if( res1 == 5) {Fivestart.commentScreen.setText(res1 + " Valid"); legal = "valid"; return legal;}
		else {Fivestart.commentScreen.setText("Dude. " + res1 + " is not a valid roll.  BUNK!"); legal = "invalid"; return legal;}
	}
	
	private String testDie(int result1, int result2) {
		res1 = result1;res2 = result2;
		if ( (!(res1 == 1) && !(res1 == 5)) && ( ( !(res2 == 1) && !(res2 == 5)))  )  {
			Fivestart.commentScreen.setText(res1 + " " + res2 + " Not Valid, dude!"); legal = "invalid"; return legal;} 
		else {Fivestart.commentScreen.setText(res1 + " " + res2 + " = a valid role"); legal = "valid"; return legal;}
	}
	
	private String testDie(int result1, int result2, int result3) {
		res1 = result1;res2 = result2;res3 = result3;
		if ( (!(res1 == 1) && !(res1 == 5)) && ( ( !(res2 == 1) && !(res2 == 5))) && ( ( !(res3 == 1) && !(res3 == 5)))
			&& ( !(res1 == res2) || !(res1 == res3) || !(res2 == res3) ) ){
			Fivestart.commentScreen.setText(res1 + " " + res2 + " " + res3 + " Not Valid, dude!"); legal = "invalid"; return legal;}
		else {Fivestart.commentScreen.setText(res1 + " " + res2 + " " + res3 + " = a valid role"); legal = "valid"; return legal;}
	}
	
	private String testDie(int result1, int result2, int result3, int result4) {
		res1 = result1;res2 = result2;res3 = result3;res4 = result4;
		if ( 	   ( ( (res1 == 1) || (res1 == 5))) 
				|| ( ( (res2 == 1) || (res2 == 5))) 
				|| ( ( (res3 == 1) || (res3 == 5))) 
				|| ( ( (res4 == 1) || (res4 == 5))) 
				
				|| (   ( (res1 == res2) && ( (res1 == res3) || (res1 == res4) ) )
					|| ( (res1 == res3) && ( (res1 == res2) || (res1 == res4) ) )
					|| ( (res1 == res4) && ( (res1 == res2) || (res1 == res3) ) ) )
					
				|| (   ( (res2 == res1) && ( (res2 == res3) || (res2 == res4) ) )
					|| ( (res2 == res3) && ( (res2 == res1) || (res2 == res4) ) )
					|| ( (res2 == res4) && ( (res2 == res1) || (res2 == res3) ) ) )
					
				|| (   ( (res3 == res1) && ( (res3 == res2) || (res3 == res4) ) )
					|| ( (res3 == res2) && ( (res3 == res1) || (res3 == res4) ) )
					|| ( (res3 == res4) && ( (res3 == res1) || (res3 == res2) ) ) )
					
				|| (   ( (res4 == res1) && ( (res4 == res2) || (res4 == res3) ) )
					|| ( (res4 == res2) && ( (res4 == res1) || (res4 == res3) ) )
					|| ( (res4 == res3) && ( (res4 == res1) || (res4 == res2) ) ) )		)
		{
			Fivestart.commentScreen.setText(res1 + " " + res2 +  " " + res3 + " " + res4 + " = a valid role"); legal = "valid"; return legal;}
		else {Fivestart.commentScreen.setText(res1 + " " + res2 +  " " + res3 + " " + res4 + " Not Valid, dude!");legal = "invalid"; return legal;}
	}
	
	private String testDie(int result1, int result2, int result3, int result4, int result5) {
		res1 = result1;res2 = result2;res3 = result3;res4 = result4;res5 = result5;
		if ( 	   ( ( (res1 == 1) || (res1 == 5))) 
				|| ( ( (res2 == 1) || (res2 == 5))) 
				|| ( ( (res3 == 1) || (res3 == 5))) 
				|| ( ( (res4 == 1) || (res4 == 5)))
				|| ( ( (res5 == 1) || (res5 == 5)))
								
//				|| ( (res1 == 1) && (res2 == 2) && (res3 == 3) && (res4 == 4) && (res5 == 5) )
//				|| ( (res1 == 2) && (res2 == 1) && (res3 == 3) && (res4 == 4) && (res5 == 5) )
//				|| ( (res1 == 3) && (res2 == 1) && (res3 == 2) && (res4 == 4) && (res5 == 5) )
//				|| ( (res1 == 4) && (res2 == 1) && (res3 == 2) && (res4 == 3) && (res5 == 5) )
//				|| ( (res1 == 5) && (res2 == 1) && (res3 == 2) && (res4 == 3) && (res5 == 4) )
				
				|| ( (res2 == 1) && (res1 == 2) && (res3 == 3) && (res4 == 4) && (res5 == 5) )
				|| ( (res2 == 2) && (res1 == 1) && (res3 == 3) && (res4 == 4) && (res5 == 5) )
				|| ( (res2 == 3) && (res1 == 1) && (res3 == 2) && (res4 == 4) && (res5 == 5) )
				|| ( (res2 == 4) && (res1 == 1) && (res3 == 2) && (res4 == 3) && (res5 == 5) )
				|| ( (res2 == 5) && (res1 == 1) && (res3 == 2) && (res4 == 3) && (res5 == 4) )
				
				|| ( (res3 == 1) && (res1 == 2) && (res2 == 3) && (res4 == 4) && (res5 == 5) )
				|| ( (res3 == 2) && (res1 == 1) && (res2 == 3) && (res4 == 4) && (res5 == 5) )
				|| ( (res3 == 3) && (res1 == 1) && (res2 == 2) && (res4 == 4) && (res5 == 5) )
				|| ( (res3 == 4) && (res1 == 1) && (res2 == 2) && (res4 == 3) && (res5 == 5) )
				|| ( (res3 == 5) && (res1 == 1) && (res2 == 2) && (res4 == 3) && (res5 == 4) )
				
				|| ( (res4 == 1) && (res1 == 2) && (res2 == 3) && (res3 == 4) && (res5 == 5) )
				|| ( (res4 == 2) && (res1 == 1) && (res2 == 3) && (res3 == 4) && (res5 == 5) )
				|| ( (res4 == 3) && (res1 == 1) && (res2 == 2) && (res3 == 4) && (res5 == 5) )
				|| ( (res4 == 4) && (res1 == 1) && (res2 == 2) && (res3 == 3) && (res5 == 5) )
				|| ( (res4 == 5) && (res1 == 1) && (res2 == 2) && (res3 == 3) && (res5 == 4) )
				
				|| ( (res5 == 1) && (res1 == 2) && (res2 == 3) && (res3 == 4) && (res4 == 5) )
				|| ( (res5 == 2) && (res1 == 1) && (res2 == 3) && (res3 == 4) && (res4 == 5) )
				|| ( (res5 == 3) && (res1 == 1) && (res2 == 2) && (res3 == 4) && (res4 == 5) )
				|| ( (res5 == 4) && (res1 == 1) && (res2 == 2) && (res3 == 3) && (res4 == 5) )
				|| ( (res5 == 5) && (res1 == 1) && (res2 == 2) && (res3 == 3) && (res4 == 4) )
				
				|| (   ( (res1 == res2) && ( (res1 == res3) || (res1 == res4) || (res1 == res5) ) )
					|| ( (res1 == res3) && ( (res1 == res2) || (res1 == res4) || (res1 == res5) ) )
					|| ( (res1 == res4) && ( (res1 == res2) || (res1 == res3) || (res1 == res5) ) )
					|| ( (res1 == res5) && ( (res1 == res2) || (res1 == res3) || (res1 == res4) ) ) )
					
				|| (   ( (res2 == res1) && ( (res2 == res3) || (res2 == res4) || (res2 == res5) ) )
					|| ( (res2 == res3) && ( (res2 == res1) || (res2 == res4) || (res2 == res5) ) )
					|| ( (res2 == res4) && ( (res2 == res1) || (res2 == res3) || (res2 == res5) ) )
					|| ( (res2 == res5) && ( (res2 == res1) || (res2 == res3) || (res2 == res4) ) ) )
					
				|| (   ( (res3 == res1) && ( (res3 == res2) || (res3 == res4) || (res3 == res5) ) )
					|| ( (res3 == res2) && ( (res3 == res1) || (res3 == res4) || (res3 == res5) ) )
					|| ( (res3 == res4) && ( (res3 == res1) || (res3 == res2) || (res3 == res5) ) )
					|| ( (res3 == res5) && ( (res3 == res1) || (res3 == res2) || (res3 == res4) ) ) )
					
				|| (   ( (res4 == res1) && ( (res4 == res2) || (res4 == res3) || (res4 == res5) ) )
					|| ( (res4 == res2) && ( (res4 == res1) || (res4 == res3) || (res4 == res5) ) )
					|| ( (res4 == res3) && ( (res4 == res1) || (res4 == res2) || (res4 == res5) ) )
					|| ( (res4 == res5) && ( (res4 == res1) || (res4 == res2) || (res4 == res3) ) ) )
				
				|| (   ( (res5 == res1) && ( (res5 == res2) || (res5 == res3) || (res5 == res4) ) )
					|| ( (res5 == res2) && ( (res5 == res1) || (res5 == res3) || (res5 == res4) ) )
					|| ( (res5 == res3) && ( (res5 == res1) || (res5 == res2) || (res5 == res4) ) )
					|| ( (res5 == res4) && ( (res5 == res1) || (res5 == res2) || (res5 == res3) ) ) )	)
		{
			Fivestart.commentScreen.setText(res1 + " " + res2 +  " " + res3 + " " + res4 + " " + res5 + " = a valid role"); legal = "valid"; return legal;}
		else {Fivestart.commentScreen.setText(res1 + " " + res2 +  " " + res3 + " " + res4 + " " + res5 + " Not Valid, dude!");legal = "invalid"; return legal;}
	}
}
