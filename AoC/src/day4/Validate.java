package day4;

public class Validate {

	public boolean validateBirth(String byr) {
		if (byr.isBlank()) {
			return false;
		}

		int birth = Integer.parseInt(byr.replace("byr:", "").trim());

		if (birth >= 1920 && birth <= 2002) {
			return true;
		}
		return false;
	}

	public boolean validateIssue(String iyr) {
		if (iyr.isBlank()) {
			return false;
		}

		int issue = Integer.parseInt(iyr.replace("iyr:", ""));
		if (issue >= 2010 && issue <= 2020) {
			return true;
		}
		return false;
	}

	public boolean validateExpiration(String eyr) {
		if (eyr.isBlank()) {
			return false;
		}

		int expedition = Integer.parseInt(eyr.replace("eyr:", ""));
		if (expedition >= 2020 && expedition <= 2030) {
			return true;
		}
		return false;
	}

	public boolean validateHeight(String hgt) {
		if (hgt.isBlank()) {
			return false;
		}
		
		if (hgt.contains("cm")) {
			int height = Integer.parseInt(hgt.replace("cm", "").replace("hgt:", ""));
			if (height >= 150 && height <= 193) {
				return true;
			}
		}
		if (hgt.contains("in")) {
			int height = Integer.parseInt(hgt.replace("in", "").replace("hgt:", ""));
			if (height >= 59 && height <= 76) {
				return true;
			}
		}
		return false;
	}

	public boolean validateHair(String hcl) {
		if (hcl.isBlank()) {
			return false;
		}
		
		if (hcl.matches("(hcl:(#+([a-f0-9]{6})))")) {
			return true;
		}
		return false;
	}

	public boolean validateEyes(String ecl) {
		if (ecl.isBlank()) {
			return false;
		}
		
		if (ecl.matches("((ecl:amb)|(ecl:blu)|(ecl:brn)|(ecl:gry)|(ecl:grn)|(ecl:hzl)|(ecl:oth))")) {
			return true;
		}
		return false;
	}

	public boolean validatePid(String pid) {
		if (pid.isBlank()) {
			return false;
		}
		
		if (pid.matches("(pid:([0-9]{9}))")) {
			return true;
		}
		return false;
	}
}
