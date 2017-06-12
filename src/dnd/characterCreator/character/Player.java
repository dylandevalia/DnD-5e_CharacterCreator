package dnd.characterCreator.character;

import dnd.characterCreator.character.classes.IClass;
import dnd.characterCreator.character.races.IRace;
import dnd.characterCreator.utility.Dice;

public class Player {
	public static Player playerCharacter;
	
	private IRace playerRace;
	private IClass playerClass;
	
	private int[] abilityScores = new int[6];
	
	public Player(IRace playerRace, IClass playerClass, int[] abilityScores) {
		this.playerRace = playerRace;
		this.playerClass = playerClass;
		
		init();
	}
	
	public Player(IRace playerRace, IClass playerClass) {
		this.playerRace = playerRace;
		this.playerClass = playerClass;
		
		for (int i = 0; i < 6; i++) {
			abilityScores[i] = new Dice(6).sumBestOf(4, 3);
		}
		
		init();
	}
	
	public Player() {
		
	}
	
	public void init() {
		for (int i = 0; i < 6; i++) {
			abilityScores[i] += playerRace.getAbilityScoreIncreases()[i];
		}
	}
	
	/**
	 *  Setters
	 */
	
	public void setRace(IRace playerRace) {
		this.playerRace = playerRace;
	}
	
	public void setClass(IClass playerClass) {
		this.playerClass = playerClass;
	}
	
	public void setAbilityScores(int[] abilityScores) {
		this.abilityScores = abilityScores;
	}
	
	/**
	 * Getters
	 */
	
	public IRace getPlayerRace() {
		return playerRace;
	}
	
	public IClass getPlayerClass() {
		return playerClass;
	}
	
	public int[] getAbilityScores() {
		return abilityScores;
	}
}
