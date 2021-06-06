/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 12 - Computing Simple Interest

Computing simple interest is a great way to quickly figure out whether an investment has value. It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

Example Output

Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.

Constraints

Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.

Challenges

Ensure that the values entered for principal, rate, and number of years are numeric and that the program will not let the user proceed without valid inputs.
Alter the program to use a function called calculateSimpleInterest that takes in the rate, principal, and number of years and returns the amount at the end of the investment.
In addition to printing out the final amount, print out the amount at the end of each year.

 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String str1 = in.nextLine();
        double principal = Double.parseDouble(str1);

        System.out.print("Enter the rate of interest: ");
        String str2 = in.nextLine();
        double rate = Double.parseDouble(str2);

        System.out.print("Enter the number of years: ");
        String str3 = in.nextLine();
        double years = Double.parseDouble(str3);

        double investment = principal*(1+((rate/100)*years));
        BigDecimal investmentFormat = new BigDecimal(investment);
        BigDecimal displayVal = investmentFormat.setScale(2, RoundingMode.HALF_EVEN);

        System.out.print(String.format("After %.0f years at %.1f%%, the investment will be worth $%.2f",years,rate,investmentFormat));




    }
}
