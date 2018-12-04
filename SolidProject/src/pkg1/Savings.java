package pkg1;

public class Savings implements Account {
	public static Account getAccountObj() {
		Account s1 = new Savings();
		return s1;
	}

	@Override
	public double getBalance() {
		return 100;
	}
}
