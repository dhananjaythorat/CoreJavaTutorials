package com.study.concurrent.one;

public class BankAccount {
	private int balance;
//	Object key = new Object();
	
	public BankAccount(int startBalance) {
		balance = startBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
//		synchronized(key) {
			balance += amount;
//		}
	}
	
	public void withdrawal(int amount) {
//		synchronized(key) {
			balance -= amount;
//		}
	}
}