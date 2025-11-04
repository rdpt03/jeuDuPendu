package jeuDuPendu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int tries = 10;
		ArrayList<String> words = new ArrayList<>(Arrays.asList("voiture","train","java","france","bus","avion","carte"));
		ArrayList<String> discoveredCorrectLetters = new ArrayList<>(); 
		String chosenWord;
		boolean playing = true;
		Scanner sc = new Scanner(System.in);

		//choose a word
		chosenWord = words.get( (int) Math.round(Math.random() * (words.size()-1)) );
		while(playing) {
			//ask the word
			System.out.print("Mot mystère : ");
			
			//for each word, print each _ or each letter if discovered
			for(int i=0;i<chosenWord.length();i++) {
				//if letter is discovered print it
				if(discoveredCorrectLetters.contains(String.valueOf(chosenWord.charAt(i)))){
					System.out.print(String.valueOf(chosenWord.charAt(i))+" ");
				}
				//if not print _
				else{
					System.out.print("_ ");
				}
			}
			//line break
			System.out.println();
			
			//try to guess
			System.out.print("Proposez une lettre : ");
			String tryLetter = sc.nextLine().toLowerCase();
			System.out.println();
			
			//check if only one letter and if only a to z
			if(tryLetter.matches("[a-z]")) {
				//check if the word contains the letter
				//if yes add
				if(chosenWord.contains(tryLetter)) {
					//add
					discoveredCorrectLetters.add(tryLetter);
					System.out.println("Bien joué ! La lettre '"+tryLetter+"' est dans le mot.");
				}
				else {
					//show message and decrease (the --tries decrement and print the decremented value)
					System.out.println("Dommage! La lettre '"+tryLetter+"' n'est pas dans le mot. Il vous reste "+(--tries)+" essais.");
					//check if no tries
					if(tries == 0) {
						System.out.println("Perdu!");
					}
				}
				if(isWinner(chosenWord,discoveredCorrectLetters)) {
					System.out.println("Félicitations ! Vous avez deviné le mot : "+chosenWord);
					return;
				}
			}
			else {
				System.out.println("Saisie incorrecte");
			}
		}
	}
	
	public static boolean isWinner(String chosenWord, ArrayList<String> discoveredCorrectLetters) {
		/**
		 * Function to check if the player wins / the game is finished
		 * @param chosenWord the generated word
		 * @param discoveredCorrectLetters a list with all discovered letters
		 * @return if is winner or not
		 */
		boolean iswinner = true;
		
		for(char c : chosenWord.toCharArray()) {
			if(!discoveredCorrectLetters.contains(String.valueOf(c))) {
				iswinner = false;
			}
		}
		
		return iswinner;
	}
}
