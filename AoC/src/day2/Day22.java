package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day2\\input"));

		String s = null;

		int senhasvalidas = 0;

		String separador[] = new String[3];

		while ((s = br.readLine()) != null) {

			separador = s.split(" ");

			String limiar[] = new String[2];
			limiar = separador[0].split("-");
			int minimo = Integer.parseInt(limiar[0]);
			int maximo = Integer.parseInt(limiar[1]);

			char key = separador[1].charAt(0);

			char[] senha = separador[2].toCharArray();

			if ((senha[minimo - 1] == key) != (senha[maximo - 1] == key)) {
				senhasvalidas++;
			}

		}

		br.close();

		System.out.println("Valid passwords: " + senhasvalidas);

	}

}
