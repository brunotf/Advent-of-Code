package day4;

public class Validate {

	public boolean validateBirth(String byr) {
		if (Integer.parseInt(byr) >= 1920 && Integer.parseInt(byr) <= 2002) {
			return true;
		}
		return false;
	}

	public boolean validateIssue(String iyr) {
		if (Integer.parseInt(iyr) >= 2010 && Integer.parseInt(iyr) <= 2020) {
			return true;
		}
		return false;
	}

	public boolean validateExpiration(String eyr) {
		if (Integer.parseInt(eyr) >= 2020 && Integer.parseInt(eyr) <= 2030) {
			return true;
		}
		return false;
	}

	public boolean validateHeight(String hgt) {
		if (hgt.contains("cm")) {
			int height = Integer.parseInt(hgt.replace("cm", ""));
			if (height >= 150 && height <= 193) {
				return true;
			} else {
				return false;
			}
		}
		if (hgt.contains("in")) {
			int height = Integer.parseInt(hgt.replace("in", ""));
			if (height >= 59 && height <= 76) {
				return true;
			}
		}
		return false;
	}

	public boolean validateHair(String hcl) {
		if (hcl.matches("(hcl:(#+([a-fA-F0-9]{6})))")) {
			return true;
		}
		return false;
	}

	public boolean validateEyes(String ecl) {
		if (ecl.matches("((ecl:amb)|(ecl:blu)|(ecl:brn)|(ecl:gry)|(ecl:grn)|(ecl:hzl)|(ecl:oth))")) {
			return true;
		}
		return false;
	}

	public boolean validatePid(String pid) {
		if (pid.matches("(pid:([0-9]{9}))")) {
			return true;
		}
		return false;
	}
}
