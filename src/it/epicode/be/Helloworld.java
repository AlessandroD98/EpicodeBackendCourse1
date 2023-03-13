package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Print in console a phrase  
		System.out.println("This is my first Epicode Java Project!");
		
		//Ex 2 par 1
		
		int a = 2;
		int b = 3;
		int result = Multiply(a,b);
		
		System.out.println(result);
		
		//Ex 2 par 2
		
		int c = 4;
		String query = "Ciao a voi";
		String Concatena = StringPusNumb(query, c);
		System.out.println(Concatena);
		
		//Ex 2 par 3
		
		String ArryOfString[] = {"1", "2", "3", "4","5"};
		String word = "6";
		int pos = 3;
		
		System.out.println(Arrays.toString(ArryOfString));
		
		String arr[] = AddString(ArryOfString, word, pos);
		
		System.out.println(Arrays.toString(arr));
		
		//Ex 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String stringa1 = scanner.nextLine();
		String stringa2 = scanner.nextLine();
		String stringa3 = scanner.nextLine();
		System.out.println("la stringa inserita è:" + " " + RevrseString(stringa1, stringa2, stringa3));
		
		//Ex 4 par 1
		
		double CPerimentroRettangolo = PerimetroRettangolo(10.20, 5.4);
		
		System.out.println(CPerimentroRettangolo);
		
		//Ex 4 part 2
		
		int z = 5;
		
		System.out.println(DispariOPari(z));
		
		//Ex 4 part 3
		
		double lato1 = 2.7;
		double lato2 = 3.5;
		double lato3 = 4.2;
		
		System.out.println("L'area del triangolo è:" + " " + AreaTriangolo(lato1, lato2, lato3));
		
		}
private static int Multiply(int a,int b) {
	return a * b;
}

private static String StringPusNumb(String str, int num) {
	return str+ " " + num;
}

private static String[] AddString(String[] array, String y, int pos) {
	
	String newarr[] = new String[array.length + 1];
	
	int i;
	
	for (i = 0; i < newarr.length; i++ )
		if (i < pos-1)
		newarr[i] = array[i];
		else if(i == pos-1)
			newarr[i] = y;
		else
			newarr[i] = array[i - 1];
	
	
	
	return newarr;
}

private static String RevrseString(String str1, String str2, String str3) {
	return str1 + " " + str2 + " " + str3 + " " + "Reverse" + " " + str3 + " " + str2 + " " + str1;
}

private static double PerimetroRettangolo(double b, double h) {
	return 2*b + 2*h;
}

private static int DispariOPari (int num) {
	if(num % 2 == 0)
		return 0;
		else return 1;
}

private static double AreaTriangolo (double a,double b,  double c) {
	double p = (a + b + c)/2;
	
	return Math.sqrt((p*(p-a))*(p*(p-b))*(p*(p-c)));
}

}



