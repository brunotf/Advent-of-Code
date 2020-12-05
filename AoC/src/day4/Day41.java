package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day41 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day4\\input"));

		String s = null;

		StringBuffer sb = new StringBuffer();

		int validPp = 0;

		while ((s = br.readLine()) != null) {
			sb.append(s + " ");
			if (s.isBlank()) {
				String passport = "";
				passport = sb.toString();

				String byr = "byr";
				String iyr = "iyr";
				String eyr = "eyr";
				String hgt = "hgt";
				String hcl = "hcl";
				String ecl = "ecl";
				String pid = "pid";

				if (passport.contains(byr) && (passport.contains(iyr)) && (passport.contains(eyr))
						&& (passport.contains(hgt)) && (passport.contains(hcl)) && (passport.contains(ecl))
						&& (passport.contains(pid))) {
					validPp++;
				}

				sb.delete(0, sb.length());

			}

		}

		br.close();

		System.out.println("Valid passports: " + validPp);

	}

}
