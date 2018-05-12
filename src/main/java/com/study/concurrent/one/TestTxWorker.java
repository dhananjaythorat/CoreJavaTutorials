package com.study.concurrent.one;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public class TestTxWorker {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		TxWorker[] workers = new TxWorker[100];// Retrieve TxWorkerinstances
		BankAccount bac = new BankAccount(500);	
		int i = 1;
		for(TxWorker worker:workers) {
			
			if(i % 2 == 0) {
				worker = new TxWorker(bac,'w',50);
			}else {
				worker = new TxWorker(bac,'d',50);
			}
			es.submit(worker);
			i++;
		}
		 // This will make the executor accept no new threads and finish all existing threads in the queue
		es.shutdown();
        // Wait until all threads are finish
		es.awaitTermination(50,TimeUnit.MILLISECONDS);
		System.out.println("\n");
		System.out.println(bac.getBalance());
	}

}
