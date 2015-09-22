package marshmallows;

public class MarshmallowMonster
{
	
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this. monsterBellyButton = monsterBellyButton;
		
	}
	
	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getmonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getmonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getmonsterHair()
	{
		return monsterHair;
	}
	
	public double getmonsterLegs()
	{
		return monsterLegs;
	}
	public boolean getmonsterBellyButton()
	{
		 return monsterBellyButton;
	}
	
	// ^Getters
	
	public void setmonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setmonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setmonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setmonsterLegs(double monsterLegs)
	{
		 this.monsterLegs = monsterLegs;
	}
	
	public void setmonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	// ^Setters
	
	public String toString()
	{
		String monster = "This monster's name is " + monsterName + " , it has " + monsterEyes + " eyes, " + monsterNoses + " noses, " + monsterHair + " hairs, " + monsterLegs + " legs, and the belly button is " + monsterBellyButton;
	
		return monster;
	}
}
