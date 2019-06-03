/** DiceModel makes a random number selection.*/
public class DiceModel 
{
	public int throwDice() 
   { int value = (int) (Math.random() * 7);//Chooses a random integer number between 1-6
        if (value == 0) 
        { value = 1; }
        return value;
	}
		
}
