import java.util.Scanner;

class getter
{
	public static void main (String [] p)
	{
		Station s1 = defineStation("Mile end", 2, false);
		Station s2 = defineStation("stepney green", 2, true);
		askq(Station s);
		
	}
	
	
	public static void askq(Station s)
	{
		String ask;
		ask =  input("what is the station name?");
		if(ask == s1.name)
		{
			print(s1.name + s1.zone + s1.access);
		}
		else if(ask == s2.name)
		{
			print(s2.name + s2.zone);
		}
	}

	public static Station defineStation(String name, int zone, boolean access)
	{
		Station s1 = new Station();
		s1.name = name;
		s1.zone = zone;
		s1.access = access;
		return s1;
	}
	public static void print(String message)
	{
		System.out.println(message);
		return;
	}
	public static String input (String message)
	{
		String result;
		Scanner scanner= new Scanner (System.in);
		print(message);
		result = scanner.nextLine();
		return result;
	}
}

class Station
{
	String name;
	int zone;
	boolean access;
}