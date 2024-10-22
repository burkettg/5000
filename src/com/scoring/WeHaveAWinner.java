package com.scoring;

import java.awt.Color;
import java.io.FileInputStream;
import java.util.Random;

import javax.swing.JOptionPane;

import javazoom.jl.player.Player;

import com.Fivestart;

public class WeHaveAWinner {
	public WeHaveAWinner(){}
	Random rt = new Random();
	int funx5 = rt.nextInt(5);
	
	public void weHaveAWinner(int a) {
		switch(a) {
		case 1: {
					class player1WinsFlash implements Runnable {
					public void run() {
						try {
							FileInputStream fis = new FileInputStream("sounds/player1Wins" + funx5 + ".mp3");
							Player playMp3 = new Player(fis);playMp3.play();				
						   } catch (Exception e) {System.out.println(e);}				
						}			
					}
					Fivestart.takeScore.setText("GAME OVER!!  Player 1 Wins!!   GAME OVER!!");
					Fivestart.takeScore.setBackground(Color.RED);				
					String win1 = "<html><br /><br /><div align=\"Center\">" + "Way to go Player 1!!!" 
									+ "<br /><br /><br />" + "Your WINNING Score = " + Fivestart.player1TotalScore + "<br /><br /><br />" 
									+ "Player 1 WINS!!" + "</div><br /><br /><br /></html>";		        
					Thread gx = new Thread( new player1WinsFlash() );
						gx.start();					
						Object[] options = {"New Game", "Exit"};
			        int n = JOptionPane.showOptionDialog(null,win1,
			            "Player 1 WINS!!",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					if (n == 0){Fivestart.loadNewGameFromWinnerDialog();}
					if (n == 1){System.exit(0);}				
					Fivestart.takeScore.setEnabled(false);
					Fivestart.keepDie.setEnabled(false);
//					Fivestart.rollDie.setEnabled(true);
				} break;
		case 2: {
					class player2WinsFlash implements Runnable {
						public void run() {
							try {
								FileInputStream fis = new FileInputStream("sounds/player2Wins" + funx5 + ".mp3");
								Player playMp3 = new Player(fis);playMp3.play();				
							   } catch (Exception e) {System.out.println(e);}				
						}			
					}
					Fivestart.takeScore.setText("GAME OVER!!  Player 2 Wins!!   GAME OVER!!");
					Fivestart.takeScore.setBackground(Color.RED);				
					String win1 = "<html><br /><br /><div align=\"Center\">" + "Way to go Player 2!!!" 
									+ "<br /><br /><br />" + "Your WINNING Score = " + Fivestart.player2TotalScore + "<br /><br /><br />" 
									+ "Player 2 WINS!!" + "</div><br /><br /><br /></html>";		        
					Thread gx = new Thread( new player2WinsFlash() );
						gx.start();					
						Object[] options = {"New Game", "Exit"};
			        int n = JOptionPane.showOptionDialog(null,win1,
			            "Player 2 WINS!!",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					if (n == 0){Fivestart.loadNewGameFromWinnerDialog();}
					if (n == 1){System.exit(0);}				
					Fivestart.takeScore.setEnabled(false);
					Fivestart.keepDie.setEnabled(false);
//					Fivestart.rollDie.setEnabled(true);	
				} break;
		case 3: {
					class player3WinsFlash implements Runnable {
						public void run() {
							try {
								FileInputStream fis = new FileInputStream("sounds/player3Wins" + funx5 + ".mp3");
								Player playMp3 = new Player(fis);playMp3.play();				
							   } catch (Exception e) {System.out.println(e);}				
						}			
					}
					Fivestart.takeScore.setText("GAME OVER!!  Player 3 Wins!!   GAME OVER!!");
					Fivestart.takeScore.setBackground(Color.RED);				
					String win1 = "<html><br /><br /><div align=\"Center\">" + "Way to go Player 3!!!" 
									+ "<br /><br /><br />" + "Your WINNING Score = " + Fivestart.player3TotalScore + "<br /><br /><br />" 
									+ "Player 3 WINS!!" + "</div><br /><br /><br /></html>";		        
					Thread gx = new Thread( new player3WinsFlash() );
						gx.start();					
						Object[] options = {"New Game", "Exit"};
			        int n = JOptionPane.showOptionDialog(null,win1,
			            "Player 3 WINS!!",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
					if (n == 0){Fivestart.loadNewGameFromWinnerDialog();}
					if (n == 1){System.exit(0);}				
					Fivestart.takeScore.setEnabled(false);
					Fivestart.keepDie.setEnabled(false);
//					Fivestart.rollDie.setEnabled(true);	
				} break;
		case 4: {
			class player4WinsFlash implements Runnable {
				public void run() {
					try {
						FileInputStream fis = new FileInputStream("sounds/player4Wins" + funx5 + ".mp3");
						Player playMp3 = new Player(fis);playMp3.play();				
					   } catch (Exception e) {System.out.println(e);}				
				}			
			}
			Fivestart.takeScore.setText("GAME OVER!!  Player 3 Wins!!   GAME OVER!!");
			Fivestart.takeScore.setBackground(Color.RED);				
			String win1 = "<html><br /><br /><div align=\"Center\">" + "Way to go Player 4!!!" 
							+ "<br /><br /><br />" + "Your WINNING Score = " + Fivestart.player4TotalScore + "<br /><br /><br />" 
							+ "Player 4 WINS!!" + "</div><br /><br /><br /></html>";		        
			Thread gx = new Thread( new player4WinsFlash() );
				gx.start();					
				Object[] options = {"New Game", "Exit"};
	        int n = JOptionPane.showOptionDialog(null,win1,
	            "Player 4 WINS!!",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
			if (n == 0){Fivestart.loadNewGameFromWinnerDialog();}
			if (n == 1){System.exit(0);}				
			Fivestart.takeScore.setEnabled(false);
			Fivestart.keepDie.setEnabled(false);
//			Fivestart.rollDie.setEnabled(true);	
		} break;
		case 5: {
			class weHaveATie implements Runnable {
				public void run() {
					try {
						FileInputStream fis = new FileInputStream("sounds/weHaveATie.mp3");
						Player playMp3 = new Player(fis);playMp3.play();				
					   } catch (Exception e) {System.out.println(e);}				
				}			
			}
			Fivestart.takeScore.setText("GAME NOT OVER!!  WE HAVE A TIE!!   GAME NOT OVER!!");
			Fivestart.takeScore.setBackground(Color.RED);				
			String win1 = "<html><br /><br /><div align=\"Center\">" + "Holy sweaty Water Buffalo, Batman!!!"
							+ "<br /><br />" + "We have a TIE.  Really???  Kind of Lame guys." 
							+ "<br /><br /><br />" + "How to fix this?  All players with High Score to play an overtime " +
									"game to 1000."  + "<br /><br /><br />" 
							+ "Good Luck and GET R DONE!!" + "</div><br /><br /><br /></html>";		        
			Thread gx = new Thread( new weHaveATie() );
				gx.start();					
				Object[] options = {"New Game", "Exit"};
	        int n = JOptionPane.showOptionDialog(null,win1,
	            "WE have a TIE!!",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
			if (n == 0){Fivestart.loadNewGameFromWinnerDialog();}
			if (n == 1){System.exit(0);}				
			Fivestart.takeScore.setEnabled(false);
			Fivestart.keepDie.setEnabled(false);
//			Fivestart.rollDie.setEnabled(true);	
		} break;
		
		
		
		
		
			}
	}
	
	
	
	
	
}
