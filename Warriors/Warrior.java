package warrior;

public class Warrior {

	// write your variable definitions here

	public int getHealth() {
		// write code here
	}

	public int getPower() {
		// write code here
	}

	public int getDefense() {
		// write code here
	}

	// Write a constructor function here
	// It wil looke like this:
	// 
	// 		public Warrior(<some arguments>) {
	//			<some code here>
	//		}

	/* 
	 * This function should calculate
	 * this warrior's attack - otherWarrior's defense
	 * and subtract that from otherWarrior's health.		
	 */
	public void attack(Warrior otherWarrior) {
		// write code here
	}

	/* 
	 * This function should increase
	 * this warrior's health by some amount.
	 */
	public void heal() {
		// write code here
	}

	/*
	 * This is the toString method,
	 * it should return a string that
	 * shows the health, attack, and defense
	 * of the warrior
	 */
	@Override
	public String toString() {
		// Write code here
		// use the + to combine strings together
		return "warrior"; // <-change this to something else
	}
}
