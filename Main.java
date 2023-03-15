package atmpro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMOperation op=new ATMOperationImpl();
		int atmnumber = 2383093;
		int atmpin = 1983;
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO MY ATM !!! ");
		System.out.println("Enter the Atm Number : ");
		int atmNumber = sc.nextInt();
		System.out.println("Ente the ATM PIN : ");
		int atmPin = sc.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==atmPin)) {
		while(true) {
			System.out.println("1.view available balance\n2.Withdraw Amount\n3.Deposit Amount\n4.view Ministatement\n5.Exit");
			System.out.println("Enter Choice : ");
			int ch=sc.nextInt();
			if(ch==1) {
				op.viewBalance();
			}
			else if(ch==2) {
				System.out.println("Enter Amount to withdraw ");
				double withdrawAmount=sc.nextDouble();
				op.withdrawAmount(withdrawAmount);
			}
			else if(ch==3) {
				System.out.println("Enter Amount to Deposit :");
				double depositAmount=sc.nextDouble();		
				op.depositAmount(depositAmount);
				}
			else if(ch==4) {
				op.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect your ATM Card\n Thank you for choosing My ATM");
				System.exit(0);
			}
			else {
				System.out.println("please enter correct choice");
			}
			}
		}
		else {
			System.out.println("Invalid Atm Number or Pin");
			System.exit(0);
		}
	}
}
