package com.study.patterns.structural.proxy;

public class Client {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "test2");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
	
}
