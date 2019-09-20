package assessment;
import java.util.*;
public class Music {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int battLevel = sc.nextInt();
	int noOfSongs = sc.nextInt();
	int cnt=0;
	if(battLevel>30)
	{
	System.out.println("Music On"+"\n"+"Playing Song "+ ++cnt);
	while(noOfSongs != 0)
	{
			System.out.println("Do you want to play again? : Yes/No");
			String choice = sc.next();
			switch (choice) 
			{
			case "yes":System.out.println("Invalid input string!!Enter Yes/No correctly");
			break;
			case "NO":	
			case "No":System.out.println("Do you want to continue with next song?:Yes/No");
			String ch2=sc.next();
			    switch(ch2)
				{
				case "Yes":System.out.println("Playing Song "+ ++cnt);
				if(cnt==noOfSongs)
				{
				System.out.println("Music Player Stopped");
				cnt=0;
				break;
				}
				break;
				case "No":
				case "NO":System.out.println("Do you want to Stop Music?");
				break;
				}
				break;
				case "Yes":System.out.println("Playing Song 1");
			
				break;
				default:
				break;
				}
	}
	}
	else {
	System.out.println("Low Battery!!!!"+"\n"+"Music Player Stopped!!!");

	}
	sc.close();
	}
	}

