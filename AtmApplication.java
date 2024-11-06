package com.anudip.adv;

public class AtmApplication {
	
		public static void main(String[] args) {
      Transactions transaction=new Transactions(12321,30000);
		Thread t=new Thread() {
              public void run() {

				transaction.withdraw(50000);
			}
		};
		t.start();
		
		Thread t1=new Thread() {
            public void run() {

				transaction.deposit(40000);
			}
		};
		t1.start();
		
      
	}

}
