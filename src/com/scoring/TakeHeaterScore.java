package com.scoring;

import java.io.FileInputStream;
import java.util.Random;

import javazoom.jl.player.Player;

import com.Fivestart;
import com.gblibrary.FamousQuotes;

public class TakeHeaterScore {
	 public TakeHeaterScore(){}
	 Random rz = new Random();
		int fun10 = rz.nextInt(10);
		int fun5 = rz.nextInt(5);
		int fun3 = rz.nextInt(3);
		
/** TakeHeaterScore has the current player's Total score
 *  and current heater total passed in and a check is done
 *  to see if player meets 450 minimum entry score requirement.
 *  If yes, the current heater total is added to the players
 *  total and the next round begins for that player or the next
 *  player.
 * @param playerCurScore
 * @param currentHeatTotal
 * @return 
 * @return 
 */
	public String TakeHeaterScore(int currentPlayerNum, int playerCurScore, int currentHeatTotal ){
	String ScoreUpdated = "no";
	Fivestart.rollDie.setEnabled(false);
	
		int playerCurrentPoints = playerCurScore;		
		int currentHeaterTot = currentHeatTotal;
				
		if( (currentHeaterTot + playerCurrentPoints) < 450) {
			Fivestart.commentScreen.setText(FamousQuotes.getInGame[fun5]);
			try {
			    FileInputStream badPlay = new FileInputStream("sounds/getInGame" + fun5 + ".mp3");
				Player playMp3 = new Player(badPlay);playMp3.play();					
			   } catch (Exception e1) {System.out.println(e1);} 
			ScoreUpdated = "no";
			Fivestart.rollDie.setEnabled(true);
		}		
		
		
		
		else if ( (currentHeaterTot + playerCurrentPoints) >= Fivestart.gameTotalPointsToWin) {
			try {
			    FileInputStream badPlay = new FileInputStream("sounds/possibleWinner" + fun5 + ".mp3");
				Player playMp3 = new Player(badPlay);playMp3.play();					
			   } catch (Exception e1) {System.out.println(e1);} 
			switch(currentPlayerNum) {
			case 1: Fivestart.player1TotalScore = playerCurrentPoints + currentHeaterTot; 
					Fivestart.p1Total.setText(Integer.toString(Fivestart.player1TotalScore));
					Fivestart.player1Complete = 1; break;
			case 2: Fivestart.player2TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p2Total.setText(Integer.toString(Fivestart.player2TotalScore));
					Fivestart.player2Complete = 1; break;
			case 3: Fivestart.player3TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p3Total.setText(Integer.toString(Fivestart.player3TotalScore));
					Fivestart.player3Complete = 1; break;
			case 4: Fivestart.player4TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p4Total.setText(Integer.toString(Fivestart.player4TotalScore));
					Fivestart.player4Complete = 1; break;
			default: Fivestart.player1TotalScore = playerCurrentPoints + currentHeaterTot;
					 Fivestart.p1Total.setText(Integer.toString(Fivestart.player1TotalScore));
					 Fivestart.player1Complete = 1;
			}						
			ScoreUpdated = "yes";			
		}				
		else {			
			switch(currentPlayerNum) {
			case 1: Fivestart.player1TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p1Total.setText(Integer.toString(Fivestart.player1TotalScore)); break;
			case 2: Fivestart.player2TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p2Total.setText(Integer.toString(Fivestart.player2TotalScore)); break;
			case 3: Fivestart.player3TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p3Total.setText(Integer.toString(Fivestart.player3TotalScore)); break;
			case 4: Fivestart.player4TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p4Total.setText(Integer.toString(Fivestart.player4TotalScore)); break;
			default: Fivestart.player1TotalScore = playerCurrentPoints + currentHeaterTot;
					Fivestart.p1Total.setText(Integer.toString(Fivestart.player1TotalScore));
			}						
			Fivestart.commentScreen.setText("Cool!  Just added another " + currentHeaterTot + " to  your score.");
			ScoreUpdated = "yes";			
				
			if ( (currentHeaterTot + playerCurrentPoints) >= 450) {
				switch(currentPlayerNum) {
				case 1: { if(Fivestart.player1IntoGame == 0) {
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/player1InGame" + fun5 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.player1IntoGame = 1;}
						} break;
				case 2: { if(Fivestart.player2IntoGame == 0) {
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/player2InGame" + fun5 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.player2IntoGame = 1; }
						} break;
				case 3: { if(Fivestart.player3IntoGame == 0) {
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/player3InGame" + fun5 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
						Fivestart.player3IntoGame = 1; }
						} break;
				case 4: { if(Fivestart.player4IntoGame == 0) {
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/player4InGame" + fun5 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
						Fivestart.player4IntoGame = 1; }
							} break;
				default: { if(Fivestart.player1IntoGame == 0) {
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/player1InGame" + fun5 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.player1IntoGame = 1; }
					} 					
				}						
			}
			
			if ( ((currentHeaterTot + playerCurrentPoints) >= 450) && ((currentHeaterTot + playerCurrentPoints) < Fivestart.gameTotalPointsToWin ) && (Fivestart.middleOfGameQuoteUsed == 0) ) {
				switch(Fivestart.gameTotalPointsToWin) {
				case 2000: {
						if( (currentHeaterTot + playerCurrentPoints) >= 1000 ){
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
						   Fivestart.middleOfGameQuoteUsed = 1; }
						} break;
				case 3000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 1500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				case 5000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 2500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				case 7000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 3500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				case 10000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 5000 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				case 15000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 7500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				case 26200: {
					if( (currentHeaterTot + playerCurrentPoints) >= 13100 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.middleOfGameQuoteUsed = 1; }
					} break;
				default: {
					if( (currentHeaterTot + playerCurrentPoints) >= 2500 ){
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/middleOfGame" + fun10 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
						   Fivestart.middleOfGameQuoteUsed = 1; }
						}
				}
			}
			
			if ( ((currentHeaterTot + playerCurrentPoints) >= 450) && ((currentHeaterTot + playerCurrentPoints) < Fivestart.gameTotalPointsToWin ) && (Fivestart.middleOfGameQuoteUsed == 1) && (Fivestart.nearEndOfGameQuoteUsed == 0) ) {
				switch(Fivestart.gameTotalPointsToWin) {
				case 2000: {
						if( (currentHeaterTot + playerCurrentPoints) >= 1600 ){
						try {
						    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
							Player playMp3 = new Player(intoGameQuote);playMp3.play();					
						   } catch (Exception e1) {System.out.println(e1);}
						   Fivestart.nearEndOfGameQuoteUsed = 1; }
						} break;
				case 3000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 2600 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				case 5000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 4500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				case 7000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 6500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				case 10000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 9500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				case 15000: {
					if( (currentHeaterTot + playerCurrentPoints) >= 14100 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				case 26200: {
					if( (currentHeaterTot + playerCurrentPoints) >= 25000 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					} break;
				default: {
					if( (currentHeaterTot + playerCurrentPoints) >= 4500 ){
					try {
					    FileInputStream intoGameQuote = new FileInputStream("sounds/nearEndOfGame" + fun10 + ".mp3");
						Player playMp3 = new Player(intoGameQuote);playMp3.play();					
					   } catch (Exception e1) {System.out.println(e1);}
					   Fivestart.nearEndOfGameQuoteUsed = 1; }
					}					
				}  // this is end of switch statement for nearEndOfGame logic check.
				}  //this is end of nearEndOfGame Logic Check.
		
		}  // this is the end of the 'else' statement if the Fivestart.gameTotalPointsToWin has not been reached yet.					
		return ScoreUpdated;	
}

}
