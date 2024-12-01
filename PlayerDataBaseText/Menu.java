import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class Menu
{
	static void main_menu(int choice,ArrayList<Player> players, File file) throws Exception
    {
        UserInput a= new UserInput();
		playerSearch ps= new playerSearch();
		clubSearch cs= new clubSearch();
		playerAdd add= new playerAdd();
		playerSave save = new playerSave();
		if(choice == 4)
        {
           
            save.savePlayer(players,file);
           
            System.exit(1);
        }
        if(choice != 4)
        {
            if(choice >4 || choice <1)
                System.out.println("Number not between 1 and 4. Try again");
            if(choice == 1)
               ps.Search(players);
            if(choice == 2)
                cs.searchClub(players);
            if(choice == 3)
                add.addPlayer(players);
			System.out.println(" Main Menu :" );
            System.out.println("(1) Search Players");
            System.out.println("(2) Search Clubs");
            System.out.println("(3) Add Player");
            System.out.println("(4) Exit System");
            System.out.print("Enter any number between 1 and 4: ");
            Scanner val = new Scanner(System.in);
            choice = a.UserIntInput(val);
            main_menu(choice,players,file);
            
        }
    }
}