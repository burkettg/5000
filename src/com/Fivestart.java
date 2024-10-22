//: Object/Fivestart.java
package com;

import game.StartNewGame;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.text.html.*;
import javax.swing.Timer;
import com.players.*;
import com.scoring.TakeHeaterScore;
import com.dice.*;
import com.gblibrary.FamousQuotes;

import static com.gblibrary.SwingConsole.*;
import javazoom.jl.player.Player;
import java.io.FileInputStream;


public class Fivestart extends JFrame implements MouseListener {
/**The gameTotalPointsToWin can be changed
 * at game set up time to determine total points
 * needed to win game.  The default is 5000.
 */
	public static int gameTotalPointsToWin = 5000;
	public static int weHaveAWinnerReset = 0;
	public static ResetDice resetTheDie = new ResetDice();
	public static ResetDiceNewGame resetTheDieNew = new ResetDiceNewGame();
	 	
	 	
	 	
	public static Icon[] dicePics;
	private static final long serialVersionUID = 1L;
	final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
	private boolean mad = false;
	public static int middleOfGameQuoteUsed = 0;
	public static int nearEndOfGameQuoteUsed = 0;
	public static int player1IntoGame = 0;
	public static int player2IntoGame = 0;
	public static int player3IntoGame = 0;
	public static int player4IntoGame = 0;
	
	public static int numberOfDiceToRoll = 5;
	public static int numberOfPlayers;
	public static int currentPlayerNumber = 1;
	public static int player1TotalScore;
	public static int player2TotalScore;
	public static int player3TotalScore;
	public static int player4TotalScore;
	public static Color player1Color = Color.YELLOW;
	public static Color player2Color = Color.ORANGE;
	public static Color player3Color = Color.GREEN;
	public static Color player4Color = Color.CYAN;
	public static Color currentPlayerColor = player1Color;
	
	public static int player1Complete = 0;
	public static int player2Complete = 0;
	public static int player3Complete = 0;
	public static int player4Complete = 0;
	
	public static String[] getSelectedDie;
	public static int heaterDieReserved = 0;
	public static int previousHeaterDieReserved = 0;
	public static String rollValid = "invalid";
	public static int howManyToRoll(){ return numberOfDiceToRoll; }
	
	
	public static int rdie1Result;
	public static int rdie2Result;
	public static int rdie3Result;
	public static int rdie4Result;
	public static int rdie5Result;
	public static int currentHeaterScore;
	public static int currentHeaterTotal;
	
	
	final static JMenuItem menuPlayer = new JMenu("# Player(s)");
	final static JMenuItem menuSelectWinningPoints = new JMenu("Points To Win");
	
	
	
	
	
/** The method just ring up quotes
 * with random selections for the start
 * of the game.	
 * @return
 */
	public static int getRandomQuote5() {
		Random rt = new Random();
		int funx5 = rt.nextInt(5);
		return funx5;
	}
	public static int getRandomQuote10() {
		Random rt = new Random();
		int funx10 = rt.nextInt(10);
		return funx10;
	}
	
	static int getRandomQuote20() {
		Random rg = new Random();
		int funx20 = rg.nextInt(20);
		return funx20;
	}
	
	
	
	public static void loadNewGameFromWinnerDialog() {
		gameTotalPointsToWin = 5000;
		String startkW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "5,000";
        winScore.setText(startkW);
        takeScore.setBackground(null);
        takeScore.setText("Take Score");
        menuPlayer.setEnabled(true);
        menuSelectWinningPoints.setEnabled(true); 
        DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		DieSelected.toggleSwitch5 = true;
		rollDie.setEnabled(false);		  
		StartNewGame.StartNewGame();
		
		
	};
	
	
	
// 'useDie' are utilized when determining which die are moved
// when keepDie button is selected.
	
	
    
    public static JButton rdie1 = new JButton();
	public static JButton rdie2 = new JButton();
	public static JButton rdie3 = new JButton();
	public static JButton rdie4 = new JButton();
	public static JButton rdie5 = new JButton();	    
    public static JButton rollDie;
    JPanel DieZone;
    public static JButton takeScore;
    JButton oopsie;
    JButton currentPlayerHighlight;
    public static JButton currentPlayerScore;
    static JButton winScore;
    public static JButton keepDie;
    JButton blank3;
    JButton blank4;
    JButton blank5;
    JButton blank6;
    JButton blank7;
    JButton blank8;
    JButton blank9;
    JButton blank10;
    JButton blank11;
    JButton blank12;
    static JButton button;
    public static JButton tdie1;
    public static JButton tdie2;
    public static JButton tdie3;
    public static JButton tdie4;
    public static JButton tdie5;
    public static JButton commentScreen;
    public static JButton play1;
    public static JButton play2;
    public static JButton play3;
    public static JButton play4;
    JButton total;
    public static JButton p1Total;
    public static JButton p2Total;
    public static JButton p3Total;
    public static JButton p4Total;
	
    
    public static void roll1Result(int i){ rdie1Result = i; }
    public static void roll2Result(int i){ rdie2Result = i; }
    public static void roll3Result(int i){ rdie3Result = i; }
    public static void roll4Result(int i){ rdie4Result = i; }
    public static void roll5Result(int i){ rdie5Result = i; }
 
 
 
/** This updates the rollValid variable from
 * the LegalRoll class method that checks to 
 * see if roll is valid.  The rollValid result
 *  'valid' or 'invalid' will be used in
 *  checkRollResults method.  
 * @param i
 */
    public static void legalResult( String i) {
    	rollValid = i;
    }
    
    /** RollCheck passes the number of die thrown
     * and results of each of the thrown die
     * to verify if results keep player's turn
     * alive or if they 'BUNK'.
     */
    public static class RollCheck  {
    	public static void RollCheck() {
    		LegalRoll lRoll = new LegalRoll();
			lRoll.isRollLegal(
    				numberOfDiceToRoll, 
    				rdie1Result, 
    				rdie2Result, 
    				rdie3Result, 
    				rdie4Result, 
    				rdie5Result);
		}
    }
    
    
    public static void checkRollResults() {
    	if( rollValid == "valid") {
    		keepDie.setEnabled(true);
    		
    	} else {
    		takeScore.setEnabled(false);
    		int getBunkQuote = getRandomQuote20();
    		commentScreen.setText(FamousQuotes.bunked[getBunkQuote]);
    		try {
				FileInputStream fis = new FileInputStream("sounds/bunked" + getBunkQuote + ".mp3");
				Player playMp3 = new Player(fis);playMp3.play();				
			   } catch (Exception e) {
				System.out.println(e);
			}  
    		currentHeaterScore = 0;
    		currentHeaterTotal = 0;
    		try {
    			Thread.sleep(750);
    		} catch (InterruptedException e) {
    			System.out.println(e);
    		}
    		currentPlayerScore.setText("Heater Score");
   		 	
	      	if(weHaveAWinnerReset == 1){
	      		Fivestart.rollDie.setEnabled(false);
	      	} else {
	      	LoadNextPlayer.nextPlayer(currentPlayerNumber);
   		 	resetTheDie.ResetDiceNow();
   		 	readyThrowDie();
	      	}
    	}
    }
    
    
    /**When the rollDie button is pressed, ClickRollDie MouseListener
     * kicks in and calls ManageThrowThreads which manages threads
     * of rolling of the dice and getting the results.
     * Not very elegant but it works! 
     * @author Greg
     */
    public static class ClickRollDie implements MouseListener {
    	public void mousePressed(MouseEvent e) {
    		ManageThrowThreads q = new ManageThrowThreads();
    		/**  hmmm  I put these null statements here
    		 * but I am not really sure where they should 
    		 * go??  I am trying to reset the checks so the 
    		 * next roll starts fresh with nothing selected.		
    		 */
    				 DieSelected.rdie1Checked = "no";
    				 DieSelected.rdie2Checked = "no";
    				 DieSelected.rdie3Checked = "no";
    				 DieSelected.rdie4Checked = "no";
    				 DieSelected.rdie5Checked = "no";
    		
    		new ExecuteRoll(q);
    		new VerifyValidRoll(q);
    		pauseThrowDie();
    		
    	} 
    	public void mouseReleased(MouseEvent arg0) {}
		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}				
    }
    
    
    
	@Override
	public void mouseReleased(MouseEvent e) {
	}
    
   
	public class takeTheHeaterScore implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TakeHeaterScore addTheTotal = new TakeHeaterScore();
			String wasScoreGood = "no";
			
			switch(currentPlayerNumber){
			case 1: wasScoreGood = addTheTotal.TakeHeaterScore(currentPlayerNumber, player1TotalScore, currentHeaterTotal  ); break;
			case 2: wasScoreGood = addTheTotal.TakeHeaterScore(currentPlayerNumber, player2TotalScore, currentHeaterTotal  ); break;
			case 3: wasScoreGood = addTheTotal.TakeHeaterScore(currentPlayerNumber, player3TotalScore, currentHeaterTotal  ); break;
			case 4: wasScoreGood = addTheTotal.TakeHeaterScore(currentPlayerNumber, player4TotalScore, currentHeaterTotal  ); break;
			default: wasScoreGood = addTheTotal.TakeHeaterScore(currentPlayerNumber, player1TotalScore, currentHeaterTotal  );
			}
			
			if(wasScoreGood == "yes"){
				
				currentHeaterScore = 0;
				currentHeaterTotal = 0;
				currentPlayerScore.setText("Heater Score");
				try {
	    			Thread.sleep(500);
	    		} catch (InterruptedException f) {
	    			f.printStackTrace();
	    		}
				commentScreen.setText("Next Up..  Let's Do This!!");
				ResetDice resetTheDie = new ResetDice();
	   		 	resetTheDie.ResetDiceNow();
	   		 	takeScore.setEnabled(false);
				keepDie.setEnabled(false);
	   		 	currentPlayerScore.setText("Heater Score");
	   		 	
	   		 if(weHaveAWinnerReset == 1){
	   			takeScore.setEnabled(false);
	   			keepDie.setEnabled(false);
	   			rollDie.setEnabled(false);
	   		} else {		   		 	
	   		 	LoadNextPlayer.nextPlayer(currentPlayerNumber);
	   		}
	   		 	
/** Below appears to be a fix for the dice rolling twice.  Below 
 *  I am looking to see if I just ran readyThrowDie()..  thinking
 *  it is loading up two throws for when the 'throw die' button
 * 	is pressed. If rollDie is not enabled- then I load it up.
 *  If it is already enabled.. then the die and button are already set. 
 */
	   		 	if( !(rollDie.isEnabled())) {	   		 	
	   		 	readyThrowDie();	   		 					
	   		 	}							
			}
		}
	}
	
    public class KeepSelectedDie implements ActionListener {
		 public void actionPerformed(ActionEvent e) {
//			 String ga = Integer.toString(rdie1Result);
//	    	 play4.setText(ga);	
	    	 
 /** getSelectedDie is an object holding
  *  an ArrayList telling which die
  *  were checked to be 'reserved' when
  *  keepDie button is pressed.
  */
		getSelectedDie = DieSelected.whichDieAreChecked();
    	 
    	 ArrayList<Integer> verRes = new ArrayList<Integer>();
    	 if(getSelectedDie[0] == "yes"){ verRes.add(rdie1Result); }
    	 if(getSelectedDie[1] == "yes"){ verRes.add(rdie2Result); }
    	 if(getSelectedDie[2] == "yes"){ verRes.add(rdie3Result); }
    	 if(getSelectedDie[3] == "yes"){ verRes.add(rdie4Result); }
    	 if(getSelectedDie[4] == "yes"){ verRes.add(rdie5Result); }	    	 
	    	 
	    	 
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
		 
		 int[] checkScore = checkDieUtilized.VerifyAllReservationDieUtilized(verRes);
		 
		 if ( checkScore[0] == 0 ) {
			 commentScreen.setText(FamousQuotes.badSelection[getRandomQuote10()]);
				
		 }
		 if ( checkScore[0] == 1 ) {
			
			 int[] actualDieRollResults = { rdie1Result,rdie2Result,rdie3Result,rdie4Result,rdie5Result};			 			 
			 AssignReservedDieLocations placeDie = new AssignReservedDieLocations();
			 
/** AssignReservedDieLocations takes several parameters
 *  to determine how to place chosen die on the tdie buttons.
 *  We need to remember that die locations get 'reserved' until
 *  the current heater set is complete with BUNK, a score taken,
 *  or the heater continues into the next roll set.			 
 */
			 placeDie.AssignReservedDieLocations(verRes, getSelectedDie, actualDieRollResults, checkScore[1]);
			 
			 readyThrowDie();
			 
			 }

		 		
		}
	}
   
  
  
 	public static void emptyDie1() {
 		rdie1.setIcon(null);
 	}
 	public static void emptyDie2() {
 		rdie2.setIcon(null);
 	}
 	public static void emptyDie3() {
 		rdie3.setIcon(null);
 	}
 	public static void emptyDie4() {
 		rdie4.setIcon(null);
 	}
 	public static void emptyDie5() {
 		rdie5.setIcon(null);
 	}
	public static void setName1(String a) {
		play1.setText(a);
	}
	public static void setName2(String a) {
		play2.setText(a);
	}
	public static void setName3(String a) {
		play3.setText(a);
	}
	public static void setName4(String a) {
		play4.setText(a);
	}
	public static void setCommentScreen(String a) {
		commentScreen.setText(a);
	}
    
	
	
	
    public Fivestart() {
    	dicePics = new Icon[]{
    			new ImageIcon(getClass().getResource("dice/images/startStone4.gif")),
    			new ImageIcon(getClass().getResource("dice/images/stone1.gif")),
    			new ImageIcon(getClass().getResource("dice/images/stone2.gif")),   			
    			new ImageIcon(getClass().getResource("dice/images/stone3.gif")),   			
    			new ImageIcon(getClass().getResource("dice/images/stone4.gif")),   			
    			new ImageIcon(getClass().getResource("dice/images/stone5.gif")),
    			new ImageIcon(getClass().getResource("dice/images/stone6.gif")),
    			
    			};
    	
   	
    	initGUI();
    }
    
    
    
    public static void gregDie1(int aa) {
    	switch(aa) {			
	    case 1: rdie1.setIcon(dicePics[1]);  break;
	    case 2: rdie1.setIcon(dicePics[2]); break;
	    case 3: rdie1.setIcon(dicePics[3]); break;
	    case 4: rdie1.setIcon(dicePics[4]); break;
	    case 5: rdie1.setIcon(dicePics[5]); break;
	    case 6: rdie1.setIcon(dicePics[6]); break;
	    default: rdie1.setIcon(null); break;   
 		}
    	
 	}
 	public static void gregDie2(int ab) {
 		switch(ab) {			
	    case 1: rdie2.setIcon(dicePics[1]); break;
	    case 2: rdie2.setIcon(dicePics[2]); break;
	    case 3: rdie2.setIcon(dicePics[3]); break;
	    case 4: rdie2.setIcon(dicePics[4]); break;
	    case 5: rdie2.setIcon(dicePics[5]); break;
	    case 6: rdie2.setIcon(dicePics[6]); break;
	    default: rdie2.setIcon(null); break;   
 		}
 	}
	public static void gregDie3(int ac) {
		switch(ac) {			
	    case 1: rdie3.setIcon(dicePics[1]); break;
	    case 2: rdie3.setIcon(dicePics[2]); break;
	    case 3: rdie3.setIcon(dicePics[3]); break;
	    case 4: rdie3.setIcon(dicePics[4]); break;
	    case 5: rdie3.setIcon(dicePics[5]); break;
	    case 6: rdie3.setIcon(dicePics[6]); break;
	    default: rdie3.setIcon(null); break;   
		}
	}
	public static void gregDie4(int ad) {
		switch(ad) {			
	    case 1: rdie4.setIcon(dicePics[1]); break;
	    case 2: rdie4.setIcon(dicePics[2]); break;
	    case 3: rdie4.setIcon(dicePics[3]); break;
	    case 4: rdie4.setIcon(dicePics[4]); break;
	    case 5: rdie4.setIcon(dicePics[5]); break;
	    case 6: rdie4.setIcon(dicePics[6]); break;
	    default: rdie4.setIcon(null); break;   
		}
	}
 	public static void gregDie5(int ae) {
 		switch(ae) {			
	    case 1: rdie5.setIcon(dicePics[1]); break;
	    case 2: rdie5.setIcon(dicePics[2]); break;
	    case 3: rdie5.setIcon(dicePics[3]); break;
	    case 4: rdie5.setIcon(dicePics[4]); break;
	    case 5: rdie5.setIcon(dicePics[5]); break;
	    case 6: rdie5.setIcon(dicePics[6]); break;
	    default: rdie5.setIcon(null); break;   
 		}
 	}
    
    
    
    	public void initGUI() {
    	
		JMenuBar menubar = new JMenuBar();		
		JMenu game = new JMenu("Game");
		game.setMnemonic(KeyEvent.VK_G);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		JMenuItem menuNewGame = new JMenuItem("Start New Game");
//		final JMenuItem menuPlayer = new JMenu("# Player(s)");
//		final JMenuItem menuSelectWinningPoints = new JMenu("Points To Win");
		
		menuExit.setMnemonic(KeyEvent.VK_C);
		menuExit.setToolTipText("Exit 5000");
		menuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		menuNewGame.setMnemonic(KeyEvent.VK_N);
		menuNewGame.setToolTipText("Start New Game");
		menuNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 5000;
				String startkW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "5,000";
		        winScore.setText(startkW);
		        takeScore.setBackground(null);
		        takeScore.setText("Take Score");
		        menuPlayer.setEnabled(true);
				menuSelectWinningPoints.setEnabled(true);								
				DieSelected.toggleSwitch1 = true;
				DieSelected.toggleSwitch2 = true;
				DieSelected.toggleSwitch3 = true;
				DieSelected.toggleSwitch4 = true;
				DieSelected.toggleSwitch5 = true;
				StartNewGame.StartNewGame();
				
			}

	        
			
			
		});
		
		
		
		
		menuSelectWinningPoints.setMnemonic(KeyEvent.VK_S);
		menuSelectWinningPoints.setToolTipText("Change Points to Win");
		
		final JMenuItem twoK = new JMenuItem("2000");
		twoK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 2000;
				menuSelectWinningPoints.setEnabled(false);
				String twokW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "2,000";
		        winScore.setText(twokW);
			}
		});
		
		JMenuItem threeK = new JMenuItem("3000");
		threeK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 3000;
				menuSelectWinningPoints.setEnabled(false);
				String threekW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "3,000";
		        winScore.setText(threekW);
			}
		});
		JMenuItem fiveK = new JMenuItem("5000");
		fiveK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 5000;
				menuSelectWinningPoints.setEnabled(false);
				String fivekW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "5,000";
		        winScore.setText(fivekW);
			}
		});
		JMenuItem sevenK = new JMenuItem("7000");
		sevenK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 7000;
				menuSelectWinningPoints.setEnabled(false);
				String sevenkW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "7,000";
		        winScore.setText(sevenkW);
			}
		});
		JMenuItem tenK = new JMenuItem("10000");
		tenK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 10000;
				menuSelectWinningPoints.setEnabled(false);
				String tenkW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "10,000";
		        winScore.setText(tenkW);
			}
		});
		JMenuItem fifteenK = new JMenuItem("15000");
		fifteenK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 15000;
				menuSelectWinningPoints.setEnabled(false);
				String fiftkW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "15,000";
		        winScore.setText(fiftkW);
			}
		});
		JMenuItem marathonK = new JMenuItem("Marathon");
		marathonK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				gameTotalPointsToWin = 26200;
				menuSelectWinningPoints.setEnabled(false);
				String marakW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "26,200";
		        winScore.setText(marakW);
			}
		});
		
		menuPlayer.setMnemonic(KeyEvent.VK_P);
		menuPlayer.setToolTipText("# Player(s)");
		
		JMenuItem oneP = new JMenuItem("1 Player");
		oneP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				play1.setBackground(player1Color);
				commentScreen.setText("Oh just one player.  This should go quick!");
				play1.setText("Your Name");
				play1.setBackground(player1Color);
				play2.setText(null);
				play3.setText(null);
				play4.setText(null);
				p1Total.setText("0");
				p2Total.setText(null);
				p3Total.setText(null);
				p4Total.setText(null);
				rdie1.setBackground(null);
				rdie2.setBackground(null);
				rdie3.setBackground(null);
				rdie4.setBackground(null);
				rdie5.setBackground(null);
				Player1Name getName1 = new Player1Name();
				getName1.Player1Name();
				numberOfPlayers = 1;
				menuPlayer.setEnabled(false);
				menuSelectWinningPoints.setEnabled(false);
				LoadNextPlayer.loadFirstPlayer();
				readyThrowDie();
				
			}
		});						
		JMenuItem twoP = new JMenuItem("2 Players");
		twoP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				play1.setText("Your Name");
				play2.setText("Your Name");
				play1.setBackground(player1Color);
				play2.setBackground(player2Color);
				commentScreen.setText("Dos players!");
				play3.setText(null);
				play4.setText(null);
				p3Total.setText(null);
				p4Total.setText(null);
				Player2Name getName2 = new Player2Name();
				getName2.Player2Name();
				numberOfPlayers = 2;
				menuPlayer.setEnabled(false);
				menuSelectWinningPoints.setEnabled(false);
				LoadNextPlayer.loadFirstPlayer();
				readyThrowDie();
			}
		});
		JMenuItem threeP = new JMenuItem("3 Players");
		threeP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				play1.setText("Your Name");
				play2.setText("Your Name");
				play3.setText("Your Name");
				play1.setBackground(player1Color);
				play2.setBackground(player2Color);
				play3.setBackground(player3Color);
				commentScreen.setText("Three players, huh?  Now we have a game!");
				play4.setText(null);
				p4Total.setText(null);
				Player3Name getName3 = new Player3Name();
				getName3.Player3Name();
				numberOfPlayers = 3;
				menuPlayer.setEnabled(false);
				menuSelectWinningPoints.setEnabled(false);
				LoadNextPlayer.loadFirstPlayer();
				readyThrowDie();
			}
		});
		JMenuItem fourP = new JMenuItem("4 Players");
		fourP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				play1.setText("Your Name");
				play2.setText("Your Name");
				play3.setText("Your Name");
				play4.setText("Your Name");
				play1.setBackground(player1Color);
				play2.setBackground(player2Color);
				play3.setBackground(player3Color);
				play4.setBackground(player4Color);
				commentScreen.setText("FUll HOUSE! Should make for a lively game!");				
				Player4Name getName4 = new Player4Name();
				getName4.Player4Name();
				numberOfPlayers = 4;
				menuPlayer.setEnabled(false);
				menuSelectWinningPoints.setEnabled(false);
				LoadNextPlayer.loadFirstPlayer();
				readyThrowDie();
			}
		});
		
		JMenu Instruction = new JMenu("Help");
		game.setMnemonic(KeyEvent.VK_I);
		
		JMenuItem pointOfGame = new JMenuItem("Point of Game");
		JMenuItem howToScore = new JMenuItem("How To Score");
		JMenuItem gettingStarted = new JMenuItem("Getting Started");
		JMenuItem about = new JMenuItem("About 5000");

		
		
/** The class below is a Runnable
 * to allow me to start a thread playing
 * sound for the 'How To Score' instruction.
 * I start the thread when the showConfirmDialog
 * is opened and the thread is stopped when
 * the dialog is closed.		
 * @author Greg
 *
 */
		class playHowToScore implements Runnable {
			public void run() {
				try {
					FileInputStream fis = new FileInputStream("sounds/howToScore.mp3");
					Player playMp3 = new Player(fis);playMp3.play();				
				   } catch (Exception e) {System.out.println(e);}				
			}			
		}
						
		
		
		howToScore.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event) {
				Thread gx = new Thread( new playHowToScore() );
				gx.start();				
				JOptionPane.showConfirmDialog(null,
						"Scoring is Simple.\n\n " +
						"You have to get and 'Keep' points with every roll of the dice. \n\n" +
						"You can Keep just one die or Keep them all. So long as you \n" +
						"have valid points.  Here are the valid points:\n\n" +
						"A 'one' equals 100 and a 'five' equals 50.\n" +
						"So if any roll has a 1 or a 5, you are still in your 'heater'.\n" +
						"That means you are still able to roll.\n\n" +
						"You can also get three of a kind.\n" +
						"You just take the number on the die times 100.\n" +
						"Three 'fours' equals 400.  Three 'fives' equals 500.\n" +
						"You get the point.\n\n" +
						"There are also two special scores..\n" +
						"Three 'ones' equals 1000 points.\n" +
						"If you get 1, 2, 3, 4, 5 all in the same roll, you get 1000 points.\n\n" +
						"If you 'Keep' all your die, the game will reset the die and let you\n" +
						"continue rolling for more points.  When you have run out of luck\n" +
						"(feel like you won't get valid points next time), you can 'Take' your score.\n\n" +
						"Just remember, if you don't roll a valid score " +
						"on any given roll- you BUNK.\n" +
						"That means you lose all your current heater points and give " +
						"up your turn.\n\n" +
						"Good Luck!!",
					"5000 Instructions - How to Score",JOptionPane.PLAIN_MESSAGE);
				gx.stop();
				
			}
		});


		
/** The class below is a Runnable
 * to allow me to start a thread playing
 * sound for the 'Point of Game' instruction.
 * I start the thread when the showConfirmDialog
 * is opened and the thread is stopped when
 * the dialog is closed.		
 * @author Greg
 *
 */
		class playPointOfGame implements Runnable {
			public void run() {
				try {
					FileInputStream fis = new FileInputStream("sounds/pointOfGame.mp3");
					Player playMp3 = new Player(fis);playMp3.play();				
				   } catch (Exception e) {
					System.out.println(e);
				}				
			}			
		}
		
		pointOfGame.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event) {
				Thread gg = new Thread( new playPointOfGame() );
				gg.start();
				JOptionPane.showConfirmDialog(null,
						"The game is 5000.\n\n" +
						"You play until the first person gets to 5000.\n\n" +
						"Then everyone else gets one final shot to get high score.\n\n" +
						"If you are in a hurry or want a longer game,\n" +
						"just select the Game, Points to Win option and off you go.\n\n" +
						"Just remember, you need 450 points to get into the game!\n\n" +
						"Good Luck!!",
					"5000 Instructions - Point of Game",JOptionPane.PLAIN_MESSAGE);
				gg.stop();
				
			}
		});
		
		class GettingStarted implements Runnable {
			public void run() {
				try {
					FileInputStream fis = new FileInputStream("sounds/gettingStarted.mp3");
					Player playMp3 = new Player(fis);playMp3.play();				
				   } catch (Exception e) {
					System.out.println(e);
				}				
			}			
		}
		
		gettingStarted.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent event) {
				Thread gx = new Thread( new GettingStarted() );
				gx.start();
				JOptionPane.showConfirmDialog(null,
						"The game is 5000 and getting started is Simple.\n\n" +
						"The Winning Score is set to a default of 5000 points but\n" +
						"you can select different Winning Point Levels with\n" +
						"the 'Points to Win' menu opton if you desire.\n\n" +
						"Next, just select the number of players and fill in the names.\n\n" +
						"You can figure the rest out yourself!!\n\n" +
						"Just remember, you need 450 points to get into the game!\n\n" +
						"Good Luck!!",
					"5000 Instructions - Getting Started",JOptionPane.PLAIN_MESSAGE);
				gx.stop();
				
			}
		});
		
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showConfirmDialog(null,
						"5000. Copyright © 2012.\n" +
						"Revision 0.1 (alpha)\n\n" +
						"The game, 5000, is a fun dice game I picked up while in\n" +
						"college.  It's a lot more fun to play with real dice, and people!\n" +
						"After you learn to play; grab some family, friends,\n" +
						"a notepad to keep score and five dice for some big fun\n" +
						"at the kitchen table!!\n\n" +
						"Geekspeak: The gameboard uses java's GridBagLayout in this\n" +
						"early revision.  It's a little tricky for a beginner.\n" +
						"The voice hopefully adds a bit of novelty to the game.\n\n" +
						"Please enjoy and email some feedback\n" +
						"to dusty5732@hotmail.com so I can make the next\n" +
						"revision even better.\n\n" +
						"More geekspeak: Up on the scrum deck is a fresh GUI, better sound!,\n" +
						"better Object utilizaton (Duh.. Java is an Object Oriented language),\n" +
						"interactive play over internet and a cellphone\n" +
						"wrapper- somewhat in that order until the next idea\n" +
						"comes along.  Why can't 4 players (in different parts of\n" +
						"the world) play together on their cellphones in real-time\n" +
						"while driving home in traffic :)\n" +
						"Seriously- Don't do that!!\n\n" +
						"Enjoy the game and Good Luck!!",
					"5000 Instructions - About 5000",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		menuPlayer.add(oneP);
		menuPlayer.add(twoP);
		menuPlayer.add(threeP);
		menuPlayer.add(fourP);
		
		menuSelectWinningPoints.add(twoK);
		menuSelectWinningPoints.add(threeK);
		menuSelectWinningPoints.add(fiveK);
		menuSelectWinningPoints.add(sevenK);
		menuSelectWinningPoints.add(tenK);
		menuSelectWinningPoints.add(fifteenK);
		menuSelectWinningPoints.add(marathonK);
		
		
		game.add(menuExit);
		game.add(menuNewGame);
		game.addSeparator();
		game.add(menuSelectWinningPoints);
		game.add(menuPlayer);
		
		menubar.add(game);
		menubar.add(Instruction);
		setJMenuBar(menubar);
    		
    	Instruction.add(pointOfGame);
    	Instruction.add(howToScore);
    	Instruction.add(gettingStarted);
    	Instruction.add(about);
    		
    		
    		
    	JPanel pane = new JPanel(new GridBagLayout());
    	this.getContentPane().add(pane);
    	GridBagConstraints c = new GridBagConstraints();
    	
    
    	
      
	 
       
        if (shouldFill) {
        //natural height, maximum width
        c.fill = GridBagConstraints.HORIZONTAL;
        }
     
        rdie1 = new JButton(dicePics[0]);
        if (shouldWeightX) {
        	c.ipady = 40;      //make this component tall
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(rdie1, c);
        
     
        rdie2 = new JButton(dicePics[0]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(rdie2, c);
        
        rdie3 = new JButton(dicePics[0]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(rdie3, c);
     
        rdie4 = new JButton(dicePics[0]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        pane.add(rdie4, c);
        
        rdie5 = new JButton(dicePics[0]);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 0;
        pane.add(rdie5, c);
        
        rollDie = new JButton("Throw Die");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 0;
        pane.add(rollDie, c);
               
        JPanel rollZone = new JPanel();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(rollZone, c);
        
        String ptsW = "<html>" + "Points" + "<br />" + "to Win:" + "<br />" + "5,000";
        winScore = new JButton(ptsW);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 5;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(winScore, c);
        
        takeScore = new JButton("TAKE SCORE");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(takeScore, c);
        
        keepDie = new JButton("Keep Die");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 4;
        c.gridy = 2;
        pane.add(keepDie, c);
        
        tdie1 = new JButton("tdie1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 2;
        pane.add(tdie1, c);
        
        currentPlayerHighlight = new JButton("Current Heater Score:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(currentPlayerHighlight, c);
        
        currentPlayerScore = new JButton("Current Score");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 3;
        c.gridy = 3;
        pane.add(currentPlayerScore, c);
        
        tdie2 = new JButton("tdie2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 3;
        pane.add(tdie2, c);
        
        commentScreen = new JButton("Wow!  How about that..");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 5;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(commentScreen, c);
        
        tdie3 = new JButton("tdie3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 4;
        pane.add(tdie3, c);
        
        blank3 = new JButton("blank3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(blank3, c);
        
        play1 = new JButton("play1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(play1, c);
        
        play2 = new JButton("play2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        pane.add(play2, c);
        
        play3 = new JButton("play3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 5;
        pane.add(play3, c);
        
        play4 = new JButton("play4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 5;
        pane.add(play4, c);
        
        tdie4 = new JButton("tdie4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 5;
        pane.add(tdie4, c);
        
        total = new JButton("Total:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 6;
        pane.add(total, c);
        
        p1Total = new JButton("playT1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        pane.add(p1Total, c);
        
        p2Total = new JButton("playT2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 6;
        pane.add(p2Total, c);
        
        p3Total = new JButton("playT3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 6;
        pane.add(p3Total, c);
        
        p4Total = new JButton("playT4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 6;
        pane.add(p4Total, c);
        
        tdie5 = new JButton("tdie5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 10;      //make this component tall
        c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 6;
        pane.add(tdie5, c);
        
        

/** Here I set up the action listeners with method's
 *  determining when they are on or off.    	
 */
        rdie1.addActionListener(DieSelected.rdiePress1);
        rdie2.addActionListener(DieSelected.rdiePress2);
        rdie3.addActionListener(DieSelected.rdiePress3);
        rdie4.addActionListener(DieSelected.rdiePress4);
        rdie5.addActionListener(DieSelected.rdiePress5);
        keepDie.addActionListener(new KeepSelectedDie());
        takeScore.addActionListener(new takeTheHeaterScore());
        
	}  
        
    
    	  private void enableThePlayerMenu() {
			// TODO Auto-generated method stub
			
		}
    	
		public static void pauseThrowDie() {
    		  rollDie.removeMouseListener(rollDie.getMouseListeners()[1]);
    		  rollDie.setEnabled(false);   	  
		}
         
		public static void readyThrowDie() {
			if(weHaveAWinnerReset == 1 ){
				rollDie.setEnabled(false);
			} else {
				rollDie.setEnabled(true);
				 rollDie.addMouseListener(new ClickRollDie());
			}
        	  
          }  
        
    
		
		
   
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
  
    
    public static void main(String[] args) {
		run(new Fivestart(), 600, 600);
		
		rollDie.setEnabled(false);
		keepDie.setEnabled(false);
		takeScore.setEnabled(false);
				
		 try {
				FileInputStream fis = new FileInputStream("sounds/startGameQuote" + getRandomQuote10() + ".mp3");
				Player playMp3 = new Player(fis);playMp3.play();	
			  } catch (Exception e) {
				System.out.println(e);
			}  
		
	}
    
    
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}






