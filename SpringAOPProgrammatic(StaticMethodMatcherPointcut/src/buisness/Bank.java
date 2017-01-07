package buisness;

public class Bank {
private int amount=1000;
private String accno="sbi123";
	public int deposit(String accno, int amount) 
	{
		if(accno.equals(this.accno))
		{
			this.amount+=amount;
			return amount;
		}
		else
		{
			throw new AccnoNotFoundException();
		}
	}
}
