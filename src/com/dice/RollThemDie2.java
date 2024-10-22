//: Object/dice/RollThemDie2.java
package com.dice;

import java.util.Random;
import java.util.TimerTask;

/** This class does the actual die roll
 * by generating a random number from 1
 * to 6 for each die.
 * @author Greg
 *
 */
public class RollThemDie2 extends TimerTask {
	private int p = 45;
	@Override
	public void run() {
		Random rg = new Random();
	    
		if(p > 0) {
			p --;
			int num1 = rg.nextInt(6);
			int num2 = rg.nextInt(6);
            com.Fivestart.gregDie1(num1+1);
            com.Fivestart.roll1Result(num1+1);
            com.Fivestart.gregDie2(num2+1);
            com.Fivestart.roll2Result(num2+1);
            com.Fivestart.emptyDie3();
            com.Fivestart.emptyDie4();
            com.Fivestart.emptyDie5(); 
            } else{ this.cancel();
            }

	}

}
