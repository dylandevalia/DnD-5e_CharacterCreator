package dnd.characterCreator;

import dnd.characterCreator.character.classes.Wizard;
import dnd.characterCreator.utility.Dice;

public class Main {
	
	public static void main(String[] args) {
		Dice d6 = new Dice(6);
		Dice d42 = new Dice(42);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(d6.sumBestOf(4, 3) + " ");
		}
		System.out.println();
		
		//		Spell spell = new Spell(
		//				"Spell",
		//				1,
		//				SchoolTypes.ILLUSION,
		//				"1 action",
		//				false,
		//				false,
		//				false,
		//				true,
		//				24,
		//				false,
		//				"does stuff"
		//		);
		//
		//		System.out.println(spell.getRange() + " " + spell.isTouch() + " " + spell.isSelf());
		//
		//		Spell aspell = new Spell(
		//				"Spell",
		//				1,
		//				SchoolTypes.ILLUSION,
		//				"1 action",
		//				true,
		//				false,
		//				false,
		//				true,
		//				24,
		//				false,
		//				"does stuff"
		//		);
		//
		//		System.out.println(aspell.getRange() + " " + aspell.isTouch() + " " + aspell.isSelf());
		
		for (int i = 0; i < Wizard.cantrip.length; i++) {
			System.out.println(Wizard.cantrip[i].getName());
		}
		
	}
}
