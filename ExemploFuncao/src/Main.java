import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*Programa ex. de função
		 * No caso eu criei 4 funções pra resolver as operações
		 * E em conjuto com cada função uma outra função pra exibir o resultado*/
		
		Scanner sc = new Scanner(System.in);

		int e, soma, a, b;

		System.out.println("===================");
		System.out.println("     OPERAÇÕES     ");
		System.out.println("===================");
		System.out.println("  ");
		System.out.println("|[1] ADIÇÃO       |");
		System.out.println("|[2] SUBTRAÇÃO    |");
		System.out.println("|[3] MULTIPLICAÇÃO|");
		System.out.println("|[4] DIVISÃO      |");
		e = sc.nextInt();
		switch (e) {
		case 1:
			System.out.print("informe um numero: ");
			a = sc.nextInt();
			System.out.print("informe outro numero: ");
			b = sc.nextInt();
			
			soma = funSoma(a, b);
			
			funcaoResulto(soma);
			break;
		case 2:
			System.out.print("informe um numero: ");
			a = sc.nextInt();
			System.out.print("informe outro numero: ");
			b = sc.nextInt();
			
			soma = funSub(a, b);
			
			funcaoResultoSub(soma);
			break;
		case 3:
			System.out.print("informe um numero: ");
			a = sc.nextInt();
			System.out.print("informe outro numero: ");
			b = sc.nextInt();
			
			soma = funMut(a, b);
			
			funcaoResultoMult(soma);
			break;
		case 4:
			System.out.print("informe um numero: ");
			a = sc.nextInt();
			System.out.print("informe outro numero: ");
			b = sc.nextInt();
			
			soma = funDi(a, b);
			
			funcaoResultoDi(soma);
			break;
		}


		sc.close();
	}

	public static int funSoma(int x, int y) {

		int aux;
		aux = x + y;
		
		return aux;
	}

	public static void funcaoResulto(int resultado) {

		System.out.println("Resultado da Adição: " + resultado);
	}

	public static int funSub(int x, int y) {

		int aux;
		aux = x - y;
		
		return aux;
	}

	public static void funcaoResultoSub(int resultado) {

		System.out.println("Resultado da Subtração: " + resultado);
	}
	
	public static int funMut(int x, int y) {

		int aux;
		aux = x * y;
		
		return aux;
	}

	public static void funcaoResultoMult(int resultado) {

		System.out.println("Resultado da Multiplicação: " + resultado);
	}
	public static int funDi(int x, int y) {

		int aux;
		aux = x / y;
		
		return aux;
	}

	public static void funcaoResultoDi(int resultado) {

		System.out.println("Resultado da Divisão: " + resultado);
	}

}