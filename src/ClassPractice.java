
public class ClassPractice 
{
	//fields or instance variable
	private String species;
	private char gender;
	private String sound;
	private int numLegs;
	private int age;
	
	//create a constructor -- no return type and same name as class
	public ClassPractice (String s, char g, String so, int legs, int a)
	{
		species = s;
		gender = g;
		sound = so;
		numLegs = legs;
		age = a;
		
	}
	
	public ClassPractice()
	{
		species = "Lion";
		gender = 'm';
		sound = "Frickin roar";
		numLegs = 4;
		age = 5;
	}
	
	//methods
	public String getSpecies()
	{
		return species;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public String talk()
	{
		return sound;
	}
	
	public int getNumLegs()
	{
		return numLegs;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void birthday()
	{
		age++;
	}

	
}
