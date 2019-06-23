package BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();
	user1.accountDeposit("savings", 60000.00);
	user1.accountDeposit("checking", 190000.00);
	user2.accountDeposit("checking", 150000.00);
	user3.accountDeposit("savings", 2090.48);
	user1.accountWithdrawal("savings", 60.00);
	user1.accountWithdrawal("checking", 1000000000.00);
	user2.accountWithdrawal("checking", 90.00);
	user3.accountWithdrawal("savings", 12.00);
	user1.myBalance();
	user2.myBalance();
	user3.myBalance();
	}
}
