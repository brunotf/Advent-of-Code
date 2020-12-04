package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Day42 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day4\\invalid"));

		String s = null;

		StringBuffer sb = new StringBuffer();

		LinkedList<String> passports = new LinkedList<String>();

		while ((s = br.readLine()) != null) {
			sb.append(s + " ");
			if (s.isBlank()) {
				passports.add(sb.toString());
				sb.delete(0, sb.length());
			}
		}
		br.close();
		
		String byr = "byr";
		String iyr = "iyr";
		String eyr = "eyr";
		String hgt = "hgt";
		String hcl = "hcl";
		String ecl = "ecl";
		String pid = "pid";
		
		

		int validPp = 0;

		Validate v = new Validate();

		for (String p : passports) {
			if ((p.contains(byr)) && (p.contains(iyr)) && (p.contains(eyr)) && (p.contains(hgt)) && (p.contains(hcl))
					&& (p.contains(ecl)) && (p.contains(pid))) {

				if ((v.validateBirth(byr)) && (v.validateIssue(iyr)) && (v.validateExpiration(eyr))
						&& (v.validateHeight(hgt)) && (v.validateHair(hcl)) && (v.validateEyes(ecl))
						&& (v.validatePid(pid))) {
					validPp++;

				}
			}
		}

		System.out.println("Valid Passport: " + validPp);

	}

}
