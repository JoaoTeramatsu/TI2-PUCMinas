import java.util.*;

class SomaDoisInt {
	public static Scanner fetch = new Scanner(System.in); // Inicialiazação Scanner
	public static void main (String args[]){ 
		int num1, num2, soma; // Variáveis
		System.out.println("Digite um número"); 
		num1 = fetch.nextInt(); // registra primeiro inteiro
		System.out.println("Digite outro número"); 
		num2 = fetch.nextInt(); // registra segundo inteiro
		soma = num1 + num2; // efetua a soma
		System.out.println("Soma:" + soma); // printa na tela resultado.
	} 
}