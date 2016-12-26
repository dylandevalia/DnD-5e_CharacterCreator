package dnd.characterCreator.spell;

import dnd.characterCreator.enums.Ability;
import dnd.characterCreator.enums.DamageType;
import dnd.characterCreator.enums.SchoolTypes;

public class Spell {
	/* Duration */
	public static final String INSTANTANEOUS = "Instantaneous";
	
	/* Level */
	public static final int CANTRIP = 0;
	
	/* Attributes */
	private final String name;
	private final int level;
	private final SchoolTypes type;
	private final String castingTime;
	private final int range;
	private final boolean touch;
	private final boolean verbal;
	private final boolean somatic;
	private final boolean material;
	private final String duration;
	private final boolean concentration;
	private final String description;
	private final Ability savingThrow;
	private final String damage;
	private final DamageType damageType;
	
	/**
	 * Has a range
	 * No damage
	 */
	public Spell(
			String name, int level, SchoolTypes type, String castingTime, int range, boolean verbal, boolean somatic,
			boolean material, String duration, boolean concentration, String description) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.castingTime = castingTime;
		this.range = range;
		this.touch = false;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.duration = duration;
		this.concentration = concentration;
		this.description = description;
		this.savingThrow = null;
		this.damage = null;
		this.damageType = null;
	}
	
	/**
	 * Has a range
	 * Has damage
	 */
	public Spell(
			String name, int level, SchoolTypes type, String castingTime, int range, boolean verbal, boolean somatic,
			boolean material, String duration, boolean concentration, String description, Ability savingThrow,
			String damage, DamageType damageType) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.castingTime = castingTime;
		this.range = range;
		this.touch = false;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.duration = duration;
		this.concentration = concentration;
		this.description = description;
		this.savingThrow = savingThrow;
		this.damage = damage;
		this.damageType = damageType;
	}
	
	/**
	 * No range
	 * No damage
	 */
	public Spell(
			String name, int level, SchoolTypes type, String castingTime, boolean touch, boolean verbal,
			boolean somatic, boolean material, String duration, boolean concentration, String description) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.castingTime = castingTime;
		this.range = 0;
		this.touch = touch;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.duration = duration;
		this.concentration = concentration;
		this.description = description;
		this.savingThrow = null;
		this.damage = null;
		this.damageType = null;
	}
	
	/**
	 * No range
	 * Has damage
	 */
	public Spell(
			String name, int level, SchoolTypes type, String castingTime, boolean touch, boolean verbal,
			boolean somatic, boolean material, String duration, boolean concentration, String description,
			Ability savingThrow, String damage, DamageType damageType) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.castingTime = castingTime;
		this.range = 0;
		this.touch = touch;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.duration = duration;
		this.concentration = concentration;
		this.description = description;
		this.savingThrow = savingThrow;
		this.damage = damage;
		this.damageType = damageType;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public SchoolTypes getType() {
		return type;
	}
	
	public String getCastingTime() {
		return castingTime;
	}
	
	public int getRange() {
		return range;
	}
	
	public boolean isTouch() {
		return range == 0 && touch;
	}
	
	public boolean isSelf() {
		return range == 0 && !touch;
	}
	
	public boolean isVerbal() {
		return verbal;
	}
	
	public boolean isSomatic() {
		return somatic;
	}
	
	public boolean isMaterial() {
		return material;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public boolean isConcentration() {
		return concentration;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Ability getSavingThrow() {
		return savingThrow;
	}
	
	public String getDamage() {
		return damage;
	}
	
	public DamageType getDamageType() {
		return damageType;
	}
}
