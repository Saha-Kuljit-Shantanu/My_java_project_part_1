import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class playerSave	
{
	static void savePlayer(ArrayList<Player> players,File file) throws Exception
    {
        FileWriter f = new FileWriter(file,false);
        for(Player p: players)
        {
            f.write(p.getName()+","+p.getCountry()+","+p.getAge()+","+p.getHeight()+","+p.getClub()+","+p.getPos()+","+p.getNumber()+","+p.getSalary()+"\n");
        }
        f.close();
    }
}