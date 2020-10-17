import java.util.*;
public class email {

	private String firstName;
	private String lastName;
	private String password; 
	private int defaultPasswordLength = 8;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "ayexcompany";
	
	// constructor to receive the first name and last name	
	
	public email (String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		// call a method asking for the department - return the department.
		this.department = setDepartment();
		
		// call a method to create a random passwords - return the random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password is: " + password);
		
		// combine elements to generate email
		
		email = firstName.toLowerCase() +"."+ lastName.toLowerCase() + "@" + department +"."+ companySuffix;
			}
	
		//Ask the department
	private String setDepartment() {
		
		System.out.println("New worker: "+firstName+". "+"department codes:\n1 for Sales \n2 for Development \n3 for Accounting\n0 fot none\nDepartment is:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice ==1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "none";
		}		
	}
	
		//Generate a random password
		private String randomPassword(int length) {
			
			String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for(int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i]= passwordSet.charAt(rand);
			}
			return new String(password);
		}
	
		//Set the mailbox capacity
		
		public void setMailCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		//Set the alternate email
		
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
		// Change the password
		public void setNewPassword(String password) {
			this.password = password;
		}
		   
		public int getMailCapacity() { return mailboxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getNewPassword() { return password;}
	
		//displaying the user informations
		public String dispalyInfo() {
			return "DISPALY NAME: " + firstName + " " + lastName + "" +
					"\nCOMPANY EMAIL: " + email + " "  +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb"; 
					
		}
}
