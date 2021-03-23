package osgimath;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class ConvertService {

	public long parseEnString(String strg) {
		boolean isValidInput = true;
		long result = 0;
		long finalResult = 0;
		List<String> allowedStrings = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven",
				"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",
				"hundred", "lakhs", "lakh", "thousand", "crore", "crores", "and", "million", "billion", "trillion");

		// String input="one hundred";
		String input = String.join(" ", strg);
		if (input != null && input.length() > 0) {
			input = input.replaceAll("-", " ");
			input = input.toLowerCase().replaceAll(" and", " ");
			String[] splittedParts = input.trim().split("\\s+");

			for (String str : splittedParts) {
				if (!allowedStrings.contains(str)) {
					isValidInput = false;
					System.out.println("Invalid word found : " + str);
					break;
				}
			}
			if (isValidInput) {
				for (String str : splittedParts) {
					String compare = str.toLowerCase();
					switch (compare) {
					case "and":
						break;
					case "zero":
						result += 0;
						break;
					case "one":
						result += 1;
						break;
					case "two":
						result += 2;
						break;
					case "three":
						result += 3;
						break;
					case "four":
						result += 4;
						break;
					case "five":
						result += 5;
						break;
					case "six":
						result += 6;
						break;
					case "seven":
						result += 7;
						break;
					case "eight":
						result += 8;
						break;
					case "nine":
						result += 9;
						break;
					case "ten":
						result += 10;
						break;
					case "eleven":
						result += 11;
						break;
					case "twelve":
						result += 12;
						break;
					case "thirteen":
						result += 13;
						break;
					case "fourteen":
						result += 14;
						break;
					case "fifteen":
						result += 15;
						break;
					case "sixteen":
						result += 16;
						break;
					case "seventeen":
						result += 17;
						break;
					case "eighteen":
						result += 18;
						break;
					case "nineteen":
						result += 19;
						break;
					case "twenty":
						result += 20;
						break;
					case "thirty":
						result += 30;
						break;
					case "forty":
						result += 40;
						break;
					case "fifty":
						result += 50;
						break;
					case "sixty":
						result += 60;
						break;
					case "seventy":
						result += 70;
						break;
					case "eighty":
						result += 80;
						break;
					case "ninety":
						result += 90;
						break;
					case "hundred":
						result *= 100;
						break;
					case "thousand":
						result *= 1000;
						finalResult += result;
						result = 0;
						break;
					case "lakh":
						result *= 100000;
						finalResult += result;
						result = 0;
						break;
					case "lakhs":
						result *= 100000;
						finalResult += result;
						result = 0;
						break;
					case "crore":
						result *= 10000000;
						finalResult += result;
						result = 0;
						break;
					case "crores":
						result *= 10000000;
						finalResult += result;
						result = 0;
						break;
					case "million":
						result *= 1000000;
						finalResult += result;
						result = 0;
						break;
					case "billion":
						result *= 1000000000;
						finalResult += result;
						result = 0;
						break;
					case "trillion":
						result *= 1000000000000L;
						finalResult += result;
						result = 0;
						break;
					}
				}

				finalResult += result;
				result = 0;
				System.out.println(finalResult);
			}
		}
		return finalResult;
	}

	public long parseTrString(String strg) {
		boolean isValidInput = true;
		long result = 0;
		long finalResult = 0;
		List<String> allowedStrings = Arrays.asList("sýfýr", "bir", "iki", "üç", "dört", "beþ", "altý", "yedi", "sekiz",
				"dokuz", "on", "yirmi", "otuz", "kýrk", "elli", "altmýþ", "yetmiþ", "seksen", "doksan", "yüz", "bin",
				"milyon", "milyar", "trilyon", "katrilyon");

		String input = String.join(" ", strg);
		if (input != null && input.length() > 0) {
			input = input.replaceAll("-", " ");
			input = input.toLowerCase().replaceAll(" and", " ");
			String[] splittedParts = input.trim().split("\\s+");

			for (String str : splittedParts) {
				if (!allowedStrings.contains(str)) {
					isValidInput = false;
					System.out.println("Invalid word found : " + str);
					break;
				}
			}
			if (isValidInput) {
				for (String str : splittedParts) {
					String compare = str.toLowerCase();
					switch (compare) {

					case "sýfýr":
						result += 0;
						break;
					case "bir":
						result += 1;
						break;
					case "iki":
						result += 2;
						break;
					case "üç":
						result += 3;
						break;
					case "dört":
						result += 4;
						break;
					case "beþ":
						result += 5;
						break;
					case "altý":
						result += 6;
						break;
					case "yedi":
						result += 7;
						break;
					case "sekiz":
						result += 8;
						break;
					case "dokuz":
						result += 9;
						break;
					case "on":
						result += 10;
						break;
					case "yirmi":
						result += 20;
						break;
					case "otuz":
						result += 30;
						break;
					case "kýrk":
						result += 40;
						break;
					case "elli":
						result += 50;
						break;
					case "altmýþ":
						result += 60;
						break;
					case "yetmiþ":
						result += 70;
						break;
					case "seksen":
						result += 80;
						break;
					case "doksan":
						result += 90;
						break;
					case "yüz":
						result=1;
						result *= 100;
						break;
					case "bin":
						result *= 1000;
						finalResult += result;
						result = 0;
						break;
					case "milyon":
						result *= 1000000;
						finalResult += result;
						result = 0;
						break;
					case "milyar":
						result *= 1000000000;
						finalResult += result;
						result = 0;
						break;
					case "trilyon":
						result *= 1000000000000L;
						finalResult += result;
						result = 0;
						break;
					case "katrilyon":
						result *= 1000000000000000L;
						finalResult += result;
						result = 0;
						break;
					}
				}

				finalResult += result;
				result = 0;
				System.out.println(finalResult);
			}
		}
		return finalResult;
	}

	private final String[] NamesEnglish = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy",
			" eighty", " ninety" };

	private final String[] NamesEnglish2 = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen",
			" eighteen", " nineteen" };

	private final String[] NamesTurkish = { "", " on", " yirmi", " otuz", " kýrk", " elli", " altmýþ", " yetmiþ",
			" seksen", " doksan" };

	private final String[] NamesTurkish2 = { "", " bir", " iki", " üç", " dört", " beþ", " altý", " yedi", " sekiz",
			" dokuz", " on ", " on bir", " on iki", " on üç", " on dört", " on beþ", " on altý", " on yedi",
			" on sekiz", " on dokuz" };

	public String convertLessThanOneThousandTurkishNumber(int number) {

		String soFar;

		if (number % 100 < 20) {
			soFar = NamesTurkish2[number % 100];
			number /= 100;
		} else {
			soFar = NamesTurkish2[number % 10];
			number /= 10;

			soFar = NamesTurkish[number % 10] + soFar;
			number /= 10;

		}

		if (number == 0)
			return soFar;
		if ( number == 1)
			return " yüz" + soFar;

		return NamesTurkish2[number] + " yüz" + soFar;
	}

	public String convertTurkishNumber(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "sýfýr";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int milyar = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int milyon = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int yüzBin = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int bin = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (milyar) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertLessThanOneThousandTurkishNumber(milyar) + " milyar ";
			break;
		default:
			tradBillions = convertLessThanOneThousandTurkishNumber(milyon) + " milyon ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (milyon) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousandTurkishNumber(milyon) + " milyon ";
			break;
		default:
			tradMillions = convertLessThanOneThousandTurkishNumber(milyon) + " milyon ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (yüzBin) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "bin ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousandTurkishNumber(yüzBin) + " yüzBin ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousandTurkishNumber(bin);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	public String convertLessThanOneThousandEnglishNumber(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = NamesEnglish2[number % 100];
			number /= 100;
		} else {
			soFar = NamesEnglish2[number % 10];
			number /= 10;

			soFar = NamesEnglish[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return NamesEnglish2[number] + " hundred" + soFar;
	}

	public String convertEnglishNumber(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertLessThanOneThousandEnglishNumber(billions) + " billion ";
			break;
		default:
			tradBillions = convertLessThanOneThousandEnglishNumber(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousandEnglishNumber(millions) + " million ";
			break;
		default:
			tradMillions = convertLessThanOneThousandEnglishNumber(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "one thousand ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousandEnglishNumber(hundredThousands) + " thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousandEnglishNumber(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}
}
