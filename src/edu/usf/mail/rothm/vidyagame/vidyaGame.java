package edu.usf.mail.rothm.vidyagame;

/***********************************
 * Mitch and Chad bring you.....
 * 
 * THE BEST VIDYA GAME EVER . JAVA
 ************************************/

import java.util.Scanner;

import edu.usf.mail.rothm.vidyagame.entities.Player;

public class vidyaGame
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		Player player = new Player();

		int Str = 0;
		int Int = 0;
		int Lck = 0;
		int statPoints = 10;

		System.out.println("***************************************");
		System.out.println("          THE BEST VIDYA GAME          ");
		System.out.println("                 EVER                  ");
		System.out.println("***************************************");
		System.out.println();
		System.out.print("Enter your name: ");
		player.setName(scan.nextLine());
		System.out.println();
		System.out.print("Welcome to the world of Carrmuck " + player.getName() +"."
						+ " The land has been ravaged by the hundred beard war, and he who has the most magnificent beard rules. " 
						+ "You are but a lowly courier on a simple errand to deliver a parcel to"
						+ " General Ideeya. This is were your story begins...");
		System.out.println();
		System.out.println();

		System.out.println("You have 10 stat points to place in Strength, Intellect and Luck.  Please place your points now: ");

		System.out.println();
			
		while (true)
		{
			Str = 0;
			Int = 0;
			Lck = 0;
			statPoints = 10;
			
			System.out.println("Stat points remaining: " + statPoints);

			System.out.print("Strength: ");
			Str = scan.nextInt();
			if (Str > statPoints)
			{
				System.out
						.println("You don't have that many stat points, please enter a valid value.");
				System.out.print("Strength: ");
				Str = scan.nextInt();
			}

			statPoints -= Str;
			System.out.println("You have " + statPoints + " stat points remaning.");

			System.out.print("Intellect: ");
			Int = scan.nextInt();
			if (Int > statPoints)
			{
				System.out
						.println("You don't have that many stat points, please enter a valid value.");
				System.out.print("Intellect: ");
				Int = scan.nextInt();
			}

			statPoints -= Int;
			System.out.println("You have " + statPoints + " stat points remaning.");

			System.out.print("Luck: ");
			Lck = scan.nextInt();
			if (Lck > statPoints)
			{
				System.out
						.println("You don't have that many stat points, please enter a valid valud.");
				System.out.print("Luck: ");
				Lck = scan.nextInt();
			}

			System.out.println("Your stats are: Strength = " + Str
					+ ", Intellect = " + Int + " and Luck = " + Lck + ".");
			
			System.out.println();
			
			System.out.print("Are you okay with these stats? (Yes or no): ");
			scan.nextLine();
			if (scan.nextLine().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		
		System.out.println();
		System.out.println("continue...");
	}

}
