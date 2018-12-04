package pkg1;

public class FixedDeposit implements Account
{
	public static Account getAccountObj() 
	{
		Account fd1 = new FixedDeposit();
		return fd1;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 256;
	}
}
