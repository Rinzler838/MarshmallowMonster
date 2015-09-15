package marshmallows.controller;

import marshmallows.MarshmallowMonster;
import marshmallows2.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster rinzlerMonster;
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
	{
		myOutput.displayMonsterInfo(rinzlerMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info: " + rinzlerMonster.toString());
	}

	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		rinzlerMonster.setmonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		rinzlerMonster.setmonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		rinzlerMonster.setmonsterNoses(betterMonsterNoses);
		System.out.println("Type in a better number of hairs for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		rinzlerMonster.setmonsterHair(betterMonsterHair);
		System.out.println("Type a better number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		rinzlerMonster.setmonsterLegs(betterMonsterLegs);
		System.out.println("Type in a better boolean for the monster's belly button");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		rinzlerMonster.setmonsterBellyButton(betterMonsterBellyButton);
		
	}
	
	
}