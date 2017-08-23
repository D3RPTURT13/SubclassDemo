public class Charactertester {
	
	public static void main(String[] args) {
		/*
		 * Create a few new Students, Teachers, and People
		 */
		Player player1 = new Player("Marrkus", "Adams", "Male", 11, 25);
		Player player2 = new Player("Alexandra", "Adams", "Female", 85, 100);
		NPC npc1 = new NPC("Torby", "Swift-eye", "Male", 10, 1);
		NPC npc2 = new NPC("Drake", "Iron-Wielder", "Male", 100, 5);

				/*
		 * Let's verify the information
		 */
		
		player1.getEntityInfo();
		System.out.println("Player Level: " + player1.getPlayerLevel());
		System.out.println("Player Progress: " + player1.getPlayerProgress());
		System.out.println();
		player2.getEntityInfo();
		System.out.println("Player Level: " + player2.getPlayerLevel());
		System.out.println("Player Progress: " + player2.getPlayerProgress());
		System.out.println();
		npc1.getEntityInfo();
		System.out.println("NPC Level: " + npc1.getNPCLevel());
		System.out.println("NPC Type: " + npc1.getNPCType() + ", Shopkeeper");
		System.out.println();
		npc2.getEntityInfo();
		System.out.println("NPC Level: " + npc2.getNPCLevel());
		System.out.println("NPC Type: " + npc2.getNPCType() + ", Blacksmith");
		System.out.println();
		/*
		 * Now let's change some information and verify
		 */
		System.out.println("UPDATE ON ENTITY INFO:");
		player1.setPlayerLevel(15);
		System.out.println("Player " + player1.getFirstName() + " " + player1.getLastName() +
				" is now level " + player1.getPlayerLevel() + " Congrats! " + player1.getFirstName());
		System.out.println();
		player2.setPlayerLevel(90);
		System.out.println("Player " + player2.getFirstName() + " " + player2.getLastName() +
				" is now level " + player2.getPlayerLevel() + " Congrats! " + player2.getFirstName());
		System.out.println();
		npc1.setNPCLevel(20);
		System.out.println(npc1.getFirstName() + " " + npc1.getLastName() +
				" is now in level " + npc1.getNPCLevel() + " due to local player balancing routine");
		System.out.println();
		npc2.setNPCLevel(115);
		System.out.println(npc2.getFirstName() + " " + npc2.getLastName() +
				" is now in level " + npc2.getNPCLevel() + " due to local player balancing routine");
		System.out.println();		
	}
}