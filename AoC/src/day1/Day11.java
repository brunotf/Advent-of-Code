package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Day11 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day1\\input"));

		HashSet<Integer> input = new HashSet<Integer>();

		String s = null;

		while ((s = br.readLine()) != null) {
			input.add(Integer.parseInt(s));
		}

		br.close();

		int product = 0;

		for (Integer i : input) {
			for (Integer j : input) {
				if (i + j == 2020) {
					product = i * j;
					System.out.printf("Number 1: %d\nNumber 2: %d\nProduct = %d\n", i, j, product);
					System.exit(0);
				}
			}
		}
	}

}
