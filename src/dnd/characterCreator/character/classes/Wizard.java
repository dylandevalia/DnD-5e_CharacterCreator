package dnd.characterCreator.character.classes;

import dnd.characterCreator.spell.Spell;
import dnd.characterCreator.spell.SpellLibrary;

public class Wizard implements Classes {
	/* Spells */
	public static final Spell[] cantrip = {SpellLibrary.acidSplash};
	public static final Spell[] levelOne = {};
	
	public boolean hasMagic() {return true;}
}
