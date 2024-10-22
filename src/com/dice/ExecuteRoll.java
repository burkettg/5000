//: Object/dice/ExecuteRoll.java
package com.dice;


public class ExecuteRoll implements Runnable {
	ManageThrowThreads q;
	public ExecuteRoll(ManageThrowThreads q) {
	this.q = q;
	new Thread(this, "ExecuteRoll").start();
	}
	public void run() {
	q.doRollNow();
	}
}

