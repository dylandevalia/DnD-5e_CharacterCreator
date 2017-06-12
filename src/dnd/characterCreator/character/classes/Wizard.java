package dnd.characterCreator.character.classes;

import dnd.characterCreator.enums.ClassName;
import dnd.characterCreator.spell.Spell;
import dnd.characterCreator.spell.SpellLibrary;

public class Wizard implements IClass {
	private static final ClassName className = ClassName.WIZARD;
	private static final boolean hasMagic = true;
	/* Spells */
	private static final Spell[] cantrip = {SpellLibrary.acidSplash, SpellLibrary.aid};
	private static final Spell[] levelOne = {};
	
	public ClassName getClassName() {
		return className;
	}
	
	public boolean hasMagic() {
		return hasMagic;
	}
	public Spell[] getCantrip() {
		return cantrip;
	}
}
