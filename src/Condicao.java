import java.util.Scanner;

public class Condicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Entre com o valor A");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a%b==0 || b%a ==0) {
			System.out.println("É múltiplos");
		}
		else {
			System.out.println("não é múltiplos");
		}
		
	}
		
	}


