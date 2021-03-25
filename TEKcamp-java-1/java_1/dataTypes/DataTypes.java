package java_1.dataTypes;

class DataTypes {

		int number = 2021;
		int yearOfBirth = 1977;
		int[] nums = {3,4,5,6,7,8,10,12};
		String movieName = "Meet The Parents";
		char male = 'm';
		long triplet = 3L;
		char female = 'f';
		float decimalVal = .0000000000001f;
		int halfByte = 0101;



	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs
		System.out.println("hello world");
		yearsToMonths();
		monthsToHours();
		daysToSeconds();
		centuriesToSeconds();
		dollarsToBitcoin();
		canDrive();
	}

	public static Object yearsToMonths() {
		//	convert years to minutes using appropriate data types for the inputs and the outputs, 2 years => 24 months
		int years = 2;
		int monthsMath = years * 12;
		System.out.println(monthsMath + " months");
			return monthsMath;
	}

	static void monthsToHours() {
		//	convert months to years using appropriate data types for the inputs and the outputs, 8 months => 17520 hours (should be 5744 hours)
		int months = 8;
		int hoursMath = (int) (months * 730.5);
			System.out.println(hoursMath + " hours");
	}

	static void daysToSeconds() {
		//	convert years to minutes using appropriate data types for the inputs and the outputs, 2 years => 17520 hours
		int days = 12;
		int secondsMath = days * 86400;
		System.out.println(secondsMath + " seconds");
	}

	static void centuriesToSeconds() {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds
		int centuries = 3;
		long secondsMath = centuries * 3155760000l;
		System.out.println(secondsMath + " seconds");
	}

	static void dollarsToBitcoin() {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars  3.1556952 x 10^9 Seconds
		int dollars = 100000;
		int bitcoinMath = dollars / 49169;
		int bitcoinMathDeci = dollars % 49169;

		System.out.println(bitcoinMath + "." + bitcoinMathDeci + " bitcoins");
	}

	static void canDrive() {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		int driveAge = 16;
		int userAge_1 = 14;
		int userAge_2 = 21;
		if (userAge_1 > driveAge) {
			System.out.println("user one can drive");
		} else {
			System.out.println("user one can't drive");
		}
		if (userAge_2 > driveAge) {
			System.out.println("user two can drive");
		} else {
			System.out.println("user two can't drive");
		}
	}

	String[] getDataTypes(int num1, boolean bool1, long long1) {
//		get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.
		return new String[]{null,null,null};
	}

}