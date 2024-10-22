//: Object/dice/RollDice.java
package com.dice;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
//import com.FTStart;
//import com.Fivestart;

import com.dice.*;


/**Initiates roll by calling RollThemDieX class
 * defined by incoming parameter er (which defines
 * how many dice to toss).
 * @author Greg
 *
 */
public class RollDice {	   
	public RollDice() {		
	}
	
	public static Runnable doIt(int er) {

     
		
		switch(er) {
		case 1: Timer timer =  new Timer(); timer.scheduleAtFixedRate(new RollThemDie1(), 0, 20); break;
		case 2: Timer timer2 = new Timer(); timer2.scheduleAtFixedRate(new RollThemDie2(), 0, 20); break;
		case 3: Timer timer3 = new Timer(); timer3.scheduleAtFixedRate(new RollThemDie3(), 0, 20); break;
		case 4: Timer timer4 = new Timer(); timer4.scheduleAtFixedRate(new RollThemDie4(), 0, 20); break;
		case 5: Timer timer5 = new Timer(); timer5.scheduleAtFixedRate(new RollThemDie5(), 0, 20); break;
		}
		return null;

		//	System.out.println(result1Die[0]);		
	}
}
