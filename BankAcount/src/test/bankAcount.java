package test;

class BankAcount
{
	public void deposit()
	{
		System.out.println("Rs10000/ is deposited");
	}
	public void credit()
	{
		System.out.println("Rs50000/ is credited");
	}
	public static void main(String[] args)
	{
		BankAcount ba=new BankAcount();
		ba.deposit();
		ba.credit();
	}

}
