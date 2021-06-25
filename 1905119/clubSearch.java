import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class clubSearch
{
	static void maxSal(String cn,ArrayList<Player> players)
    {
          
        int cnt=0;
        double max = 0;
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub()	))
            {
                if ( p.getSalary() > max)
                {
                    max = p.getSalary();
                }
            }
        }
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub() ))
            {
                if ( p.getSalary() == max)
                {
                    cnt++;
                    System.out.println(cnt+ ") ");
                    p.showInfo();
                }
            }
        }
        if(cnt==0)
        {
            System.out.println("No such club with this name");
        }
    }
    
    static void maxAge(String cn,ArrayList<Player> players)
    {
        
        int cnt=0;
        int max = 0;
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub() ))
            {
                if ( p.getAge() > max)
                {
                    max = p.getAge() ;
                }
            }
        }
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub() ))
            {
                if ( p.getAge() == max)
                {
                    cnt++;
                    System.out.println(cnt+ ") ");
                    p.showInfo();
                }
            }
        }
        if(cnt==0)
        {
            System.out.println("No such club with this name");
        }
    }
    
    static void maxHeight(String cn,ArrayList<Player> players)
    {
        
        int cnt=0;
        double max = 0;
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub() ))
            {
                if ( p.getHeight() > max)
                {
                    max = p.getHeight();
                }
            }
        }
        for(Player p :players)
        {
            if(cn.equalsIgnoreCase(p.getClub() ))
            {
                if ( p.getHeight() == max)
                {
                    cnt++;
                    System.out.println(cnt+ ") ");
                    p.showInfo();
                }
            }
        }
        if(cnt==0)
        {
            System.out.println("No such club with this name");
        }
    }
    
    static void totalYearlySalary(String cn,ArrayList<Player> players)
    {
        
        double Salary = 0;
        for(Player p: players)
        {
            if(cn.equalsIgnoreCase(p.getClub()))
            {
                Salary += p.getSalary()*365/7;
            }
        }
        if(Salary == 0)
            System.out.println("No such club with this name");
        else System.out.printf("Total Salary of this Club : %10f \n", Salary);
    }
    
    public static void searchClub(ArrayList<Player> players)
    {
        UserInput a = new UserInput();
		System.out.println(" Club Searching Options: " );
		System.out.println("(1) Player(s) with the maximum salary of a club");
        System.out.println("(2) Player(s) with the maximum age of a club");
        System.out.println("(3) Player(s) with the maximum height of a club");
        System.out.println("(4) Total Yearly Salary of a club");
        System.out.println("(5) Back to Main Menu");
        System.out.print("Enter any number between 1 and 5: ");
        Scanner val = new Scanner(System.in);
        int choice = a.UserIntInput(val);
        
        
        if(choice == 1)
        {
            System.out.print("Enter club name : "); 
			val = new Scanner(System.in);
			String cn= val.nextLine();
			maxSal(cn,players);
            searchClub(players);
        }
        if(choice == 2)
        {
            System.out.print("Enter club name : ");
			val = new Scanner(System.in);
			String cn= val.nextLine();
			maxAge(cn,players);
            searchClub(players);
        }
        if(choice == 3)
        {
            System.out.print("Enter club name : ");
			val = new Scanner(System.in);
			String cn= val.nextLine();
			maxHeight(cn,players);
            searchClub(players);
        }
        if(choice == 4)
        {
            System.out.print("Enter club name : ");
			val = new Scanner(System.in);
			String cn= val.nextLine();
			totalYearlySalary(cn,players);
            searchClub(players);
        }
        if(choice >5 || choice <1)
        {   
            System.out.println("Number not between 1 and 5. Try again");
            searchClub(players);
        }
    }
}