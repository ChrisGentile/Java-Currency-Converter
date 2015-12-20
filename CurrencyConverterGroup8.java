
import java.util.Scanner;

public class CurrencyConverterGroup8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double initialAmount; // initial amount user enters to convert

		int startingChoice;
		int endingChoice;
		int counter = 0; // this counts the times the user keeps converting

		System.out.println("--Welcome to Currency Converter 1.0--");

		/*
		 * This do while loop keeps the program running so long as user does not
		 * push 11 to quit Also, the if statement just below this makes sure the
		 * program executes atleast once, before asking if user has more money
		 * to convert.
		 */

		do {
			counter++;
			if (counter > 1) {
				System.out.println("Do you have more money you wish to convert?(1=Yes/2=no)\n 1) Yes\n 2) No");
				
				int a = input.nextInt();
				
					if (a == 2) {
						System.out.println("Goodbye");
						System.exit(0); //exit program
					}
				}
			
			
			System.out.println("Choose your starting currency from following list");
			System.out.println("\tSelect your option: \n 1)  Start with American Dollar \n 2)  Start with Euro \n"
					+ " 3)  Start with British Pound   \n 4)  Start with Australian Dollar \n 5)  Start with Canadian"
					+ " Dollar \n 6)  Start with Singapore dollar \n 7)  Start with Swiss Franc \n 8)  Convert"
					+ " to Malaysian Ringgit \n 9)  Start with Japanese Yen \n 10) Start with Argentine Peso \n"
					+ " 11) Quit");
			startingChoice = input.nextInt();

			System.out.println("Enter the the amount of money you want to convert: ");
			initialAmount = input.nextDouble();

			System.out.println("Choose your ending currency from the previous list");
			System.out.println("\tSelect your option: \n 1)  Convert to American \n 2)  Convert to Euro \n"
					+ " 3)  Convert to British Pound \n 4)  Convert to Australian Dollar \n 5)  Convert to Canadian"
					+ " Dollar \n 6)  Convert to Singapore dollar \n 7)  Convert to Swiss Franc \n 8)  Convert"
					+ " to Malaysian Ringgit \n 9)  Convert to Japanese Yen \n 10) Convert to Argentine Peso");
			endingChoice = input.nextInt();

			//method takes the user's starting and ending currency along with the amount 
			//that is going to be converted
			FinalAmount(startingChoice, endingChoice, initialAmount);

		} while (startingChoice != 11); // when user enters 11, program is over

		input.close();

	} // end of main

	/**
	 * This method handles all the conversions with a series of if/else
	 * statements
	 * 
	 * @param startingCountry
	 * @param endingCountry
	 * @param startingAmount
	 */
	public static void FinalAmount(int startingCountry, int endingCountry, double startingAmount) {

		// these are all currencies used in this program
		double americanDollar, euro, pound, ausDollar, canDollar, franc, singDollar, peso, ringgit, yen;
		double exchangeRate;

		// American Dollars
		if (startingCountry == 1 && endingCountry == 2) {
			euro = 1.05869;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f USD(s), you will receive %.02f Euro(s).%n%n", startingAmount, exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 3) {
			pound = 1.50308;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f USD(s), you will receive %.02f Pounds(s).%n%n", startingAmount, exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 4) {
			ausDollar = .719313;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f USD(s), you will receive %.02f Australian Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 5) {
			canDollar = .747363;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f USD(s), you will receive %.02f Canadian Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 6) {
			singDollar = 1.05869;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f USD(s), you will receive %.02f Singapore Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 7) {
			franc = .969900;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f USD(s), you will receive %.02f Swiss Franc(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 8) {
			ringgit = .234691;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f USD(s), you will receive %.02f Malayasian Ringgit(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 9) {
			yen = .008143;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f USD(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 1 && endingCountry == 10) {
			peso = .101035;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f USD(s), you will receive %.02f Argentine Peso(s).%n%n", startingAmount,
					exchangeRate);
		}

		// Euro
		if (startingCountry == 2 && endingCountry == 1) {
			americanDollar = .94482;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Euro(s), you will receive %.02f USD(s).%n%n", startingAmount, exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 3) {
			pound = 1.41966;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Pounds(s).%n%n", startingAmount, exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 4) {
			ausDollar = .67952;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Australian Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 5) {
			canDollar = .70605;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Canadian Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 6) {
			singDollar = .66902;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Singapore Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 7) {
			franc = .91642;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Swiss Franc(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 8) {
			ringgit = .22152;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Malayasian Ringgit(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 9) {
			yen = .00762;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 2 && endingCountry == 10) {
			peso = .09723;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Euro(s), you will receive %.02f Argentine Peso(s).%n%n", startingAmount,
					exchangeRate);
		}
		// British Pound
		if (startingCountry == 3 && endingCountry == 1) {
			americanDollar = .6653;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 2) {
			euro = .70413;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 4) {
			ausDollar = 2.0895;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 5) {
			canDollar = .49723;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 6) {
			singDollar = .47112;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 7) {
			franc = .645323;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Swiss Franc(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 8) {
			ringgit = .156132;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Malayasian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 9) {
			yen = .00543;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 3 && endingCountry == 10) {
			peso = .06854;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f British Pound(s), you will receive %.02f Argentine Peso(s).%n%n",
					startingAmount, exchangeRate);
		}

		// Australian Dollars
		if (startingCountry == 4 && endingCountry == 1) {
			americanDollar = 1.3072;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 2) {
			euro = 1.4734;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 3) {
			pound = 1.5235;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f British Pound(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 5) {
			canDollar = 1.0394;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 6) {
			singDollar = .98452;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 7) {
			franc = 1.3438;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Swiss Franc(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 8) {
			ringgit = .32631;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Malayasian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 9) {
			yen = .01133;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 4 && endingCountry == 10) {
			peso = .14323;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Australian Dollars, you will receive %.02f Argentine Peso(s).%n%n",
					startingAmount, exchangeRate);
		}

		// Canadian Dollar
		if (startingCountry == 5 && endingCountry == 1) {
			americanDollar = 1.3352;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 2) {
			euro = 1.4162;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 3) {
			pound = 1.4235;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f British Pound(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 4) {
			ausDollar = .96212;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 6) {
			singDollar = .94742;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 7) {
			franc = 1.2973;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Swiss Franc(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 8) {
			ringgit = .31402;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Malayasian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 9) {
			yen = .010898;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 5 && endingCountry == 10) {
			peso = .13782;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Canadian Dollar(s), you will receive %.02f Argentine Peso(s).%n%n",
					startingAmount, exchangeRate);
		}

		// Singapore Dollar
		if (startingCountry == 6 && endingCountry == 1) {
			americanDollar = 1.4132;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 2) {
			euro = 1.4921;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 3) {
			pound = 1.4929;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f British Pound(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 4) {
			ausDollar = 1.5021;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 5) {
			canDollar = .84252;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 7) {
			franc = 1.0523;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Swiss Franc(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 8) {
			ringgit = 1.36882;
			exchangeRate = startingAmount / ringgit;

			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Malayasian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 9) {
			yen = .01147;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 6 && endingCountry == 10) {
			peso = .14542;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Singapore Dollar(s), you will receive %.02f Argentine Peso(s).%n%n",
					startingAmount, exchangeRate);
		}

		// Swiss Franc
		if (startingCountry == 7 && endingCountry == 1) {
			americanDollar = 1.0312;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 2) {
			euro = 1.09018;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 3) {
			pound = 1.5474;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f British Pound(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 4) {
			ausDollar = .74227;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 5) {
			canDollar = .770098;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 6) {
			singDollar = .730118;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 8) {
			ringgit = .242325;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Malayasian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 9) {
			yen = .00837;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Japanese Yen.%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 7 && endingCountry == 10) {
			peso = .106252;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Swiss Franc(s), you will receive %.02f Argentine Peso(s).%n%n", startingAmount,
					exchangeRate);
		}

		// Malaysian Ringgit
		if (startingCountry == 8 && endingCountry == 1) {
			americanDollar = 4.25519;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 2) {
			euro = 4.4992;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 3) {
			pound = 5.012;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f British Pound(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 4) {
			ausDollar = 3.0667;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 5) {
			canDollar = 3.1785;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 6) {
			singDollar = 3.01783;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 7) {
			franc = 4.1292;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Swiss Franc(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 9) {
			yen = .0345;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Japanese Yen.%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 8 && endingCountry == 10) {
			peso = .438453;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Malaysian Ringgit(s), you will receive %.02f Argentine Peso(s).%n%n",
					startingAmount, exchangeRate);
		}

		// Japanese Yen
		if (startingCountry == 9 && endingCountry == 1) {
			americanDollar = 123.025;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 2) {
			euro = 130.196;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 3) {
			pound = 184.282;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f British Pound(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 4) {
			ausDollar = 88.6148;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 5) {
			canDollar = 91.52;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Canadian Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 6) {
			singDollar = 87.22;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Singapore Dollar(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 7) {
			franc = 119.235;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Swiss Franc(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 8) {
			ringgit = 28.921;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Malaysian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 9 && endingCountry == 10) {
			peso = 12.6782;
			exchangeRate = startingAmount / peso;
			System.out.printf("For %.02f Japanese Yen, you will receive %.02f Argentine Peso(s).%n%n", startingAmount,
					exchangeRate);
		}

		// Argentine Peso
		if (startingCountry == 10 && endingCountry == 1) {
			americanDollar = 9.7072;
			exchangeRate = startingAmount / americanDollar;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f USD(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 2) {
			euro = 10.2704;
			exchangeRate = startingAmount / euro;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Euro(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 3) {
			pound = 14.573;
			exchangeRate = startingAmount / pound;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f British Pound(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 4) {
			ausDollar = 6.993;
			exchangeRate = startingAmount / ausDollar;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Australian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 5) {
			canDollar = 7.2949;
			exchangeRate = startingAmount / canDollar;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Canadian Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 6) {
			singDollar = 6.8807;
			exchangeRate = startingAmount / singDollar;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Singapore Dollar(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 7) {
			franc = 9.416;
			exchangeRate = startingAmount / franc;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Swiss Franc(s).%n%n", startingAmount,
					exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 8) {
			ringgit = 2.2821;
			exchangeRate = startingAmount / ringgit;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Malaysian Ringgit(s).%n%n",
					startingAmount, exchangeRate);
		} else if (startingCountry == 10 && endingCountry == 9) {
			yen = .07888;
			exchangeRate = startingAmount / yen;
			System.out.printf("For %.02f Argentine Peso, you will receive %.02f Japanese Yen(s).%n%n", startingAmount,
					exchangeRate);
		}

	}// end of FinalAmount

}// end of class
