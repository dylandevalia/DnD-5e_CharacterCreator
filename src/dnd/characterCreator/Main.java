package dnd.characterCreator;

import dnd.characterCreator.utility.Dice;
import dnd.characterCreator.utility.Utility;

public class Main
{
	
	//dnd.characterCreator.utility utility = new dnd.characterCreator.utility();
	
    public static void main(String[] args)
    {
	    Dice d6 = new Dice(6);
	    Dice d42 = new Dice(42);
	    
	    Utility.setLevel(5);
	    int level = Utility.getLevel();
	    
	    print(level);
	    
//	    for (int i = 0; i < 100; i++)
//	    {
//		    System.out.print(d6.sumBestOf(4, 3) + " ");
//	    }
    }
    
    public static void print(int print)
    {
	    System.out.println(print);
    }
	
}
