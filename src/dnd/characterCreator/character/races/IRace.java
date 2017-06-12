package dnd.characterCreator.character.races;

import dnd.characterCreator.enums.RaceName;

public interface IRace {
	RaceName getRaceName();
	
	int[] getAbilityScoreIncreases();
	
	int getSpeed();
}
