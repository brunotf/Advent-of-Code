package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day32 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day3\\input"));

		String s = null;

		LinkedList<String> map = new LinkedList<String>();

		while ((s = br.readLine()) != null) {
			map.add(s);
		}
		br.close();

		int[] slopesR = { 1, 3, 5, 7, 1 };
		int[] slopesD = { 1, 1, 1, 1, 2 };

		int limitX = map.get(0).length() - 1;

		int nTrees = 0;
		int product = 1;

		for (int i = 0; i < 5; i++) {

			int coordX = 0;
			int coordY = 0;

			do {
				coordX += slopesR[i];
				coordY += slopesD[i];

				if (coordX > limitX) {
					coordX = Math.abs(coordX - limitX) - 1;

				}

				if ("#".equals(String.valueOf(map.get(coordY).charAt(coordX)))) {
					nTrees++;
				}

			} while (coordY < map.size() - 1);

			product *= nTrees;
			nTrees = 0;

		}

		System.out.println("Number of trees: " + product);

	}

}
