import java.util.Scanner;
import java.util.ArrayList;



public class playerAdd
{
	static void addPlayer(ArrayList<Player> players)
    {
        
		
		
		UserInput a = new UserInput();
		String[] pstn = {"Goalkeeper","Midfielder","Forward", "Defender"};
        Scanner val = new Scanner(System.in);
        System.out.print("Name          : ");
		String name;
		while(true)
		{
			boolean nameExist = false;
			name = val.nextLine();
			for(Player p: players)
			{
				
				if(name.equalsIgnoreCase(p.getName() ))
				{
					nameExist = true;
					break;
				}
			}
			if(nameExist == true) System.out.print("A player of the same name already exists. Enter another name: ");
			else break;
		}
        
        System.out.print("Country Name  : ");
        String country = val.nextLine();
		
		val = new Scanner(System.in);
        System.out.print("Age           : ");
        int age = a.UserIntInput(val);
		
		val = new Scanner(System.in);
        System.out.print("Height        : ");
        double height = a.UserDoubleInput(val);
		
		
		
		val = new Scanner(System.in);
        System.out.print("Club Name     : ");
		String club;
		while(true)
		{
			int cnt =0;
			club = val.nextLine();
			for(Player p: players)
			{
				if(p.getClub().equalsIgnoreCase(club))
				{
					cnt++;
				}
			}
			if(cnt==7) System.out.print("No more player can be added in the club. Please enter again : ");
			else break;
        }
		
        System.out.print("Position      : ");
		String pos;
		while(true)
		{
			boolean flag = false;
			pos = val.nextLine();
			for(String p: pstn){
				if(p.equalsIgnoreCase(pos))
				{
					flag = true;
					break;
				}
			}
			if( flag == true) break;
			else 
			{
				System.out.print("Sorry the position you entered is not valid. Please enter again : ");
			}
		}
        
        System.out.print("Number        : ");
		
		val = new Scanner(System.in);
		int num;
		while(true)
		{
			boolean numberExist = false;
			num = a.UserIntInput(val);
			for(Player p: players)
			{
            if(p.getClub().equalsIgnoreCase(club))
				{
					if(num == p.getNumber() )
					{
						numberExist = true;
						break;
					}
				}
			}
			if(numberExist == true) System.out.print("A player of the same number already exists in this club .Enter another number :");
			else break;
        }
        
        System.out.print("Weekly Salary : ");
		val = new Scanner(System.in);
        double sal = a.UserDoubleInput(val);
        Player player = new Player( name, country, age, height,club,pos, num,sal );
        
        
        
        
        players.add(player);
    }
}
