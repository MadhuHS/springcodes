package pkg1;

public class Customer {

	public static void main(String[] args)
	{
       Account ref1 = Admin.createAccount('F');
       double bal = ref1.getBalance();
       System.out.println(bal);
	}

}
