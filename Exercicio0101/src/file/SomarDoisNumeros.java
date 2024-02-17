package file;
import java.util.*;

class SomarDoisNumeros {
	
	// Object "sc" create
	public static Scanner sc = new Scanner(System.in);
	
	/*
	   - Main Function
	*/
	public static void main(String args[]) {
		
		// variable declaration
		int num1 = 0, num2 = 0, soma = 0;
		
		//keyboard readings
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		num2 = sc.nextInt();
		
		// mathematical operation
		soma = num1 + num2;
		
		// display on screen
		System.out.println("A soma dos valores e: " + soma);
		
	} // end main
} // end class SomarDoisNumeros