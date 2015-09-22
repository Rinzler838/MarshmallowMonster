package marshmallows.controller;

import marshmallows.MarshmallowMonster;
import marshmallows2.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster rinzlerMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3.0;
		double hair = 1.0;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Gortoel";
		
		monsterScanner = new Scanner (System.in);
		myOutput = new MarshmallowOutput();
		rinzlerMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{	//rinzlerMonster.toString();	(Used to be here)
		myOutput.displayMonsterInfo(rinzlerMonster.toString());	
		//askQuestions(); 				(Used to be here)
		myOutput.displayMonsterGUI("New Monster Info: " + rinzlerMonster.toString());
		this.makeUserMonster();
		myOutput.displayMonsterInfo("New Monster Info " + userMonster.toString());

	}

	private void askQuestions()

	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("Type in a different number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		
		System.out.println("Type in a better number of hairs for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("Type a better number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		
		System.out.println("Type in a better boolean for the monster's belly button");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		
		rinzlerMonster.setmonsterName(betterMonsterName);
		rinzlerMonster.setmonsterEyes(betterMonsterEyes);
		rinzlerMonster.setmonsterHair(betterMonsterHair);
		rinzlerMonster.setmonsterLegs(betterMonsterLegs);
		rinzlerMonster.setmonsterBellyButton(betterMonsterBellyButton);
	}
	
	/**
	 * This method will gather the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables.
		String userName;
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define the variables by using Scanner to get the users input.
		System.out.println("Type in your monster's name.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes your monster has.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses your monster has.");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("Type in the amount of hair your monste has.");
		userHair = monsterScanner.nextDouble();
		System.out.println("Type in the number of legs your monster has");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Type in whether your monster has a belly button (True), or not (False).");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor. Remember that the order of the parameters matters.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		
	}
	
}