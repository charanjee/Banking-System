package atmpro;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperation{
	ATM a = new ATM();
    Map<Double,String> mini = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is : "+a.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount<=a.getBalance()) {
			mini.put(withdrawAmount ," amount withdrawn ");
		System.out.println(" collect the cash "+withdrawAmount);
		a.setBalance(a.getBalance()-withdrawAmount);
		viewBalance();
		}
		else {
			System.out.println("Insufficient Balance !!");
			System.out.println("Your available balance is : "+a.getBalance());
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		mini.put(depositAmount," amount deposited" );
		System.out.println(depositAmount+" Deposited Successfully !!");
		a.setBalance(a.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double,String> m:mini.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
