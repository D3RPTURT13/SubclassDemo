public class Player extends Entity {
	
	/*
	 * The class inherits all of the fields of the entity
	 * class with the additional ones defined below.
	 */
	private int playerLevel;
	private int playerProgress;
	
	public Player(String first, String last, String type, int level, int percent) {
		/*
		 * the super() method calls the constructor of the parent class,
		 * in this case, Person.
		 */
		super(first, last, type);
		
		playerLevel = level;
		playerProgress = percent;
	}
	
	/*
	 * getter methods for the new instance variables
	 */
	public int getPlayerLevel() {
		return playerLevel;
	}
	
	public int getPlayerProgress() {
		return playerProgress;
	}
	
	/*
	 * setters for the new instance variables
	 */
	public void setPlayerLevel(int level) {
		playerLevel = level;
	}
	
	public void setPlayerProgress(int percent) {
		playerProgress = percent;
	}
}