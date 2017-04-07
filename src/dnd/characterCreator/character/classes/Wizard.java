package dnd.characterCreator.character.classes;

import dnd.characterCreator.spell.Spell;
import dnd.characterCreator.spell.SpellLibrary;

public class Wizard implements Classes {
	private static boolean hasMagic = true;
	/* Spells */
	private static final Spell[] cantrip = {SpellLibrary.acidSplash, SpellLibrary.aid};
	private static final Spell[] levelOne = {};
	
	@Override
	public boolean hasMagic() {
		return hasMagic;
	}
	
	@Override
	public Spell[] getCantrip() {
		return cantrip;
	}
}
