package dnd.characterCreator.character.races;

import dnd.characterCreator.enums.RaceName;

public class Human implements IRace {
	private static final RaceName raceName = RaceName.HUMAN;
	private static final int[] abilityScoreModifiers = {1, 1, 1, 1, 1, 1};
	private static final int speed = 30;
	
	public RaceName getRaceName() {
		return raceName;
	}
	public int[] getAbilityScoreIncreases() {
		return abilityScoreModifiers;
	}
	public int getSpeed() {
		return speed;
	}
}
