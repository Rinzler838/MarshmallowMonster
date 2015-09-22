package marshmallows2;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterInfo(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster info is: " + info);
		JOptionPane.showMessageDialog(null, "My best friend is a monster, his name is: ");
		JOptionPane.showMessageDialog(null, "He's got some characteristics, here they are: ");
	}
}
