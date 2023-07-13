package userInputArray;

//import java.util.Iterator;
import java.util.Scanner;

public class InputValuesIntoArray {

	Scanner scanner = new Scanner(System.in);
	
	void userInput(){
		System.out.println("Enter how many vlues to add:");
		int noOfValue = scanner.nextInt();
		
		int[] storage = new int[noOfValue];
		
		System.out.println("Now enter the numberical elements:");
		for(int i=0; i<noOfValue; i++ ) {
			storage[i] = scanner.nextInt();			
		}
		
		System.out.println("The entered elements are");
		for(int i=0; i<noOfValue; i++)
		{
			System.out.println(storage[i]);
		}
	}
	
	
}
