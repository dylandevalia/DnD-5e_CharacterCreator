package dnd.characterCreator.character.races;

public class Human implements Races {
	private final int[] abilityScoreModifiers;
	private final int speed;
	
	public Human() {
		abilityScoreModifiers = new int[] {1, 1, 1, 1, 1, 1};
		speed = 30;
	}
	
	public int[] getAbilityScoreIncreases() {
		return abilityScoreModifiers;
	}
	
	public int getSpeed() {
		return speed;
	}
}
