import java.util.Scanner;

class InsufficientBalanceException extends Exception 
{
    InsufficientBalanceException(String message) 
	{
        super(message);
    }
}

public class extra1  
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
		
		double balance;

        System.out.print("Enter your initial account balance: ");
        balance = s.nextDouble();

        System.out.print("Enter the amount to withdraw: ");
        double amount = s.nextDouble();

        try 
		{
			if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance in your account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
            
        } 
		catch (InsufficientBalanceException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
    }
}
