//: Object/dice/VerifyValidRole.java
package com.dice;

public class VerifyValidRoll implements Runnable {
	ManageThrowThreads q;
	
	public VerifyValidRoll(ManageThrowThreads q) {
		this.q = q;
		new Thread(this, "VerifyValidRoll").start();
		}
	public void run() {
	q.gettys();
	}
	}