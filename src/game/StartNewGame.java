package game;

import com.Fivestart;
import com.dice.DieSelected;
import com.dice.ManageThrowThreads;
import com.players.LoadNextPlayer;
import javax.swing.*;
import java.awt.*;

public class StartNewGame {
	
	public static void StartNewGame(){
		
		ManageThrowThreads.valueSet = false;
		
		DieSelected.toggleSwitch1 = true;
		DieSelected.toggleSwitch2 = true;
		DieSelected.toggleSwitch3 = true;
		DieSelected.toggleSwitch4 = true;
		
		Fivestart.rollDie.setBackground(null);
		Fivestart.keepDie.setBackground(null);
		Fivestart.p1Total.setBackground(null);
		Fivestart.p2Total.setBackground(null);
		Fivestart.p3Total.setBackground(null);
		Fivestart.p4Total.setBackground(null);
		Fivestart.p1Total.setText(null);
		Fivestart.p2Total.setText(null);
		Fivestart.p3Total.setText(null);
		Fivestart.p4Total.setText(null);
		
		Fivestart.play1.setText("player 1");
		Fivestart.play2.setText("player 2");
		Fivestart.play3.setText("player 3");
		Fivestart.play4.setText("player 4");
		Fivestart.play1.setBackground(null);
		Fivestart.play2.setBackground(null);
		Fivestart.play3.setBackground(null);
		Fivestart.play4.setBackground(null);
		
		Fivestart.rdie1.setBackground(null);
		Fivestart.rdie2.setBackground(null);
		Fivestart.rdie3.setBackground(null);
		Fivestart.rdie4.setBackground(null);
		Fivestart.rdie5.setBackground(null);
		Fivestart.rdie1.setIcon(Fivestart.dicePics[0]);
		Fivestart.rdie2.setIcon(Fivestart.dicePics[0]);
		Fivestart.rdie3.setIcon(Fivestart.dicePics[0]);
		Fivestart.rdie4.setIcon(Fivestart.dicePics[0]);
		Fivestart.rdie5.setIcon(Fivestart.dicePics[0]);
		
		Fivestart.tdie1.setBackground(null);
		Fivestart.tdie2.setBackground(null);
		Fivestart.tdie3.setBackground(null);
		Fivestart.tdie4.setBackground(null);
		Fivestart.tdie5.setBackground(null);
		Fivestart.tdie1.setIcon(null);
		Fivestart.tdie2.setIcon(null);
		Fivestart.tdie3.setIcon(null);
		Fivestart.tdie4.setIcon(null);
		Fivestart.tdie5.setIcon(null);
		Fivestart.tdie2.setText(null);
		Fivestart.tdie2.setText(null);
		Fivestart.tdie3.setText(null);
		Fivestart.tdie4.setText(null);
		Fivestart.tdie5.setText(null);
		
		DieSelected.rdie1Checked = "no";
		DieSelected.rdie2Checked = "no";
		DieSelected.rdie3Checked = "no";
		DieSelected.rdie4Checked = "no";
		DieSelected.rdie5Checked = "no";
		
		Fivestart.middleOfGameQuoteUsed = 0;
		Fivestart.nearEndOfGameQuoteUsed = 0;
		Fivestart.player1IntoGame = 0;
		Fivestart.player2IntoGame = 0;
		Fivestart.player3IntoGame = 0;
		Fivestart.player4IntoGame = 0;
		
		Fivestart.player1TotalScore = 0;
		Fivestart.player2TotalScore = 0;
		Fivestart.player3TotalScore = 0;
		Fivestart.player4TotalScore = 0;
		
		Fivestart.gameTotalPointsToWin = 5000;
		Fivestart.weHaveAWinnerReset = 0;
		
	// ?? on the rdieResult = 0 stuff??	
		Fivestart.rdie1Result = 0;
		Fivestart.rdie2Result = 0;
		Fivestart.rdie3Result = 0;
		Fivestart.rdie4Result = 0;
		Fivestart.rdie5Result = 0;
		
		Fivestart.player1Complete = 0;
		Fivestart.player2Complete = 0;
		Fivestart.player3Complete = 0;
		Fivestart.player4Complete = 0;				
		Fivestart.currentPlayerColor = Fivestart.player2Color;
		Fivestart.currentPlayerNumber = 1;
		Fivestart.numberOfDiceToRoll = 5;
		Fivestart.numberOfPlayers = 1;
		
		Fivestart.heaterDieReserved = 0;
		Fivestart.previousHeaterDieReserved = 0;
		
		
		Fivestart.currentHeaterScore = 0;
		Fivestart.currentHeaterTotal = 0;
		
		Fivestart.rollDie.setEnabled(false);		
		Fivestart.rollDie.removeMouseListener(Fivestart.rollDie.getMouseListeners()[1]);
		 
		
		Fivestart.takeScore.setEnabled(false);
		Fivestart.keepDie.setEnabled(false);
		Fivestart.currentPlayerScore.setText("Heater Score");
		 	
		Fivestart.getSelectedDie = null;
		
		Fivestart.resetTheDieNew.ResetDiceNowNewGame();
		
		
		
	}

	
	
	
}
