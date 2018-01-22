package org.gittest.classes;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass {
	public static void main(String[] args) {
		MainClass mainC = new MainClass();
		mainC.methodRamesh();
		mainC.methodOfElse();
	}
	
	public void methodRamesh(){
		System.out.println("Method created by User1");
	}
	public void methodOfElse(){
		String user = null ;
		try {
			user = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("Method created by:"+user);
	}
	public void rakaranMethod(){
		String user = null ;
		try {
			user = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("Method created by: RAKARAN");
	}
}
