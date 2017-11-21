package wczytywanie_zaborze;

import java.util.Scanner;

public class Kalkulator
{

	public static void main(String[] args)
	{
		Scanner odczyt= new Scanner(System.in);


		System.out.print("Podaj liczbê a:");
		int a=odczyt.nextInt();

		System.out.print("Podaj liczbê b:");
		int b=odczyt.nextInt();
		
		odczyt.close();
		
		int suma=a+b;
		int mn=a*b;
		float dz=(float)a/b;
		int roz=a-b;
		double pierw= Math.sqrt(a);
		double potega=Math.pow(a, b);
		
		int dzCalk=a/b;
		int reszta=a%b;
		
		System.out.println("a/b:"+dzCalk);
		System.out.println("reszta z dzielenia a/b:"+reszta);
		System.out.println("e wynosi:"+Math.E);
		System.out.println("suma wynosi: "+suma);
		System.out.println("iloczyn wynosi: "+mn);
		System.out.println("iloraz wynosi: "+dz);
		System.out.println("ró¿nica wynosi: "+roz);
		System.out.println("pierwiastek wynosi: "+pierw);
		System.out.println("potega wynosi: "+potega);
		
		
	}

}
