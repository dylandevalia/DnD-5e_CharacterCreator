package dnd.characterCreator.character.classes;

import dnd.characterCreator.enums.ClassName;
import dnd.characterCreator.spell.Spell;

public interface IClass {
	ClassName getClassName();
	
	boolean hasMagic();
	Spell[] getCantrip();
}
