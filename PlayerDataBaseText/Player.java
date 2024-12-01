public class Player {
    private int age,number;
    private double height,salary;
    private	String name,country,club,pos;
    Player(String name, String country, int age, double height, String club, String pos, int number, double salary )
    {
        this.name = name;
        this.country = country;
        this.age = age;
        this.height = height;
        this.club = club;
        this.pos = pos;
        this.number = number;
        this.salary = salary;
    }
	
    public String getName()
	{
		return name;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public String getClub()
	{
		return club;
	}
	
	public String getPos()
	{
		return pos;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void showInfo()
    {
        System.out.println("Name          : "+name);
        System.out.println("Country Name  : "+country);
        System.out.println("Age           : "+age);
        System.out.println("Height        : "+height);
        System.out.println("Club Name     : "+club);
        System.out.println("Position      : "+pos);
        System.out.println("Number        : "+number);
        System.out.println("Weekly Salary : "+salary);
        System.out.println("");
    }
}
