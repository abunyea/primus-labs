package battleship;

import java.util.Scanner;

public class Main {

	private static final int C = 10;
	private static final char EMPTY = 'e';
	private static final char SHIP = 's';
	private static final char HIT = '*';
	private static final char MISS = '0';
	private static final int NUM_SHIPS = 9;
	private static int shipsRemaining;
	private static char[][] water;
	private static Scanner input;
	
	public static void main(String[] args) {
		setUp();
		while (shipsRemaining > 0) {
			printBoard();
			guess();
		}
		System.out.println("You win!");
	}
	
	public static void setUp() {
		input = new Scanner(System.in);
		water = new char[C][C];
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < C; j++) {
				water[i][j] = EMPTY;
			}
		}
		for (shipsRemaining = 0; shipsRemaining < NUM_SHIPS;) {
			int randx = (int)(Math.random()*C);
			int randy = (int)(Math.random()*C);
			if (water[randx][randy] == EMPTY) {
				water[randx][randy] = SHIP;
				shipsRemaining++;
			}
		}
	}
	
	public static void printBoard() {
		for (int i = 0; i < C; i++) {
			System.out.print("|");
			for (int j = 0; j< C; j++) {
				
				if (water[i][j] == SHIP || water[i][j] == EMPTY) {
					System.out.print("_|");
				} else {
					System.out.print(water[i][j] + "|");
				}
				
			}
			System.out.print("\n");
		}
	}
	
	public static void guess() {
		System.out.println("Enter a guess: ");
		int inx = input.nextInt();
		int iny = input.nextInt();
		if (inx < 0 || inx > C || iny < 0 || iny > C) {
			System.out.println("Not a valid guess!");
		} else if (water[inx][iny] == HIT || water[inx][iny] == MISS) {
			System.out.println("You already guessed that space!");
		} else if (water[inx][iny] == SHIP){
			System.out.println("You got a hit!");
			water[inx][iny] = HIT;
			shipsRemaining--;
		} else {
			System.out.println("You missed.");
			water[inx][iny] = MISS;
		}
	}

}
