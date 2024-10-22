//: Object/dice/ManageThrowThreads.java
package com.dice;
import com.Fivestart;
import com.Fivestart.RollCheck;

/** ManageThrowThreads allows me to 'throw' the dice
 * and then wait until they are done 'rolling' to 
 * provide the results.  I could not get the threads to 
 * wait properly.  I think the RollDice.doIt method 
 * 'finishes' several times which screws up the 'wait'
 * on the GetRight2 class to display result.  GetRight2
 * ends up displaying the wrong result because it gets 
 * called too early.
 * @author Greg
 */
public class ManageThrowThreads {

	public static boolean valueSet = false;
	
	public synchronized void gettys() {
		if(!valueSet)
		try {
		wait();
		} catch(InterruptedException e) {
		System.out.println("InterruptedException caught");
		}
		try {
			Thread.sleep(1215);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		RollCheck.RollCheck();
		Fivestart.checkRollResults();
		
		}
	
	public void fuck() {
		valueSet = true;
	}
	
	public synchronized void doRollNow() {
		RollDice.doIt(Fivestart.howManyToRoll());
		fuck();
		notify();
	}
	
	
	
	
	
	
	
	
}
