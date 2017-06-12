package dnd.characterCreator.utility;

import dnd.characterCreator.character.classes.IClass;
import dnd.characterCreator.character.classes.Wizard;
import dnd.characterCreator.character.races.Human;
import dnd.characterCreator.character.races.IRace;

public class Utility {
	private static int level = 0;
	
	public static int getLevel() {
		return level;
	}
	
	public static void setLevel(int level) {
		Utility.level = level;
	}
	
	public static IRace randomRace() {
		switch ((int) (Math.random() * 9)) {
			case 0:
				return new Human();
			//				return new Dragonborn();
			case 1:
				return new Human();
			//				return new Dwarf();
			case 2:
				return new Human();
			//				return new Elf();
			case 3:
				return new Human();
			//				return new Gnome();
			case 4:
				return new Human();
			//				return new HalfElf();
			case 5:
				return new Human();
			//				return new Halfling();
			case 6:
				return new Human();
			//				return new HalfOrc();
			case 7:
				return new Human();
			//				return new Human();
			case 8:
				return new Human();
			//				return new Tiefling();
			default:
				return null;
		}
	}
	
	public static IClass randomClass() {
		switch ((int) (Math.random() * 11)) {
			case 0:
				return new Wizard();
			//				return new Barbarian();
			case 1:
				return new Wizard();
			//				return new Bard();
			case 2:
				return new Wizard();
			//				return new Cleric();
			case 3:
				return new Wizard();
			//				return new Druid();
			case 4:
				return new Wizard();
			//				return new Fighter();
			case 5:
				return new Wizard();
			//				return new Monk();
			case 6:
				return new Wizard();
			//				return new Paladin();
			case 7:
				return new Wizard();
			//				return new Rogue();
			case 8:
				return new Wizard();
			//				return new Sorcerer();
			case 9:
				return new Wizard();
			//				return new Warlock();
			case 10:
				return new Wizard();
			//				return new Wizard();
			default:
				return null;
		}
	}
}
