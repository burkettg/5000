package com.scoring;

import java.util.ArrayList;

import com.Fivestart;


/**  Nice little Regular Expression to find everything in the parenthesis
 * in eclipse Find/Replace..  Find: Fivestart.commentScreen.setText(\([^\)]+\)); 
 * The magic is everything after setText and before the ;
 * @author Greg
 *
 */

public class DetermineRollPoints {
	public DetermineRollPoints() {	}
	int dieToUse1; int dieToUse2; int dieToUse3; int dieToUse4; int dieToUse5;
	int dieUsed1; int dieUsed2; int dieUsed3; int dieUsed4; int dieUsed5;
	int numberToUtilize;
	
	public int DetermineRollPoints(ArrayList<Integer> verRes, String[] getSelectedDie, int[] actualDieRollResults, int patternNumber) {				
		
		Object[] diePointsToUtilize = verRes.toArray();
		numberToUtilize = verRes.size();
		int patternNum = patternNumber;
		switch(verRes.size()) {
			case 1: dieToUse1 = (Integer) diePointsToUtilize[0]; break;
			case 2: dieToUse1 = (Integer) diePointsToUtilize[0]; 
					dieToUse2 = (Integer) diePointsToUtilize[1]; break;
			case 3: dieToUse1 = (Integer) diePointsToUtilize[0]; 
					dieToUse2 = (Integer) diePointsToUtilize[1];
					dieToUse3 = (Integer) diePointsToUtilize[2]; break;
			case 4: dieToUse1 = (Integer) diePointsToUtilize[0]; 
					dieToUse2 = (Integer) diePointsToUtilize[1];
					dieToUse3 = (Integer) diePointsToUtilize[2];
					dieToUse4 = (Integer) diePointsToUtilize[3]; break;
			case 5: dieToUse1 = (Integer) diePointsToUtilize[0]; 
					dieToUse2 = (Integer) diePointsToUtilize[1];
					dieToUse3 = (Integer) diePointsToUtilize[2];
					dieToUse4 = (Integer) diePointsToUtilize[3];
					dieToUse5 = (Integer) diePointsToUtilize[4]; break;
			default: System.out.println("Whoopsie!  WTF just Happened??");
		}	
	if(numberToUtilize == 1) {return currentReservationResult(dieToUse1);}	
	if(numberToUtilize == 2) {return currentReservationResult(dieToUse1, dieToUse2);}	
	if(numberToUtilize == 3) {return currentReservationResult(dieToUse1, dieToUse2, dieToUse3);}		
	if(numberToUtilize == 4) {return currentReservationResult(dieToUse1, dieToUse2, dieToUse3, dieToUse4);}	
	if(numberToUtilize == 5) {return currentReservationResult(dieToUse1, dieToUse2, dieToUse3, dieToUse4, dieToUse5);} 
	else {return 0; }
// Here is a test     return currentReservationResult(5,4,2,1,3);			
	}
	private int currentReservationResult(int dieToUse1) {
		dieUsed1 = dieToUse1;
		if( dieUsed1 == 5) {return 50;}
		else if( dieUsed1 == 1) {return 100;}
		else { return 0;}		
	}
	private int currentReservationResult(int dieToUse1, int dieToUse2) {
		dieUsed1 = dieToUse1; dieUsed2 = dieToUse2;
		if( (dieUsed1 == 5) && (dieUsed2 == 5) ) {return 100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) ) {return 150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) ) {return 150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) ) {return 200;}
		else { return 0;}
	}
	private int currentReservationResult(int dieToUse1, int dieToUse2, int dieToUse3) {
		dieUsed1 = dieToUse1; dieUsed2 = dieToUse2; dieUsed3 = dieToUse3;
		if( 	 (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) ) {return 200;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) ) {return 200;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) ) {return 250;}
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) ) {return 200;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) ) {return 250;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) ) {return 250;}		
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) ) {return 1000;}
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) ) {return 200;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) ) {return 300;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) ) {return 500;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) ) {return 600;}
		else { return 0;}
	}
	private int currentReservationResult(int dieToUse1, int dieToUse2, int dieToUse3, int dieToUse4) {
		dieUsed1 = dieToUse1; dieUsed2 = dieToUse2; dieUsed3 = dieToUse3; dieUsed4 = dieToUse4;
 /**
 Below is the pattern for 1's or 5's.	    
	5	5	1	1
	5	1	5	1
	5	1	1	5
	1	5	5	1
	1	5	1	5
	1	1	5	5
				
	1   1   5   1
	1   5   1   1
   (5   1   1   1) in 3 of a kind
   (5   5   5   5) in 3 of a kind						
 */
		if(      (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) ) {return 300;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) ) {return 300;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) ) {return 300;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 300;}
	
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) ) {return 1050;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1050;}
		
/**
    Below is the pattern a three of a kind and a (1 or 5).
    each row counts for 2 lines (1 or 5).
  		A	A	A	1
		A	A	1	A
		A	1	A	A
		1	A	A	A	
 */
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) ) {return 1050;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) ) {return 1050;}
//		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1050;}
//		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1050;}
//		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) ) {return 1100;}
				
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 5) ) {return 250;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 1) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 2) ) {return 250;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 2) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 2) ) {return 250;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 1) && (dieUsed3 == 2) && (dieUsed4 == 2) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) ) {return 250;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) ) {return 300;}
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 5) ) {return 350;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 1) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 3) ) {return 350;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 3) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 3) ) {return 350;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 1) && (dieUsed3 == 3) && (dieUsed4 == 3) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) ) {return 400;}
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 5) ) {return 450;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 1) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 4) ) {return 450;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 4) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 4) ) {return 450;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 1) && (dieUsed3 == 4) && (dieUsed4 == 4) ) {return 500;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) ) {return 500;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 550;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 550;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 550;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) ) {return 600;}
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 5) ) {return 650;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 1) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 6) ) {return 650;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 6) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 6) ) {return 650;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 1) && (dieUsed3 == 6) && (dieUsed4 == 6) ) {return 700;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) ) {return 700;}
		else { return 0;}
	}		
	private int currentReservationResult(int dieToUse1, int dieToUse2, int dieToUse3, int dieToUse4, int dieToUse5) {
		dieUsed1 = dieToUse1; dieUsed2 = dieToUse2; dieUsed3 = dieToUse3; dieUsed4 = dieToUse4; dieUsed5 = dieToUse5;
		
		
/**
  Here is the sequence I came up with for '3 of a kind and (1 or 5)'.
  (each line below represents 4 lines 55,51,15,11).  
  40 lines per die option = 240 if statements (includes duplicates).
  Definitely need a for-each loop here or something!!
  
    A	A	A	1	1
	A	A	1	A	1
	A	A	1	1	A
	A	1	A	A	1
	A	1	A	1	A
	A	1	1	A	A
	1	A	A	A	1
	1	A	A	1	A
	1	A	1	A	A
	1	1	A	A	A
	
  Have to do this for 3 of a kind '1 through 6'..  Anything missing??
 */		
/////////////////////////////		1
		if(    	
				 (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1100;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1150;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 1200;}				

///////////////////////  2				
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 400;}		
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 1) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 1) ) {return 400;}		
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 400;}		
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 400;}		
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 1) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 1) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 400;}		
		
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 2) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 400;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 1) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 5) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 1) ) {return 400;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 5) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 2) && (dieUsed4 == 1) && (dieUsed5 == 2) ) {return 400;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 5) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 2) && (dieUsed3 == 1) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 400;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 300;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 350;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 2) && (dieUsed4 == 2) && (dieUsed5 == 2) ) {return 400;}		
				
///////////////////////  3		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 500;}		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 1) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 1) ) {return 500;}		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 500;}		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 500;}		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 1) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 1) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 500;}		
		
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 3) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 500;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 1) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 5) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 1) ) {return 500;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 5) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 3) && (dieUsed4 == 1) && (dieUsed5 == 3) ) {return 500;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 5) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 3) && (dieUsed3 == 1) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 500;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 400;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 450;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 3) && (dieUsed4 == 3) && (dieUsed5 == 3) ) {return 500;}		
		
///////////////////////  4		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 600;}		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 1) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 1) ) {return 600;}		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 600;}		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 600;}		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 1) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 1) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 600;}		
		
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 4) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 600;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 500;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 1) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 5) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 1) ) {return 600;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 5) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 4) && (dieUsed4 == 1) && (dieUsed5 == 4) ) {return 600;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 5) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 4) && (dieUsed3 == 1) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 600;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 500;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 550;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 4) && (dieUsed4 == 4) && (dieUsed5 == 4) ) {return 600;}		
		
///////////////////////  5		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 700;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 700;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 600;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 650;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 700;}		
		
///////////////////////  6		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 5) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 1) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 5) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 1) ) {return 800;}		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 1) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 1) ) {return 800;}		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 800;}		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 800;}		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 1) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 1) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 800;}		
		
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 5) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 1) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 6) && (dieUsed2 == 1) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 800;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 700;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 1) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 5) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 1) ) {return 800;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 5) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 6) && (dieUsed4 == 1) && (dieUsed5 == 6) ) {return 800;}		
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 5) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 6) && (dieUsed3 == 1) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 800;}
		
		else if( (dieUsed1 == 5) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 700;}
		else if( (dieUsed1 == 5) && (dieUsed2 == 1) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 5) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 750;}
		else if( (dieUsed1 == 1) && (dieUsed2 == 1) && (dieUsed3 == 6) && (dieUsed4 == 6) && (dieUsed5 == 6) ) {return 800;}		
		
///////////////////////////////////  1, 2, 3, 4, 5
		
//		else if((dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5 == 15) && (dieUsed1 != dieUsed2) && (dieUsed1 != dieUsed3) && (dieUsed1 != dieUsed4) && (dieUsed1 != dieUsed5) ) {return 1000;}
//		else if((dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5 == 15) && (dieUsed2 != dieUsed1) && (dieUsed2 != dieUsed3) && (dieUsed2 != dieUsed4) && (dieUsed2 != dieUsed5) ) {return 1000;}
//		else if((dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5 == 15) && (dieUsed3 != dieUsed1) && (dieUsed3 != dieUsed2) && (dieUsed3 != dieUsed4) && (dieUsed3 != dieUsed5) ) {return 1000;}
//		else if((dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5 == 15) && (dieUsed4 != dieUsed1) && (dieUsed4 != dieUsed2) && (dieUsed4 != dieUsed3) && (dieUsed4 != dieUsed5) ) {return 1000;}
//		else if((dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5 == 15) && (dieUsed5 != dieUsed1) && (dieUsed5 != dieUsed2) && (dieUsed5 != dieUsed3) && (dieUsed5 != dieUsed4) ) {return 1000;}
//		else { return 0;}
	//	int a = new Integer(dieUsed1);
	//	int b = new Integer(dieUsed2);
	//	int c = new Integer(dieUsed3);
	//	int d = new Integer(dieUsed4);
	//	int e = new Integer(dieUsed5);
	//	int a = dieUsed1;
	//	int b = dieUsed2;
	//	int c = dieUsed3;
	//	int d = dieUsed4;
	//	int e = dieUsed5;
		
		
		else if(( (dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5) == 15) && (dieUsed1 != dieUsed2) && (dieUsed1 != dieUsed3) && (dieUsed1 != dieUsed4) && (dieUsed1 != dieUsed5) ) {return 1000;}
		else if(( (dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5) == 15) && (dieUsed2 != dieUsed1) && (dieUsed2 != dieUsed3) && (dieUsed2 != dieUsed4) && (dieUsed2 != dieUsed5) ) {return 1000;}
		else if(( (dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5) == 15) && (dieUsed3 != dieUsed1) && (dieUsed3 != dieUsed2) && (dieUsed3 != dieUsed4) && (dieUsed3 != dieUsed5) ) {return 1000;}
		else if(( (dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5) == 15) && (dieUsed4 != dieUsed1) && (dieUsed4 != dieUsed2) && (dieUsed4 != dieUsed3) && (dieUsed4 != dieUsed5) ) {return 1000;}
		else if(( (dieUsed1 + dieUsed2 + dieUsed3 + dieUsed4 + dieUsed5) == 15) && (dieUsed5 != dieUsed1) && (dieUsed5 != dieUsed2) && (dieUsed5 != dieUsed3) && (dieUsed5 != dieUsed4) ) {return 1000;}
		else { return 0;}
	}
}











