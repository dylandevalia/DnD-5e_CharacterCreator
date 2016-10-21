package dnd.characterCreator.utility;

import java.util.Random;

public class Dice
{
	/**
	 * Number of sides the dice has
	 */
	private int noSides;
	
	/**
	 * Constructor
	 *
	 * @param noSides Number of sides of the dice
	 */
	public Dice(int noSides)
	{
		this.noSides = noSides;
	}
	
	/**
	 * Rolls a random number from 1 to noSides
	 *
	 * @return Random die roll
	 */
	public int roll()
	{
		Random rand = new Random();
		
		int randNum = rand.nextInt(noSides) + 1;
		return randNum;
	}
	
	/**
	 * Sums the biggest usedDice rolls from totalRolls of dice
	 *
	 * @param totalRolls Total number of dice rolled
	 * @param usedDice   Number of dice used for the sum
	 * @return The sum of the biggest rolls
	 */
	public int sumBestOf(int totalRolls, int usedDice)
	{
		/* Throws exception if usedDice is greater than totalRolls */
		if (usedDice > totalRolls)
		{
			throw new IllegalArgumentException("usedDice cannot be greater than totalRolls");
		}
		
		int[] rolls = new int[totalRolls];
		
		/* Rolls the dice */
		for (int i = 0; i < totalRolls; i++)
		{
			rolls[i] = roll();
		}
		
		int sum = 0;
		int highestIndex;
		int tmp;
		
		/* Sums the highest numbers */
		for (int i = 0; i < usedDice; i++)
		{
			tmp = 0; // Temporary max value holder
			highestIndex = 0; // Index of the highest value
			
			/* Step through rolls[] and gets highest value's index */
			for (int j = 0; j < rolls.length; j++)
			{
				if (rolls[j] > tmp)
				{
					tmp = rolls[j];
					highestIndex = j;
				}
			}
			sum += rolls[highestIndex]; // Sum of the highest numbers
			rolls[highestIndex] = 0; // Sets used highest value to 0
		}
		
		return sum;
	}
}
