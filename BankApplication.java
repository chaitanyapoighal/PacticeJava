package com.anudip.adv;

public class BankApplication {
	Integer accountBalance;
	int sumAmount=0;
	
	void withdraw(int amt) throws InsufficientFundException {
		
		if(accountBalance<=1000)
			throw new InsufficientFundException("Insufficient Balance ");
		
		else if(accountBalance<=amt)
			
			throw new InsufficientFundException("Insufficient Balance ");
		
		else 
		{
			accountBalance-=amt;
			System.out.println(amt+" Amount withdrawn successfully");
		}
		
	}

	void checkBalance() {
		
		System.out.println(" Account Balance="+accountBalance);
		
	}
	
	void deposit(int amt) {
		accountBalance+=amt;
		System.out.println(amt+" Amount deposited successfully");
		
	}
	public static void main(String[] args) {
      BankApplication app=new BankApplication();
       app.accountBalance=20000;
       app.checkBalance();
       app.deposit(1000);
       
       try {
       app.withdraw(20000);
       app.withdraw(1000);
       }catch(InsufficientFundException e) {
    	   System.out.println(e);
       }
      
		finally {
			System.out.println(" Account Balance="+app.accountBalance);
		}
		
	}

}
