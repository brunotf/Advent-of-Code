package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day22 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day2\\input"));

		String s = null;

		int validPw = 0;

		String separator[] = new String[3];

		while ((s = br.readLine()) != null) {

			separator = s.split(" ");

			String limit[] = new String[2];
			limit = separator[0].split("-");
			int lower = Integer.parseInt(limit[0]);
			int max = Integer.parseInt(limit[1]);

			char key = separator[1].charAt(0);

			char[] pw = separator[2].toCharArray();

			if ((pw[lower - 1] == key) != (pw[max - 1] == key)) {
				validPw++;
			}

		}

		br.close();

		System.out.println("Valid passwords: " + validPw);

	}

}
