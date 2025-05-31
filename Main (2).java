public class Main
{
	public static void main(String[] args) {
		
		int inteiros[] = {1, 2, 3};
		int soma = inteiros[0] + inteiros[1] + inteiros[2];
		System.out.println("A soma dos números é: " + soma);
		
		//ou
		
		int numeros[] = new int [3];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		int somas = numeros[0] + numeros[1] + numeros[2];
		System.out.println("A soma dos números é: " + somas);
		
	}
}