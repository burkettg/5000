//: Object/players/LoadNextPlayer.java
package com.players;

import game.StartNewGame;

import java.awt.Color;
import java.io.FileInputStream;
import java.util.Random;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
import com.Fivestart;
import com.dice.DieSelected;
import com.scoring.WeHaveAWinner;

/** LoadNextPlayer class does just that.. it
 *  determines and then loads up the next
 *  player.  The main method is nextPlayer which
 *  determines who goes next.
 * @author Compaq_Owner
 *
 */
public class LoadNextPlayer {
	 	static Random rj = new Random();
		static int funa10 = rj.nextInt(10);
		static int funa5 = rj.nextInt(5);
		static int funa3 = rj.nextInt(3);
		static WeHaveAWinner winnerComment = new WeHaveAWinner();
	LoadNextPlayer() {}
	
	public static void loadFirstPlayer() {
		Fivestart.rollDie.setBackground(Fivestart.player1Color);
		Fivestart.keepDie.setBackground(Fivestart.player1Color);
		Fivestart.p1Total.setBackground(Fivestart.player1Color);
		Fivestart.currentPlayerColor = Fivestart.player1Color;
	}
	
	
	
	public static void nextPlayer(int currentPlayerNumber) {
		int totalPlayers = Fivestart.numberOfPlayers;
	
	
		if (totalPlayers == 1) {
			if (Fivestart.player1Complete == 1) {
				Fivestart.weHaveAWinnerReset = 1;
				winnerComment.weHaveAWinner(1);
			} else {
			loadPlayer1();
			}
		}
		else if (totalPlayers == 2) {
			switch(currentPlayerNumber) {
			case 1: {if (Fivestart.player2Complete == 1) {
						if( Fivestart.player2TotalScore > Fivestart.player1TotalScore ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);			   		 	
						} else if( Fivestart.player2TotalScore == Fivestart.player1TotalScore) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(5);
						} else if( Fivestart.player2TotalScore < Fivestart.player1TotalScore) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						}
					} else {loadPlayer2();}}; break;
			case 2: {if (Fivestart.player1Complete == 1) {				
						if( Fivestart.player1TotalScore > Fivestart.player2TotalScore ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( Fivestart.player1TotalScore == Fivestart.player2TotalScore) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(5);
						} else if( Fivestart.player2TotalScore > Fivestart.player1TotalScore) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);	
						}
					} else {loadPlayer1();}}; break;
			default: loadPlayer1();
			}
		}
		else if (totalPlayers == 3) {
			switch(currentPlayerNumber) {
			case 1: {if (Fivestart.player2Complete == 1) {
						if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( 		(Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore)
									 || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(5);
						}
					} else {loadPlayer2();}}; break;
			case 2: {if (Fivestart.player3Complete == 1) {
						if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( 		(Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore)
									 || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(5);
						}	
					} else {loadPlayer3();}}; break;
			case 3: {if (Fivestart.player1Complete == 1) {
						if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( 		(Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore)
									 || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(5);
						}			   		 	
					} else {loadPlayer1();}}; break;
			default: loadPlayer1();
			}
		}
		else if (totalPlayers == 4) {
			switch(currentPlayerNumber) {
			case 1: {if (Fivestart.player2Complete == 1) {
						if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) && (Fivestart.player2TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) && (Fivestart.player1TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) && (Fivestart.player3TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( (Fivestart.player4TotalScore > Fivestart.player1TotalScore) && (Fivestart.player4TotalScore > Fivestart.player2TotalScore) && (Fivestart.player4TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(4);
						} else if( 	   (Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore) 
									|| (Fivestart.player1TotalScore == Fivestart.player4TotalScore) || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)
									|| (Fivestart.player2TotalScore == Fivestart.player4TotalScore) || (Fivestart.player3TotalScore == Fivestart.player4TotalScore)) 
								{
									Fivestart.weHaveAWinnerReset = 1;
									winnerComment.weHaveAWinner(5);
								}
					} else {loadPlayer2();}}; break;
			case 2: {if (Fivestart.player3Complete == 1) {
						if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) && (Fivestart.player3TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) && (Fivestart.player1TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) && (Fivestart.player2TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player4TotalScore > Fivestart.player1TotalScore) && (Fivestart.player4TotalScore > Fivestart.player2TotalScore) && (Fivestart.player4TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(4);
						} else if( 	   (Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore) 
								|| (Fivestart.player1TotalScore == Fivestart.player4TotalScore) || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)
								|| (Fivestart.player2TotalScore == Fivestart.player4TotalScore) || (Fivestart.player3TotalScore == Fivestart.player4TotalScore)) 
							{
								Fivestart.weHaveAWinnerReset = 1;
								winnerComment.weHaveAWinner(5);
							}
					} else {loadPlayer3();}}; break;
			case 3: {if (Fivestart.player4Complete == 1) {
						if( (Fivestart.player4TotalScore > Fivestart.player1TotalScore) && (Fivestart.player4TotalScore > Fivestart.player2TotalScore) && (Fivestart.player4TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(4);
						} else if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) && (Fivestart.player1TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) && (Fivestart.player2TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) && (Fivestart.player3TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( 	   (Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore) 
								|| (Fivestart.player1TotalScore == Fivestart.player4TotalScore) || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)
								|| (Fivestart.player2TotalScore == Fivestart.player4TotalScore) || (Fivestart.player3TotalScore == Fivestart.player4TotalScore)) 
							{
								Fivestart.weHaveAWinnerReset = 1;
								winnerComment.weHaveAWinner(5);
							}
					} else {loadPlayer4();}}; break;
			case 4: {if (Fivestart.player1Complete == 1) {
						if( (Fivestart.player1TotalScore > Fivestart.player2TotalScore) && (Fivestart.player1TotalScore > Fivestart.player3TotalScore) && (Fivestart.player1TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(1);
						} else if( (Fivestart.player2TotalScore > Fivestart.player1TotalScore) && (Fivestart.player2TotalScore > Fivestart.player3TotalScore) && (Fivestart.player2TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(2);
						} else if( (Fivestart.player3TotalScore > Fivestart.player1TotalScore) && (Fivestart.player3TotalScore > Fivestart.player2TotalScore) && (Fivestart.player3TotalScore > Fivestart.player4TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(3);
						} else if( (Fivestart.player4TotalScore > Fivestart.player1TotalScore) && (Fivestart.player4TotalScore > Fivestart.player2TotalScore) && (Fivestart.player4TotalScore > Fivestart.player3TotalScore) ) {
							Fivestart.weHaveAWinnerReset = 1;
							winnerComment.weHaveAWinner(4);
						} else if( 	   (Fivestart.player1TotalScore == Fivestart.player2TotalScore) || (Fivestart.player1TotalScore == Fivestart.player3TotalScore) 
								|| (Fivestart.player1TotalScore == Fivestart.player4TotalScore) || (Fivestart.player2TotalScore == Fivestart.player3TotalScore)
								|| (Fivestart.player2TotalScore == Fivestart.player4TotalScore) || (Fivestart.player3TotalScore == Fivestart.player4TotalScore)) 
							{
								Fivestart.weHaveAWinnerReset = 1;
								winnerComment.weHaveAWinner(5);
							}
				
				
					} else {loadPlayer1();}}; break;
			default: loadPlayer1();
			}
		}
		else {
			switch(currentPlayerNumber) {
			case 1: loadPlayer2(); break;
			case 2: loadPlayer3(); break;
			case 3: loadPlayer4(); break;
			case 4: loadPlayer1(); break;
			default: loadPlayer1();
		}
		}
		
	}
	private static void loadPlayer1() {
		Fivestart.rollDie.setBackground(Fivestart.player1Color);
		Fivestart.keepDie.setBackground(Fivestart.player1Color);
		Fivestart.p1Total.setBackground(Fivestart.player1Color);
		Fivestart.p2Total.setBackground(null);
		Fivestart.p3Total.setBackground(null);
		Fivestart.p4Total.setBackground(null);
		Fivestart.currentPlayerColor = Fivestart.player1Color;
		Fivestart.currentPlayerNumber = 1;
		Fivestart.rollDie.setEnabled(true);
		DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		DieSelected.toggleSwitch5 = true;
	}
	static void loadPlayer2() {
		Fivestart.rollDie.setBackground(Fivestart.player2Color);
		Fivestart.keepDie.setBackground(Fivestart.player2Color);
		Fivestart.p2Total.setBackground(Fivestart.player2Color);
		Fivestart.p1Total.setBackground(null);
		Fivestart.p3Total.setBackground(null);
		Fivestart.p4Total.setBackground(null);
		Fivestart.currentPlayerColor = Fivestart.player2Color;
		Fivestart.currentPlayerNumber = 2;
		Fivestart.rollDie.setEnabled(true);
		DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		DieSelected.toggleSwitch5 = true;
	}
	
	
	static void loadPlayer3() {
		Fivestart.rollDie.setBackground(Fivestart.player3Color);
		Fivestart.keepDie.setBackground(Fivestart.player3Color);
		Fivestart.p3Total.setBackground(Fivestart.player3Color);
		Fivestart.p1Total.setBackground(null);
		Fivestart.p2Total.setBackground(null);
		Fivestart.p4Total.setBackground(null);
		Fivestart.currentPlayerColor = Fivestart.player3Color;
		Fivestart.currentPlayerNumber = 3;
		Fivestart.rollDie.setEnabled(true);
		DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		DieSelected.toggleSwitch5 = true;
	}
	static void loadPlayer4() {
		Fivestart.rollDie.setBackground(Fivestart.player4Color);
		Fivestart.keepDie.setBackground(Fivestart.player4Color);
		Fivestart.p4Total.setBackground(Fivestart.player4Color);
		Fivestart.p1Total.setBackground(null);
		Fivestart.p2Total.setBackground(null);
		Fivestart.p3Total.setBackground(null);
		Fivestart.currentPlayerColor = Fivestart.player4Color;
		Fivestart.currentPlayerNumber = 4;
		Fivestart.rollDie.setEnabled(true);
		DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		DieSelected.toggleSwitch5 = true;
	}


}
