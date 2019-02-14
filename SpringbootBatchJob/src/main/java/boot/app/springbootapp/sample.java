package boot.app.springbootapp;

import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r  = new Runnable() {			
			public void run() {
				System.out.println("CHild thread");
				
			}
		}; 
		Thread t  = new Thread(r);
		t.start();
		System.out.println("Main thread");
		String s = "this is from lambda";

	}

}
