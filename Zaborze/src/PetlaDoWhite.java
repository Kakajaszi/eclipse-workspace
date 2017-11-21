import java.util.Scanner;

public class PetlaDoWhite {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in) ;
		int number;
		do
		{
			System.out.print("Podaj liczbe: ");
			number = scanner.nextInt();
		} while(number !=0);

		scanner.close();
	}

}