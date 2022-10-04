/**@author jaden Laborete
 * @version 09/03/22
 * @description This program is designed to ask the user for an input 1-10. It has a lot of if statements printing 
 * out the number that the user inputed in and the roman numeral for that number. Its also designed to print an error message if you go above or below 1 and 10
 * it also prints out an error message if the user inputs a decimal.
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 
 * for int
 *
 */
public class NumRum {
	/**
	 * 
	 * @param args main
	 */



	public static void main(String[] args) {
//start scanner
		

		try (Scanner Keyboard = new Scanner(System.in)) {
			int yourNum = 0;

			System.out.print("Enter a WHOLE NUMBER 1-10 > ");
try {
yourNum = Keyboard.nextInt();
//scanner
}
catch(InputMismatchException e) {
   System.out.println("Enter whole numbers only");
}



//start of switch statements

switch(yourNum) {

case 1:
System.out.println("The roman numeral of 1 is : I");
break;

case 2:
System.out.println("The roman numeral of 2 is : II");
break;

case 3:
System.out.println("The roman numeral of 3 is : III");
break;

case 4:
System.out.println("The roman numeral of 4 is : IV");
break;

case 5:
System.out.println("The roman numeral of 5 is : V");
break;

case 6: 
System.out.println("The roman numeral of 6 is : VI");
break;

case 7:
System.out.println("The roman numeral of 7 is : VII");
break;

case 8:
System.out.println("The roman numeral of 8 is : VII");
break;

case 9:
System.out.println("The roman numeral of 9 is : IX");
break;

case 10:
System.out.println("The roman numeral of 10 is : X");
break;

default:
			System.out.println("Error, pick a whole number between 1-10");
			break;
//end of switch statements




					
				
			}
		}
	}

}

	

	


