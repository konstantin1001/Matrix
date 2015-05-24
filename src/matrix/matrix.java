package matrix;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете число:");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print(i + "   ");
			for (int k = i + 1; k < n + i; k++)
				System.out.print(k + "   ");

		}
	}

}
