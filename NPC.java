public class NPC extends Entity {
	
	/*
	 * The class inherits all of the fields of the entity
	 * class with the additional ones defined below.
	 */
	private int npcLevel;
	private int npcType;
	
	public NPC(String first, String last, String type, int level, int role) {
		/*
		 * the super() method calls the constructor of the parent class,
		 * in this case, Person.
		 */
		super(first, last, type);
		/*
		 * After setting up the student as a Person, the new instance
		 * variables are set.
		 */
		npcLevel = level;
		npcType = role;
	}
	
	/*
	 * getter methods for the new instance variables
	 */
	public int getNPCLevel() {
		return npcLevel;
	}
	
	public int getNPCType() {
		return npcType;
	}
	
	/*
	 * setters for the new instance variables
	 */
	public void setNPCLevel(int level) {
		npcLevel = level;
	}
	
	public void setNPCType(int role) {
		npcType = role;
	}
}
