import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class playerSearch
{	
	static void ByName(String name,ArrayList<Player> players)
    {
        boolean NameExist = false;
        
        for(Player p : players)
        {
            if ( name.equalsIgnoreCase(p.getName() ) )
            {
                p.showInfo();
                NameExist = true;
            }
        }
        if(NameExist == false)
        {
            System.out.println("No such Player with this name");
        }
    }
    
    static void ByCountryandClub(String country,String club,ArrayList<Player> players)
    {
      
        int count=0;
        
        for(Player p : players)
        {
            if ( country.equalsIgnoreCase(p.getCountry() ) && (  club.equalsIgnoreCase("ANY") || club.equalsIgnoreCase(p.getClub() ) ) )
            {
                count++;
                System.out.println(count+ ")");
                p.showInfo();
                
            }
        }
        if(count == 0)
        {
            System.out.println("No such Player with this country and club");
        }
    }
    
    static void ByPosition(String pos,ArrayList<Player> players)
    {
      
        int count=0;
        
        
        for(Player p : players)
        {
            if ( pos.equalsIgnoreCase(p.getPos() ) )
            {
                count++;
                System.out.println(count+ ")");
                p.showInfo();
                
            }
        }
        if(count == 0)
        {
            System.out.println("No such Player with this position");
        }
    }
    
    static void BySalaryRange(double low, double high,ArrayList<Player> players)
    {
      
        int count=0;
        
        for(Player p : players)
        {
            if ( p.getSalary() >= low && p.getSalary() <= high )
            {
                count++;
                System.out.println(count+ ")");
                p.showInfo();
                
            }
        }
        if(count == 0)
        {
            System.out.println("No such Player with this weekly salary range");
        }
    }
    
    static void CountryWise(ArrayList<Player> players)
    {
        
        ArrayList<String> str = new ArrayList<>();
        
        str.add(players.get(0).getCountry() );
        int cnt=0;
        
        
        for(Player p : players)
        {
            boolean isRepeated=false;
            for (int i = 0; i <= cnt; i++) {
                if(str.get(i).equalsIgnoreCase(p.getCountry() ) )
                {
                    isRepeated = true;
                    break;
                }
            }
            if(isRepeated == false)
            {
                
                str.add(p.getCountry() );
                cnt++ ;
            }
        }
        int[] counts= new int[cnt+1];
        for(Player p : players)
        {
            for (int i = 0; i <= cnt; i++) {
                if(str.get(i).equalsIgnoreCase(p.getCountry() ) )
                {
                    
                    counts[i]++;
                }
            }
        }
        for (int i = 0; i <= cnt; i++) {
            System.out.println(str.get(i)+" : "+ counts[i]);
        }
    }
	public static void Search(ArrayList<Player> players)
    {
        UserInput a = new UserInput();
		System.out.println(" Player Searching Options: " );
		System.out.println("(1) By Player Name");
        System.out.println("(2) By Club and Country");
        System.out.println("(3) By Position");
        System.out.println("(4) By Salary Range");
        System.out.println("(5) Country-wise player count");
        System.out.println("(6) Back to Main Menu");
        System.out.print("Enter any number between 1 and 6: ");
        Scanner val = new Scanner(System.in);
        int choice = a.UserIntInput(val);
        if(choice == 1)
        {
            System.out.print("Enter the name you want to search : ");
			val = new Scanner(System.in);
			String name = val.nextLine();
			ByName(name,players);
            Search(players);
        }
        if(choice == 2)
        {
            System.out.print("Enter the country : ");
			val = new Scanner(System.in);
			String country = val.nextLine();
			System.out.print("Enter the club : ");
			val = new Scanner(System.in);
			String club = val.nextLine();
			ByCountryandClub(country, club,players);
            Search(players);
        }
        if(choice == 3)
        {
            System.out.print("Enter the position : ");
			val = new Scanner(System.in);
			String pos = val.nextLine();
		    ByPosition(pos,players);
            Search(players);
        }
        if(choice == 4)
        {
            System.out.print("Enter the lower limit : ");
			val = new Scanner(System.in);
			double low = a.UserDoubleInput(val);
			System.out.print("Enter the upper limit : ");
			val = new Scanner(System.in);
			double high = a.UserDoubleInput(val);
			if( high < low) System.out.println("Higher limit cannot be less than lower limit.");
			else BySalaryRange(low, high,players);
            Search(players);
        }
         if(choice == 5)
        {
            CountryWise(players);
            Search(players);
        }
        if(choice >6 || choice <1)
        {   
            System.out.println("Number not between 1 and 6. Try again");
            Search(players);
        }
        
        
    }
}