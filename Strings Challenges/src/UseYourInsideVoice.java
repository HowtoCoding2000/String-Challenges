import java.util.Scanner;
public class UseYourInsideVoice
	{
		static Scanner userInput = new Scanner(System.in);
		static boolean stillPlaying = true;	
		static String shout;
		public static void main(String[] args)
			{
				while (stillPlaying)
					{						
						askForInput();
						convertToLowerCase();
						askToPlayAgain();
					}
			}
		public static void askForInput()
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
	}

