import java.util.Scanner;


public class UserInput
{	
	static double UserDoubleInput( Scanner val)
	{
		while(!val.hasNextDouble())
		{
			System.out.print("The value you entered is not a double. Please enter an double value :");
			val.nextLine();
		}	
		return val.nextDouble();
	}
	static int UserIntInput( Scanner val)
	{
		while(!val.hasNextInt())
		{
			System.out.print("The value you entered is not an integer. Please enter an integer :");
			val.nextLine();
		}	
		return val.nextInt();
	}
}