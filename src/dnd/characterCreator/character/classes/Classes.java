package dnd.characterCreator.character.classes;

import dnd.characterCreator.spell.Spell;

public interface Classes {
	boolean hasMagic();
	
	Spell[] getCantrip();
}
