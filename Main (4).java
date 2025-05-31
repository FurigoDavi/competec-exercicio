import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Leia um número inteiro N: ");
		int n = scan.nextInt();
		
		int numeros[] = new int [n];
		for(int i = 0; i < n; i++){
		    System.out.println("Digite o valor do arranjo [" + i + "]" );
		    int arranjo = scan.nextInt();
		    numeros[i] = arranjo;
		}
		System.out.println("----------------");
		for(int i = 0;i < numeros.length; i++){
		    System.out.println("Os valores armazenados no vetor são [" + i + "] : " + numeros[i]);
		}
		
	}
}