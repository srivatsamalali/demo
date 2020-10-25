interface DebitCard {
	int cardNo = 123456789;
	// public void withdraw();
	// public abstract void withdraw();
	public abstract void withdraw();
    //  error: interface abstract methods cannot have body
        // public void test(){
        // }
}
interface CreditCard {
	// public void withdraw();
	// public abstract void withdraw();
	void pay();
}

//create NetBanking interface with the methods
// openFixedDeposit();
//  test();
interface NetBanking {
public void openFixedDeposit();
//public void test();
}

//Implement NetBanking
class BankAccount implements DebitCard, NetBanking{
   @Override
	public void withdraw() {
		System.out.println("Withdraw from ATM");
	}

	@Override
	public void openFixedDeposit() {
		System.out.println("Open fixed deposit!");

	}
	// @Override
	// public void test() {
	// 	// TODO Auto-generated method stub	
	// }
		public void closeAccount() {
		System.out.println("Close Account");

	}
}

public class InterfaceExample {
	public static void main(String[] args) {
//		 DebitCard hdfcCard = new DeibitCard();
//		DebitCard hdfcCard = null;
//		hdfcCard = new BankAccount();
//		hdfcCard.withdraw();
//		hdfcCard.openFixedDeposit();
		
		NetBanking netBanking = null;
		netBanking = new BankAccount();
		//netBanking.withdraw();
		netBanking.openFixedDeposit();
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.withdraw();
		bankAccount.openFixedDeposit();
		bankAccount.closeAccount();
		
		System.out.println(NetBanking.cardNo);
		System.out.println(bankAccount.cardNo);
		System.out.println(DebitCard.cardNo);

		//use DebitCard to withdraw from the Bank.
	}
}
