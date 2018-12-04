package pkg1;

public class Admin {

	public static Account createAccount(char type)
	{
		if(type == 'F')
		{
			Account a1 = FixedDeposit.getAccountObj();
			return a1;
		}
		else
		{
			Account a2 = Savings.getAccountObj();
			return a2;
		}
	}
}
