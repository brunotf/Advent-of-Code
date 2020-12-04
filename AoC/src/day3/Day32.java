package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day32 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day3\\test"));

		String s = null;

		LinkedList<String> map = new LinkedList<String>();

		int[] slopesR = { 1, 3, 5, 7, 1 };
		int[] slopesD = { 1, 1, 1, 1, 2 };

		while ((s = br.readLine()) != null) {
			map.add(s);
		}
		br.close();

		int limitX = map.get(0).length() - 1;
		int coordX = 0;
		int coordY = 0;
		int arvores = 0;
		int produto = 0;

		for (int i = 0; i < 5; i++) {

			do {
				coordX += slopesR[i];
				coordY += slopesD[i];

				if (coordX > limitX) {
					coordX = Math.abs(coordX - limitX) - 1;

				}

				if ("#".equals(String.valueOf(map.get(coordY).charAt(coordX)))) {
					arvores++;
				}

			} while (coordY < map.size() - 1);

			produto *= arvores;

		}

		System.out.println("Numero de arvores: " + arvores);

	}

}
