package test;

import java.util.ArrayList;

import com.dice.AssignReservedDieLocations;
import com.dice.DieSelected;
import com.dice.VerifyAllReservationDieUtilized;
import java.util.*;

public class testRollResult {
	
	testRollResult(){}
	
	
	static String[] getSelectedDie = {"yes", "yes", "yes", "yes", "yes"};
	
	
		
		
//	 if(getSelectedDie[0] == "yes"){ verResx.add(r1); }
//	 if(getSelectedDie[1] == "yes"){ verResx.add(r2); }
//	 if(getSelectedDie[2] == "yes"){ verResx.add(r3); }
//	 if(getSelectedDie[3] == "yes"){ verResx.add(r4); }
//	 if(getSelectedDie[4] == "yes"){ verResx.add(r5); }	    	 
   	 
//	verResx.add(r1); 
	 
	 public static void main(String[] args) {
		 
	
	 ArrayList<Object> verResx=new ArrayList<Object>();

	 	Integer r1=new Integer(3);
		Integer r2=new Integer(4);
		Integer r3=new Integer(6);
		Integer r4=new Integer(4);
		Integer r5=new Integer(2);
		verResx.add(r1);
		verResx.add(r2);
		verResx.add(r3);
		verResx.add(r4);
		verResx.add(r5);
		System.out.println("The content of the arraylist is: " + verResx);
		System.out.println("The size of the arraylist is: " + verResx.size());
	

   	 
/** CheckDieUtilized is an object instance of
*  VerifyAllReservationDieUtilized which throws
*  'reserved' die into a method which checks to
*  ensure all selected die add up to a valid score.
*  This method returns a value that represents which
*  pattern was used to verify all die utilized.  This 
*  value will then be used to determine current roll score
*  as it will be thrown to the DetermineRollPoints method.
*/
	 VerifyAllReservationDieUtilized checkDieUtilized = new VerifyAllReservationDieUtilized();
	 
	 int[] checkScore = checkDieUtilized.VerifyAllReservationDieUtilized(verResx);
	 
	 if ( checkScore[0] == 0 ) {
		 System.out.println("Looks like you can't add very well!!  Pick a better selection!!");
	 }
	 if ( checkScore[0] == 1 ) {

		 System.out.println("Bingo");			 			 
		 
	 }
	
}
	 
}
