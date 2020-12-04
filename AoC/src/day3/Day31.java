package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day31 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day3\\input"));

		String s = null;

		LinkedList<String> map = new LinkedList<String>();

		while ((s = br.readLine()) != null) {
			map.add(s);
		}
		br.close();

		int limitX = map.get(0).length() - 1;
		int coordX = 0;
		int coordY = 0;
		int arvores = 0;

		do {
			coordX += 3;
			coordY += 1;

			if (coordX > limitX) {
				coordX = Math.abs(coordX - limitX) - 1;

			}

			if ("#".equals(String.valueOf(map.get(coordY).charAt(coordX)))) {
				arvores++;
			}

		} while (coordY < map.size() - 1);

		System.out.println("Numero de arvores: " + arvores);

	}

}
