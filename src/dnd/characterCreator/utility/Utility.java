package dnd.characterCreator.utility;

import dnd.characterCreator.character.classes.Classes;
import dnd.characterCreator.character.races.Races;

public class Utility {
	private static int level = 0;
	
	public static int getLevel() {
		return level;
	}
	
	public static void setLevel(int level) {
		Utility.level = level;
	}
	
	public static Races randomRace() {
		switch ((int) (Math.random() * 9)) {
			case 0:
				return null;
			//				return new Dragonborn();
			case 1:
				return null;
			//				return new Dwarf();
			case 2:
				return null;
			//				return new Elf();
			case 3:
				return null;
			//				return new Gnome();
			case 4:
				return null;
			//				return new HalfElf();
			case 5:
				return null;
			//				return new Halfling();
			case 6:
				return null;
			//				return new HalfOrc();
			case 7:
				return null;
			//				return new Human();
			case 8:
				return null;
			//				return new Tiefling();
			default:
				return null;
		}
	}
	
	public static Classes randomClass() {
		switch ((int) (Math.random() * 11)) {
			case 0:
				return null;
			//				return new Barbarian();
			case 1:
				return null;
			//				return new Bard();
			case 2:
				return null;
			//				return new Cleric();
			case 3:
				return null;
			//				return new Druid();
			case 4:
				return null;
			//				return new Fighter();
			case 5:
				return null;
			//				return new Monk();
			case 6:
				return null;
			//				return new Paladin();
			case 7:
				return null;
			//				return new Rogue();
			case 8:
				return null;
			//				return new Sorcerer();
			case 9:
				return null;
			//				return new Warlock();
			case 10:
				return null;
			//				return new Wizard();
			default:
				return null;
		}
	}
}
