package com.tts;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    	//hello world statement
    	System.out.println("Hello world!");
    	//scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");

		//make input line
		String usersName = scanner.nextLine();
		System.out.printf("Hello %s, have some time for some questions y/n? \n", usersName);
		String ynInput = scanner.next();
		if (ynInput.equals("yes") || ynInput.equals("y")){
			System.out.println("What is your favorite pet name? ");
			String petName =scanner.next();
			System.out.printf("what is the age of %s ?", petName);
			Integer petAge =scanner.nextInt();
			System.out.printf("What is your lucky number? ");
			Integer luckyNum = scanner.nextInt();
			System.out.println("What is the first name of your favorite actor/actress? ");
			String actName= scanner.next();
			System.out.printf("Enter a number between 1-50? ");
			Integer beTween = scanner.nextInt();
			System.out.println("What is the Jersey number of your Favorite Team person? ");
			Integer jerseyNum = scanner.nextInt();
			System.out.println("What is the two digits of the year of your car");
			Integer carYear = scanner.nextInt();
			System.out.println("Magic Ball: "+ luckyNum + "Lottery Numbers: "+ (petAge + carYear) + "," + (jerseyNum + petAge + luckyNum) +","+ (carYear+luckyNum) +"," + "42," + (beTween - 1) );
		}else{
			System.out.print("Take the survey another time.");
			System.exit(0);
		}
		//public void printQuestions(Int quest)



		//Integer someInt = scanner.nextInt();
		//System.out.println(someInt);


    }
}
