package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	for (int j = 0 ; j < 10; j++)	{
		HashSet<Integer> combrand = new HashSet<Integer>();
		ArrayList<Integer> combdevin = new ArrayList <Integer>();
		

		Random randNumber = new Random();
		while (combrand.size()<4) {
			combrand.add(1 + randNumber.nextInt(6));
		}
		System.out.println(combrand);

		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter un numéro");
		for (int i = 0; i < 4; i++) {
			combdevin.add(userinput.nextInt());	
		}
		System.out.println(combdevin);
		for (int A  = 0; A < 4; A++) {
			 List<Integer> convHash = new ArrayList<Integer>(combrand);
			if (combdevin.get(A) == convHash.get(A)) {
				System.out.println("#");
			
				}else if(convHash.contains(combdevin.get(A))) {
					System.out.println("0");
				}
			
		}
		
	}
	System.out.println("You lost try again");
	}
}
