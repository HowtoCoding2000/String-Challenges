import java.util.Scanner;
public class StringChallenges
	{
		static Scanner userInput = new Scanner(System.in);
		static boolean stillPlaying = true;	
		static String shout = "";
		static int codeSelection;
		static String text = "";
		public static void main(String[] args)
			{
				askWhichCodeToRun();
				runSelectedCode();
			}
		public static void askWhichCodeToRun()
			{
				System.out.println("Would you like to run (1) UseYourInsideVoice or (2) VerticalLetters");
				codeSelection = userInput.nextInt();
			}
		public static void runSelectedCode()
			{
				if (codeSelection == 1)
					{
						useYourInsideVoice();
					}
				else
					{
						verticalLetters();
					}
			}
		public static void useYourInsideVoice()
			{
				while (stillPlaying)
					{						
						askForYellInput();
						convertToLowerCase();
						askToPlayAgain();
					}
			}
		public static void askForYellInput()
			{
				System.out.println("Yell something.");
				shout = userInput.nextLine();
			}
		public static void convertToLowerCase()
			{
				shout = shout.substring(0 , 1) + shout.substring(1 , shout.length()).toLowerCase();
				System.out.println(shout);
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
		public static void verticalLetters()
			{
				askForInput();
				printTextVertically();
				askToPlayAgain();
			}
		public static void askForInput()
			{
				System.out.println("Type something.");
				text = userInput.nextLine();
			}
		public static void printTextVertically()
			{
				for (int i = 0; i < text.length(); i ++)
					{
						System.out.println(text.substring(i, i + 1));
					}
			}
	}

