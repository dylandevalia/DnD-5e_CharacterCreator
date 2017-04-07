package dnd.characterCreator.character.player;

import dnd.characterCreator.character.classes.Classes;
import dnd.characterCreator.character.races.Races;
import dnd.characterCreator.utility.Dice;

public class Player {
	private Races playerRace;
	private Classes playerClass;
	
	int[] abilityScores = new int[6];
	
	public Player(Races playerRace, Classes playerClass, int[] abilityScores) {
		this.playerRace = playerRace;
		this.playerClass = playerClass;
		
		init();
	}
	
	public Player(Races playerRace, Classes playerClass) {
		this.playerRace = playerRace;
		this.playerClass = playerClass;
		
		for (int i = 0; i < 6; i++) {
			abilityScores[i] = new Dice(6).sumBestOf(4, 3);
		}
		
		init();
	}
	
	public void init() {
		for (int i = 0; i < 6; i++) {
			abilityScores[i] += playerRace.getAbilityScoreIncreases()[i];
		}
	}
	
	/**
	 * Getters
	 */
	
	public Races getPlayerRace() {
		return playerRace;
	}
	
	public Classes getPlayerClass() {
		return playerClass;
	}
	
	public int[] getAbilityScores() {
		return abilityScores;
	}
}
