import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;


public class Main
{
	public static File file = new File("players.txt");
	public static ArrayList<Player> players = new ArrayList<>();
	public static void main(String[] args) throws Exception  {
       
       
		int choice;
		String line;
		UserInput a= new UserInput();
		Menu m = new Menu();
       
		Scanner val = new Scanner(file);
		while(val.hasNext())
		{
			line = val.nextLine();
			String[] s= new String[8];
			s= line.split(",");
			Player p = new Player( s[0],s[1],Integer.parseInt(s[2]),Double.parseDouble(s[3]),s[4],s[5],Integer.parseInt(s[6]),Double.parseDouble(s[7]));
			players.add(p);
      
		}
           
       
		System.out.println(" Main Menu :" );
		System.out.println("(1) Search Players");
		System.out.println("(2) Search Clubs");
		System.out.println("(3) Add Player");
		System.out.println("(4) Exit System");
		System.out.print("Enter any number between 1 and 4: ");
		val = new Scanner(System.in);
		
		choice = a.UserIntInput(val);
		m.main_menu(choice,players,file);
        
        
		}	
       
       
}
