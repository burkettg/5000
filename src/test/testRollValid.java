package test;

import java.util.ArrayList;

import com.Fivestart;
import com.dice.AssignReservedDieLocations;
import com.dice.DieSelected;
import com.dice.LegalRoll;
import com.dice.VerifyAllReservationDieUtilized;
import java.util.*;

public class testRollValid {
	testRollValid(){}
	static int r1 = 3;
	static int r2 = 4;
	static int r3 = 6;
	static int r4 = 4;
	static int r5 = 2;
	static int	numberOfDiceToRollx = 5;
	
	 public static void main(String[] args) {	 	
		
		 
		 	
			
		    
			
			LegalRollTest jib = new LegalRollTest();
			
			jib.isRollLegal(numberOfDiceToRollx, r1, r2, r3, r4, r5);
			
			
		 
		 


	
}
	 
}
