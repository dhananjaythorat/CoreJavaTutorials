package com.study.concurrent.one;

public class TxWorker implements Runnable {
	protected BankAccount account;
	protected char txType; // ‘w’ -> withdrawal, ‘d’ -> deposit
	protected int amt;

	public TxWorker(BankAccount account, char txType, int amt) {
		this.account = account;
		this.txType = txType;
		this.amt = amt;
	}

	public void run() {
		if (txType == 'w') {
			synchronized(account) {
				account.withdrawal(amt);
			}
		}else if (txType == 'd') {
			synchronized(account) {
				account.deposit(amt);
			}
		}
	}
}