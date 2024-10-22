//: Object/dice/RollThemDie5.java
package com.dice;

import java.util.Random;
import java.util.TimerTask;

/** This class does the actual die roll
 * by generating a random number from 1
 * to 6 for each die.
 * @author Greg
 *
 */
public class RollThemDie5 extends TimerTask {
	private int p = 45;
	@Override
	public void run() {
		Random rg = new Random();
	    
		if(p > 0) {
			p --;
			int num1 = rg.nextInt(6);
			int num2 = rg.nextInt(6);
			int num3 = rg.nextInt(6);
			int num4 = rg.nextInt(6);
			int num5 = rg.nextInt(6);
			com.Fivestart.gregDie1(num1+1);
			com.Fivestart.roll1Result(num1+1);
			com.Fivestart.gregDie2(num2+1);
			com.Fivestart.roll2Result(num2+1);
			com.Fivestart.gregDie3(num3+1);
			com.Fivestart.roll3Result(num3+1);
            com.Fivestart.gregDie4(num4+1);
            com.Fivestart.roll4Result(num4+1);
            com.Fivestart.gregDie5(num5+1);
            com.Fivestart.roll5Result(num5+1);
            } else{ this.cancel();
            }

	}

}
