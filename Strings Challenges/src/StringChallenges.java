import java.util.Scanner;
public class StringChallenges
	{
		static boolean stillRunningCode = true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringput = new Scanner(System.in);
		static boolean stillAsking = true;
		static boolean stillPlaying = true;	
		static String shout = "";
		static int codeSelection;
		static String text = "";
		public static void main(String[] args)
			{
				while (stillRunningCode)
					{
						askWhichCodeToRun();
						runSelectedCode();
						askToChangeCodes();
					}
			}
		public static void askWhichCodeToRun()
			{
				System.out.println("Would you like to run (1) UseYourInsideVoice, (2) VerticalLetters, or (3) CountTheVowels?");
				codeSelection = userInput.nextInt();
			}
		public static void runSelectedCode()
			{
				stillAsking = true;
				while (stillAsking)
					{
						if (codeSelection == 1)
							{
								useYourInsideVoice();
								stillAsking = false;
							}
						else if (codeSelection == 2)
							{
								verticalLetters();
								stillAsking = false;
							}
						else if (codeSelection == 3)
							{
								countTheVowels();
								stillAsking = false;
							}
						else
							{
								System.out.println("Please choose (1) UseYourInsideVoice, (2) VerticalLetters, or (3) CountTheVowels.");
								codeSelection = userInput.nextInt();
							}
					}
			}
		public static void askToChangeCodes()
			{
				stillAsking = true;
				while (stillAsking)
					{
						System.out.println("Would you like to run another code?");
						System.out.println("(1) Yes or (2) No");
						int runAnotherCode = userInput.nextInt();
						if (runAnotherCode == 1)
							{
								stillAsking = false;
							}
						else if (runAnotherCode == 2)
							{
								System.out.println("Thank you for running StringChallenges.");
								stillRunningCode = false;
								stillAsking = false;
							}
						else
							{
								stillAsking = true;
							}
					}
			}
		public static void useYourInsideVoice()
			{
				stillPlaying = true;
				while (stillPlaying)
					{						
						System.out.println("Yell something.");
						shout = userStringput.nextLine();
						shout = shout.substring(0 , 1) + shout.substring(1 , shout.length()).toLowerCase();
						System.out.println(shout);
						askToPlayAgain();
					}
			}
		public static void verticalLetters()
			{
				stillPlaying = true;
				while (stillPlaying)
					{
						System.out.println("Type something.");
						text = userStringput.nextLine();
						for (int i = 0; i < text.length(); i ++)
							{
								System.out.println(text.substring(i, i + 1));
							}
						askToPlayAgain();
					}
			}
		public static void countTheVowels()
			{
				stillPlaying = true;
				while (stillPlaying)
					{
						System.out.println("Type something.");
						text = userStringput.nextLine();
						int numberOfVowels = 0;
						for (int i = 0; i < text.length(); i++)
							{
								switch (text.substring(i, i + 1))
									{
									case "a":
									case "e":
									case "i":
									case "o":
									case "u":
											{
												numberOfVowels = numberOfVowels + 1;
											}
									}
							}
						if (numberOfVowels == 1)
							{
								System.out.println("There is 1 vowel in that text.");
							}
						else
							{
								System.out.println("There are " + numberOfVowels + " vowels in that text.");
							}
						askToPlayAgain();
					}
			}
		public static void askToPlayAgain()
			{
				System.out.println("Would you like to play again?");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				int playAgain = userInput.nextInt();
				if (playAgain == 2)
					{
						System.out.println("Thanks for playing!");
						stillPlaying = false;
					}
				else
					{
						stillPlaying = true;
					}
			}
	}

