package marshmallows.controller;

import marshmallows.MarshmallowMonster;
import marshmallows2.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster rinzlerMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3.0;
		double hair = 1.0;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Gortoel";
		
		myOutput = new MarshmallowOutput();
		rinzlerMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(rinzlerMonster.toString());
	}

}