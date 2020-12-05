package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day21 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day2\\input"));

		String s = null;

		int validPw = 0;

		while ((s = br.readLine()) != null) {

			int lower = Integer.parseInt(s.split(" ")[0].split("-")[0]);
			int max = Integer.parseInt(s.split(" ")[0].split("-")[1]);

			char validator = s.split(" ")[1].charAt(0);

			char[] pw = s.split(" ")[2].toCharArray();

			int keys = 0;

			for (int i = 0; i < pw.length; i++) {
				if (pw[i] == validator) {
					keys++;
				}
			}

			if (keys >= lower && keys <= max) {
				validPw++;
			}

		}

		br.close();

		System.out.println("Valid passwords: " + validPw);

	}

}
