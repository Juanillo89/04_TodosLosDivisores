package todosLosDivisores;

import java.util.Scanner;

public class TodosLosDivisores
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.print("Introduce un número para conocer sus divisores: ");
		numero = sc.nextInt();
		sc.close();
		for(int i = 1 ; i < numero ; i++)
		{
			if(numero % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}

