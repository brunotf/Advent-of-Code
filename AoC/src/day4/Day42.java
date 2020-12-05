package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day42 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\GitHub\\Advent-of-Code\\AoC\\src\\day4\\input"));

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

		System.out.println(passports.size());

		int validPp = 0;

		Validate v = new Validate();

		for (String str : passports) {

			Pattern pByr = Pattern.compile("(byr:([0-9]){4})");
			Pattern pIyr = Pattern.compile("(iyr:([0-9]){4})");
			Pattern pEyr = Pattern.compile("(eyr:([0-9]){4})");
			Pattern pHgt = Pattern.compile("(hgt:(([0-9]{1,})(cm|in)))");
			Pattern pHcl = Pattern.compile("(hcl:(#+([0-9a-f]{1,})))");
			Pattern pEcl = Pattern.compile("((ecl:amb)|(ecl:blu)|(ecl:brn)|(ecl:gry)|(ecl:grn)|(ecl:hzl)|(ecl:oth))");
			Pattern pPid = Pattern.compile("(pid:([0-9]{1,}))");

			String byr = "";
			String iyr = "";
			String eyr = "";
			String hgt = "";
			String hcl = "";
			String ecl = "";
			String pid = "";

			Matcher m = pByr.matcher(str);
			if (m.find()) {
				byr = m.group(1);
			}

			m = pIyr.matcher(str);
			if (m.find()) {
				iyr = m.group(1);
			}

			m = pEyr.matcher(str);
			if (m.find()) {
				eyr = m.group(1);
			}

			m = pHgt.matcher(str);
			if (m.find()) {
				hgt = m.group(1);
			}

			m = pHcl.matcher(str);
			if (m.find()) {
				hcl = m.group(1);
			}

			m = pEcl.matcher(str);
			if (m.find()) {
				ecl = m.group(1);
			}

			m = pPid.matcher(str);
			if (m.find()) {
				pid = m.group(1);
			}

			if ((v.validateBirth(byr)) 
					&& (v.validateIssue(iyr)) 
					&& (v.validateExpiration(eyr))
					&& (v.validateHeight(hgt)) 
					&& (v.validateHair(hcl)) 
					&& (v.validateEyes(ecl))
					&& (v.validatePid(pid))) {
				
				validPp++;

			}

		}
		
		System.out.println(passports.getFirst());
		
		System.out.println(passports.getLast());

		System.out.println("Valid Passport: " + validPp);

	}

}
