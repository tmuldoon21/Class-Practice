
public class ClassPracticeMain 
{

	public static void main(String[] args) 
	{
		ClassPractice summer = new ClassPractice("Dog", 'f', "Woof", 4, 3);
		System.out.println(summer.talk());
		ClassPractice simba = new ClassPractice();
		System.out.println(simba.talk());
		System.out.println(simba.getAge());
		simba.birthday();
		System.out.print(simba.getAge());
				
	}

}
