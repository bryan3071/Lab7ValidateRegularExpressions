	package Lab7ValidateRegularExpressions;
	import java.util.Scanner;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
public class Lab7ValidateRegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isValidName2; //Build Spec 1
		String isValidEmail2; // Build spec 2
		String isValidPhonenum2; // Build spec 3
		String isValidDate2; // Build spec 4
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a valid name.");
		isValidName2 = scnr.nextLine();
		if (isValidName(isValidName2)) { // reference the method name below
			System.out.println("Is Valid");
		}else {
			System.out.println("Is Not Valid");
		}
		// Note the other three pieces below are similarly handled by methods
		
		System.out.println("Enter a valid date and use this format dd/mm/yyyy.");
		isValidDate2 = scnr.nextLine();
		if (isValidDate(isValidDate2)) {
		System.out.println("Is Valid");
		}else {
		System.out.println("Is Not Valid");
		}
		
		
		System.out.println("Enter a valid email address.");
		isValidEmail2 = scnr.nextLine();
		if (isValidEmail(isValidEmail2)) {
		System.out.println("Is Valid");
		}else {
		System.out.println("Is Not Valid");
		}
		
		
		System.out.println("Enter a valid phone number.");
		isValidPhonenum2 = scnr.nextLine();
		if (isValidPhonenum(isValidPhonenum2)) {
		System.out.println("Is Valid");
		}else {
		System.out.println("Is Not Valid");	
		}
		
		
		scnr.close();
		
		
	}
	
	private static boolean isValidName(String isValidName2) {
		boolean isValidName = true;
		if (isValidName2.matches("[A-Z][a-z]{0,30}$")) {
		return isValidName;
		}else {
			return false;
			//used this method for name handling
		}
	}
			
	private static boolean isValidEmail(String isValidEmail2) {	
		boolean isValidEmail = true;
		if (isValidEmail2.matches("([a-zA-Z0-9_\\.\\-\\+]{5,30})+\\@(([a-zA-Z0-9\\-]{5,10})+\\.)+([a-zA-Z0-9]{2,4})+$")) {
		return isValidEmail;
		}else {
		return false;
		// something@something.com
		// used this method for email handling
	}
	}
	
		
			private static boolean isValidPhonenum(String isValidPhonenum2) {	
				boolean isValidPhonenum = true;
				if (isValidPhonenum2.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")){
					return isValidPhonenum;
					}else {
						return false;
						//is going to produce (313)-123-4567
						// Used this method for phone number handling
			}
			}	
	private static boolean isValidDate (String isValidDate2) {
		boolean isValidDate = true;
		if (isValidDate2.matches ("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")){
			return isValidDate;
			}else {
		return false;
		// Used this method for date handling
			}
	}	
}


