package dnd.characterCreator;

import dnd.characterCreator.character.classes.Wizard;
import dnd.characterCreator.character.player.Player;
import dnd.characterCreator.character.races.Human;
import dnd.characterCreator.utility.Dice;

public class Main {
	private static Dice d6 = new Dice(6);
	private static Dice d42 = new Dice(42);
	private static Player player;
	
	public static void main(String[] args) {
		tmp();
		int tmp;
		int tmpMod;
		for (int i = 0; i < 20; i++) {
			tmp = d6.sumBestOf(4, 3);
			tmpMod = calcAbilityScoreModifier(tmp);
			
			System.out.printf("%1d   ", tmp);
			if (tmpMod >= 0) {
				System.out.print("+");
			}
			System.out.println(tmpMod);
		}
		System.out.println();
		
		player = new Player(new Human(), new Wizard());
		for (int i = 0; i < player.getPlayerClass().getCantrip().length; i++) {
			System.out.print(player.getPlayerClass().getCantrip()[i].getName());
			System.out.print(": ");
			System.out.println(player.getPlayerClass().getCantrip()[i].getDescription());
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(player.getAbilityScores()[i] + " ");
		}
		System.out.println();
	}
	
	private static int calcAbilityScoreModifier(int tmp) {
		int abilityScoreModifiers = -10;
		
		for (int i = 0; i < 6; i++) {
			//			Math.floorDiv(player.getAbilityScores()[i] - 10, 2);
			abilityScoreModifiers = Math.floorDiv(tmp - 10, 2);
		}
		
		return abilityScoreModifiers;
	}
	
	private static void tmp() {
		//		for (int i = 0; i < 25; i++) {
		//			System.out.print(i + ": ");
		//
		//			double a = 4 * Math.pow(i, 2) + 1;
		//			double b = Math.pow(i, 3);
		//
		//			System.out.print(a);
		//			System.out.print("  ");
		//			System.out.print(b);
		//
		//			if (a <= b) System.out.print("   xxx");
		//
		//			System.out.println();
		//		}
		
		//		System.out.println(map(127, 0, 255, 0, 1));
		//		System.out.println(map(244, 0, 255, 0, 1));
		//
		//		System.out.println(roundTo(1, 1.0 / 4));
		//		System.out.println(roundTo(0.4, 1.0 / 3));
		//		System.out.println(roundTo(0.4, 1.0 / 100));
		//
		//		for (int i = 0; i <= 1; i++) {
		//			System.out.println(i);
		//		}
		//
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println(d6.sumBestOf(4, 3));
		System.out.println();
		System.out.println(new Dice(3).roll());
		System.out.println(new Dice(24).roll());
		
		System.exit(0);
	}
	
	private static double map(double value, double oMin, double oMax, double nMin, double nMax) {
		return nMin + (value - oMin) * (nMax - nMin) / (oMax - oMin);
	}
	
	private static double roundTo(double value, double roundTo) {
		return Math.round(value / roundTo) * roundTo;
	}
}
