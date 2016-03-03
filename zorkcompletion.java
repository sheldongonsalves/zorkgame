import java.util.Scanner;
import java.util.Random;
public class zorkcompletion {

static Scanner darkly = new Scanner(System.in);
	
	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
	}
	
	public static void room1()
	{
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room2();
		}
		else if(choice.equals("s"))
		{
			System.out.println("You have chosen to exit");
			ghost();
			System.exit(0);
		}
		} while (1==1);
	}
	
	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a phone";
		String direct = " to the east (e), the south (s) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room1();
			} else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
		} while (1==1);
	}
	public static void room3()
	{
		String place = "library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the east (e) or the south (n)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("n")) 
			{
				room5();
			} else if (choice.equals("e")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room4()
	{
		String place = "the kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		String direct = "  the north (n) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("n")) 
			{
				room7();
			} 
			else if (choice.equals("w")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room5()
	{
		String place = "the dining Room";
		String[] things = new String[2];
		things[0] = "dust";
		things[1] = "boxes";
		String direct = " to the south (s) ";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room1();
			}
		} while (1==1);
	}
	public static void room6()
	{
		
		Random rnd =new Random();
		Scanner sc = new Scanner(System.in);
		int random =3;
		int guess;
		String place = "vault";
		String[] things = new String[1];
		System.out.println("Guess a number from 1 to 4 to find treasure!!!");
		//random = rnd.nextInt(4);
		
		guess = sc.nextInt();
		if(guess == random)
		{
			room8();
		}
		things[0] = "3 walking skeletons";
		String direct = " to the east (e)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("e")) 
			{
				room7();
			} 
		} while (1==1);
	}
	public static void room7()
	{
		String place = "parlor";
		String[] things = new String[1];
		things[0] = "treasure chest";
		String direct = " the south (s) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room4();
			}  else if (choice.equals("w")) 
			{
				room6();
			}
		} while (1==1);
	}
	public static void room8()
	{
		String place = "the secret";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = " to the east (e)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("e")) 
			{
				room7();
			} 
		} while (1==1);
	}
	public static void ghost()
	{
		Random rnd = new Random();
		int rand = rnd.nextInt(4);
		if(rand == 5)
			System.out.println("You are being followed: "+rand);
		else
			System.out.println("You are Safe!!");
		
		
	}
	public static void main(String[] args) {
		room1();
		
	}
}
