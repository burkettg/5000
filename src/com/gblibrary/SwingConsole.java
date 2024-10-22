package com.gblibrary;


//Tool for running Swing demos from the
//console, both applets and JFrames.

import java.awt.Container;

import javax.swing.*;

public class SwingConsole {
	public static void run(final JFrame f, final int width, final int height) {
	SwingUtilities.invokeLater(new Runnable() {
	public void run() {
	f.setTitle(f.getClass().getSimpleName());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(width, height);
	f.getContentPane();
	f.setVisible(true);
	}
   });
  }
} ///:~

