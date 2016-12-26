package dnd.characterCreator.spell;

import dnd.characterCreator.enums.Ability;
import dnd.characterCreator.enums.DamageType;
import dnd.characterCreator.enums.SchoolTypes;

public class SpellLibrary {
	
	public static final Spell acidSplash = new Spell("Acid Splash", Spell.CANTRIP, SchoolTypes.CONJURATION, "1 action",
			60, true, true, false, Spell.INSTANTANEOUS, false,
			"You hurl a bubble of acid. Choose one creature within range, or two creatures within range that are within 5 feet of each other.",
			Ability.DEXTERITY, "1d6", DamageType.ACID
	);
	
	public static final Spell aid = new Spell("Aid", 2, SchoolTypes.ABJURATION, "1 action", 30, true, true, true,
			"8 hours", false,
			"Your spell bolsters your allies with toughness and resolve. Choose up to 3 creatures within range. Each target's hit point maximum and current hit points are increased by 5 for the duration"
	);
}
