//: Object/dice/VerifyAllReservationDieUtilized.java
package com.dice;

import java.io.FileInputStream;
import java.util.ArrayList;

import com.Fivestart;
import com.gblibrary.FamousQuotes;
import java.util.Random;

import javazoom.jl.player.Player;

/** After the reservation is verified, we 
 *  need to verify that all the die selected
 *  are valid to reserve.  If player selects two values
 *  1 and 3 to keep, the reservation is valid but it is
 *  NOT fully utilized as 3 alone is not acceptable.
 * @author Greg
 */
public class VerifyAllReservationDieUtilized {
	int dieToUse1;
	int dieToUse2;
	int dieToUse3;
	int dieToUse4;
	int dieToUse5;
	int numberToUtilize;
	int yep = 1;
	int nop = 0;
	int scoringDie;
	int[] scorePattern;
	Random ri = new Random();
	int fun30 = ri.nextInt(30);
	int fun20 = ri.nextInt(20);
	int fun10 = ri.nextInt(10);
	int fun3 = ri.nextInt(3);
	int fun5 = ri.nextInt(5);
	
	public VerifyAllReservationDieUtilized(){}
	
	public int[] VerifyAllReservationDieUtilized(ArrayList verRes) {
//		System.out.println("WTF, At least we made it here!!");
		
		Object[] numberOfDieToUtilize = verRes.toArray();
//		System.out.println("The first die array element is " + numberOfDieToUtilize[0]);
		numberToUtilize = verRes.size();
		switch(verRes.size()) {
			case 1: dieToUse1 = (Integer) numberOfDieToUtilize[0]; break;
			case 2: dieToUse1 = (Integer) numberOfDieToUtilize[0]; 
					dieToUse2 = (Integer) numberOfDieToUtilize[1]; break;
			case 3: dieToUse1 = (Integer) numberOfDieToUtilize[0]; 
					dieToUse2 = (Integer) numberOfDieToUtilize[1];
					dieToUse3 = (Integer) numberOfDieToUtilize[2]; break;
			case 4: dieToUse1 = (Integer) numberOfDieToUtilize[0]; 
					dieToUse2 = (Integer) numberOfDieToUtilize[1];
					dieToUse3 = (Integer) numberOfDieToUtilize[2];
					dieToUse4 = (Integer) numberOfDieToUtilize[3]; break;
			case 5: dieToUse1 = (Integer) numberOfDieToUtilize[0]; 
					dieToUse2 = (Integer) numberOfDieToUtilize[1];
					dieToUse3 = (Integer) numberOfDieToUtilize[2];
					dieToUse4 = (Integer) numberOfDieToUtilize[3];
					dieToUse5 = (Integer) numberOfDieToUtilize[4]; break;
			default: System.out.println("Whoopsie!  WTF just Happened??");
		}
	
	if(numberToUtilize == 1) {return verifyAllDieUtilizedNow(dieToUse1);}	
	if(numberToUtilize == 2) {return verifyAllDieUtilizedNow(dieToUse1, dieToUse2);}	
	if(numberToUtilize == 3) {return verifyAllDieUtilizedNow(dieToUse1, dieToUse2, dieToUse3);}		
	if(numberToUtilize == 4) {return verifyAllDieUtilizedNow(dieToUse1, dieToUse2, dieToUse3, dieToUse4);}	
	if(numberToUtilize == 5) {return verifyAllDieUtilizedNow(dieToUse1, dieToUse2, dieToUse3, dieToUse4, dieToUse5);} 
	else { return scorePattern; }
	
	}
		
	
	private int[] verifyAllDieUtilizedNow(int xx1) {
		xx1 = dieToUse1;
		if( (!(dieToUse1 == 1) && !(dieToUse1 == 5)) ) {
			try {
				FileInputStream badPlay = new FileInputStream("sounds/badSelection" + fun10 + ".mp3");
				Player playMp3 = new Player(badPlay);playMp3.play();					
			   } catch (Exception e1) {System.out.println(e1);}  
		scoringDie = 0;
		int[] scorePattern = { nop, scoringDie };
		return scorePattern;
		} else {
			if( dieToUse1 == 1 ){
			try {
				FileInputStream goodPlay = new FileInputStream("sounds/got100Quote" + fun5 + ".mp3");
				Player playMp3 = new Player(goodPlay);playMp3.play();					
			   } catch (Exception e1) {System.out.println(e1);}  
			}
			if( dieToUse1 == 5 ){
				try {
					FileInputStream goodPlay = new FileInputStream("sounds/gotFifty" + fun30 + ".mp3");
					Player playMp3 = new Player(goodPlay);playMp3.play();					
				   } catch (Exception e1) {System.out.println(e1);}  
				}
		scoringDie = 1;
		int[] scorePattern = { yep, scoringDie };
		return scorePattern;
		}
	}
		
		
	private int[] verifyAllDieUtilizedNow(int xx1, int xx2) {
		xx1 = dieToUse1;
		xx2 = dieToUse2;
		if( ( (dieToUse1 == 1) || (dieToUse1 == 5) ) && ( (dieToUse2 == 1) || (dieToUse2 == 5) ) ) {
//			System.out.println(dieToUse1 + " " + dieToUse2 + " All Utilized.");
			scoringDie = 2;
			int[] scorePattern = { yep, scoringDie };
			return scorePattern;
			} else {
				try {
					FileInputStream badPlay = new FileInputStream("sounds/badSelection" + fun10 + ".mp3");
					Player playMp3 = new Player(badPlay);playMp3.play();					
				   } catch (Exception e1) {System.out.println(e1);}
			scoringDie = 0;
			int[] scorePattern = { nop, scoringDie };
			return scorePattern;									
			}
		}
		
		private int[] verifyAllDieUtilizedNow(int xx1, int xx2, int xx3) {
			xx1 = dieToUse1;
			xx2 = dieToUse2;
			xx3 = dieToUse3;
						
			if (   ( ( dieToUse1 == 1 ) && ( dieToUse2 == 1 ) && ( dieToUse3 == 1 ) ) 
				|| ( ( dieToUse1 == 2 ) && ( dieToUse2 == 2 ) && ( dieToUse3 == 2 ) )
				|| ( ( dieToUse1 == 3 ) && ( dieToUse2 == 3 ) && ( dieToUse3 == 3 ) )
				|| ( ( dieToUse1 == 4 ) && ( dieToUse2 == 4 ) && ( dieToUse3 == 4 ) )
				|| ( ( dieToUse1 == 5 ) && ( dieToUse2 == 5 ) && ( dieToUse3 == 5 ) )
				|| ( ( dieToUse1 == 6 ) && ( dieToUse2 == 6 ) && ( dieToUse3 == 6 ) )
				
				)
			{
//				System.out.println(FamousQuotes.threeOfAKind[fun20]);
			if( (dieToUse1 + dieToUse2 + dieToUse3) == 15 ) {
				try {
					FileInputStream goodPlay = new FileInputStream("sounds/fiveHunQuote" + fun5 + ".mp3");
					Player playMp3 = new Player(goodPlay);playMp3.play();					
				   } catch (Exception e1) {System.out.println(e1);}
			}
			else if( (dieToUse1 + dieToUse2 + dieToUse3) == 18 ) {
				try {
					FileInputStream goodPlay = new FileInputStream("sounds/sixHunQuote" + fun5 + ".mp3");
					Player playMp3 = new Player(goodPlay);playMp3.play();					
				   } catch (Exception e1) {System.out.println(e1);}
			}
			else {
				try {
					FileInputStream goodPlay = new FileInputStream("sounds/threeOfAKind" + fun20 + ".mp3");
					Player playMp3 = new Player(goodPlay);playMp3.play();					
				   } catch (Exception e1) {System.out.println(e1);}  
			}
			scoringDie = 3;
			int[] scorePattern = { yep, scoringDie };
			return scorePattern;
			} else if ( ( ( (dieToUse1 == 1) || (dieToUse1 == 5) ) && ( (dieToUse2 == 1) || (dieToUse2 == 5) ) && ( (dieToUse3 == 1) || (dieToUse3 == 5) ) )
			)
			{
//				System.out.println(dieToUse1 + " " + dieToUse2 + " " + dieToUse3 + " All Utilized.");
				scoringDie = 3;
				int[] scorePattern = { yep, scoringDie };
				return scorePattern;
				} else {
					try {
						FileInputStream badPlay = new FileInputStream("sounds/badSelection" + fun10 + ".mp3");
						Player playMp3 = new Player(badPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}  
					scoringDie = 0;
					int[] scorePattern = { nop, scoringDie }; 
					return scorePattern;
					
				}			
			}
		
		private int[] verifyAllDieUtilizedNow(int xx1, int xx2, int xx3, int xx4) {
			xx1 = dieToUse1;
			xx2 = dieToUse2;
			xx3 = dieToUse3;
			xx4 = dieToUse4;
			if (    ( ( (dieToUse1 == 1) || (dieToUse1 == 5) ) 
					&& ( (dieToUse2 == 1) || (dieToUse2 == 5) ) 
					&& ( (dieToUse3 == 1) || (dieToUse3 == 5) ) 
					&& ( (dieToUse4 == 1) || (dieToUse4 == 5) ))
				){
				scoringDie = 4;
				int[] scorePattern = { yep, scoringDie };
				return scorePattern;
			} else if (
				
					 ( (dieToUse1 == dieToUse2) && ( ((dieToUse1 == dieToUse3) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse1 == dieToUse4) && ( (dieToUse3 == 1) || dieToUse3 == 5))))
					|| ( (dieToUse1 == dieToUse3) && ( ((dieToUse1 == dieToUse2) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse1 == dieToUse4) && ( (dieToUse2 == 1) || dieToUse2 == 5))))
					|| ( (dieToUse1 == dieToUse4) && ( ((dieToUse1 == dieToUse2) && ( (dieToUse3 == 1) || (dieToUse3 == 5) ))  || ((dieToUse1 == dieToUse3) && ( (dieToUse2 == 1) || dieToUse2 == 5))))						
					|| ( (dieToUse2 == dieToUse1) && ( ((dieToUse2 == dieToUse3) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse2 == dieToUse4) && ( (dieToUse3 == 1) || dieToUse3 == 5))))
					|| ( (dieToUse2 == dieToUse3) && ( ((dieToUse2 == dieToUse1) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse2 == dieToUse4) && ( (dieToUse1 == 1) || dieToUse1 == 5))))
					|| ( (dieToUse2 == dieToUse4) && ( ((dieToUse2 == dieToUse1) && ( (dieToUse3 == 1) || (dieToUse3 == 5) ))  || ((dieToUse2 == dieToUse3) && ( (dieToUse1 == 1) || dieToUse1 == 5)))) 
					|| ( (dieToUse3 == dieToUse1) && ( ((dieToUse3 == dieToUse2) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse3 == dieToUse4) && ( (dieToUse2 == 1) || dieToUse2 == 5))))
					|| ( (dieToUse3 == dieToUse2) && ( ((dieToUse3 == dieToUse1) && ( (dieToUse4 == 1) || (dieToUse4 == 5) ))  || ((dieToUse3 == dieToUse4) && ( (dieToUse1 == 1) || dieToUse1 == 5))))
					|| ( (dieToUse3 == dieToUse4) && ( ((dieToUse3 == dieToUse1) && ( (dieToUse2 == 1) || (dieToUse2 == 5) ))  || ((dieToUse3 == dieToUse2) && ( (dieToUse1 == 1) || dieToUse1 == 5)))) 
					|| ( (dieToUse4 == dieToUse1) && ( ((dieToUse4 == dieToUse2) && ( (dieToUse3 == 1) || (dieToUse3 == 5) ))  || ((dieToUse4 == dieToUse3) && ( (dieToUse2 == 1) || dieToUse2 == 5))))
					|| ( (dieToUse4 == dieToUse2) && ( ((dieToUse4 == dieToUse1) && ( (dieToUse3 == 1) || (dieToUse3 == 5) ))  || ((dieToUse4 == dieToUse3) && ( (dieToUse1 == 1) || dieToUse1 == 5))))
					|| ( (dieToUse4 == dieToUse3) && ( ((dieToUse4 == dieToUse1) && ( (dieToUse2 == 1) || (dieToUse2 == 5) ))  || ((dieToUse4 == dieToUse2) && ( (dieToUse1 == 1) || dieToUse1 == 5)))) 
				)					
				{
				if( (dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4) == ( 19 | 23 ) ) {
					try {
						FileInputStream goodPlay = new FileInputStream("sounds/sixHunQuote" + fun5 + ".mp3");
						Player playMp3 = new Player(goodPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
				}
				else if( (dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4) == ( 16 | 20 ) ) {
					try {
						FileInputStream goodPlay = new FileInputStream("sounds/fiveHunQuote" + fun5 + ".mp3");
						Player playMp3 = new Player(goodPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
				}
				else {
					try {
						FileInputStream goodPlay = new FileInputStream("sounds/threeOfAKind" + fun20 + ".mp3");
						Player playMp3 = new Player(goodPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}  
				}
					scoringDie = 4;
					int[] scorePattern = { yep, scoringDie };
					return scorePattern;
				} else {
					try {
						FileInputStream badPlay = new FileInputStream("sounds/badSelection" + fun10 + ".mp3");
						Player playMp3 = new Player(badPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					scoringDie = 0;
					int[] scorePattern = { nop, scoringDie };
					return scorePattern;
				}
			}
		
		 private int[] verifyAllDieUtilizedNow(int xx1, int xx2, int xx3, int xx4, int xx5) {
			 xx1 = dieToUse1;
				xx2 = dieToUse2;
				xx3 = dieToUse3;
				xx4 = dieToUse4;
				xx5 = dieToUse5;
			 if ( 	( (dieToUse1 == (1 | 5)) && (dieToUse2 == (1 | 5)) && (dieToUse3 == (1 | 5)) && (dieToUse4 == (1 | 5)) && (dieToUse5 == (1 | 5)) ))
				{ scoringDie = 5;
						int[] scorePattern = { yep, scoringDie };
						return scorePattern;
				} else if (
						((( dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4 + dieToUse5) == 15 ) &&
								(dieToUse1 != dieToUse2) && (dieToUse1 != dieToUse3) && (dieToUse1 != dieToUse4) && (dieToUse1 != dieToUse5) && 
								(dieToUse2 != dieToUse3) && (dieToUse2 != dieToUse4) && (dieToUse2 != dieToUse5) && 
								(dieToUse3 != dieToUse4) && (dieToUse3 != dieToUse5) && 
								(dieToUse4 != dieToUse5) 								
								)
					
					|| ( (dieToUse1 == dieToUse2) && ( 	   ((dieToUse1 == dieToUse3) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))		
													   	|| ((dieToUse1 == dieToUse4) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
													   	|| ((dieToUse1 == dieToUse5) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)
					|| ( (dieToUse1 == dieToUse3) && (     ((dieToUse1 == dieToUse2) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 	
														|| ((dieToUse1 == dieToUse4) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse1 == dieToUse5) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)																							
					|| ( (dieToUse1 == dieToUse4) && (     ((dieToUse1 == dieToUse2) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 
														|| ((dieToUse1 == dieToUse3) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse1 == dieToUse5) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)				    																												
					|| ( (dieToUse1 == dieToUse5) && (     ((dieToUse1 == dieToUse2) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5))) 	
														|| ((dieToUse1 == dieToUse3) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
														|| ((dieToUse1 == dieToUse4) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)				    									
				    || ( (dieToUse2 == dieToUse1) && ( 	   ((dieToUse2 == dieToUse3) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))	
							   							|| ((dieToUse2 == dieToUse4) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
							   							|| ((dieToUse2 == dieToUse5) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)							   														   							
					|| ( (dieToUse2 == dieToUse3) && (     ((dieToUse2 == dieToUse1) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 
														|| ((dieToUse2 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse2 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)																												
					|| ( (dieToUse2 == dieToUse4) && (     ((dieToUse2 == dieToUse1) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 	
														|| ((dieToUse2 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse2 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)																												
				    || ( (dieToUse2 == dieToUse5) && (     ((dieToUse2 == dieToUse1) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5))) 	
											    		|| ((dieToUse2 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
											    		|| ((dieToUse2 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)				    													    									
				    || ( (dieToUse3 == dieToUse1) && ( 	   ((dieToUse3 == dieToUse2) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))	
							   							|| ((dieToUse3 == dieToUse4) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
							   							|| ((dieToUse3 == dieToUse5) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)							   							
					|| ( (dieToUse3 == dieToUse2) && (     ((dieToUse3 == dieToUse1) && (( dieToUse4 == 1) || (dieToUse4 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse3 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse3 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))) 	)														
					|| ( (dieToUse3 == dieToUse4) && (     ((dieToUse3 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 
														|| ((dieToUse3 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse3 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)														
				    || ( (dieToUse3 == dieToUse5) && (     ((dieToUse3 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5))) 
				    									|| ((dieToUse3 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
				    									|| ((dieToUse3 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)
				    || ( (dieToUse4 == dieToUse1) && ( 	   ((dieToUse4 == dieToUse2) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))	
							   							|| ((dieToUse4 == dieToUse3) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
							   							|| ((dieToUse4 == dieToUse5) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)							   							
					|| ( (dieToUse4 == dieToUse2) && (     ((dieToUse4 == dieToUse1) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse4 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse4 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)														
					|| ( (dieToUse4 == dieToUse3) && (     ((dieToUse4 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5))) 
														|| ((dieToUse4 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
														|| ((dieToUse4 == dieToUse5) && (( dieToUse1 == 1) || (dieToUse1 == 1)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)														
				    || ( (dieToUse4 == dieToUse5) && (     ((dieToUse4 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5))) 
				    									|| ((dieToUse4 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
				    									|| ((dieToUse4 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)
				    || ( (dieToUse5 == dieToUse1) && ( 	   ((dieToUse5 == dieToUse2) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))	
							   							|| ((dieToUse5 == dieToUse3) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
							   							|| ((dieToUse5 == dieToUse4) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)							   							
					|| ( (dieToUse5 == dieToUse2) && (     ((dieToUse5 == dieToUse1) && (( dieToUse3 == 1) || (dieToUse3 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
														|| ((dieToUse5 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
														|| ((dieToUse5 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5)))) 	)														
					|| ( (dieToUse5 == dieToUse3) && (     ((dieToUse5 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5))) 
														|| ((dieToUse5 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse4 == 1) || (dieToUse4 == 5)))
														|| ((dieToUse5 == dieToUse4) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)														
				    || ( (dieToUse5 == dieToUse4) && (     ((dieToUse5 == dieToUse1) && (( dieToUse2 == 1) || (dieToUse2 == 5)) && ( (dieToUse3 == 1) || (dieToUse3 == 5))) 
				    									|| ((dieToUse5 == dieToUse2) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse5 == 1) || (dieToUse5 == 5)))
				    									|| ((dieToUse5 == dieToUse3) && (( dieToUse1 == 1) || (dieToUse1 == 5)) && ( (dieToUse2 == 1) || (dieToUse2 == 5)))) 	)
				)
				{
				 if( ( dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4 + dieToUse5) == 15 ) {
						try {
							FileInputStream goodPlay = new FileInputStream("sounds/thousandQuote" + fun10 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					   try {
							FileInputStream goodPlay = new FileInputStream("sounds/andFinishHeaterQuote" + fun5 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					}
				 if( ( dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4 + dieToUse5) == (17 | 21 | 25 ) ) {
						try {
							FileInputStream goodPlay = new FileInputStream("sounds/fiveHunQuote" + fun5 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					   try {
							FileInputStream goodPlay = new FileInputStream("sounds/andFinishHeaterQuote" + fun5 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					}
				 if( ( dieToUse1 + dieToUse2 + dieToUse3 + dieToUse4 + dieToUse5) == (20 | 24 | 28 ) ) {
						try {
							FileInputStream goodPlay = new FileInputStream("sounds/sixHunQuote" + fun5 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					    try {
							FileInputStream goodPlay = new FileInputStream("sounds/andFinishHeaterQuote" + fun5 + ".mp3");
							Player playMp3 = new Player(goodPlay);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					}
					scoringDie = 5;
					int[] scorePattern = { yep, scoringDie };
					return scorePattern;
				} else {
					try {
						FileInputStream badPlay = new FileInputStream("sounds/badSelection" + fun10 + ".mp3");
						Player playMp3 = new Player(badPlay);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					scoringDie = 0;
					int[] scorePattern = { nop, scoringDie };
					return scorePattern;
				}
			}
		
		
		

	
}
