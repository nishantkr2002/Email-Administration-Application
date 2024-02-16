package emailapp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String Email;
	private int mailboxCapacity=100;
	private int defaultpassowordlength=10;
	private String altEmail;
	private String companySuffix="mrfcompany.com";
	
//	constructor to receive the firstName and lastName
	public email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created:"+this.firstName+" "+this.lastName);
		
//		calling method department to return department name
		this.department=setDepartment();
		System.out.println("YOUR DEPARTMENT: "+this.department);
		
//		calling method random password generator to return password
		this.password=randomPassword(defaultpassowordlength);
		System.out.println("YOUR PASSWORD: "+ this.password);
		
//		combine elements to form an email
		Email=firstName.toLowerCase()+ "." +lastName.toLowerCase()+"@"+department+ "." +companySuffix;
//		System.out.println("your email is:"+ Email);
	}
	
//	Asking for department
	private String setDepartment() {
		System.out.print("Enter the Department\n1 for sale\n2 for Developement\n3 for accounting\n0 for none\n Emter your code:");
		Scanner in=new Scanner(System.in);
		int deptChoice=in.nextInt();
		if(deptChoice==1) {return "sales";}
		if(deptChoice==2) {return "dev";}
		if(deptChoice==3) {return "accounting";}
		else {return "";}
		
	}
//	generate random password
	private String randomPassword(int length) {
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$#%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password);	
	}
	
//	set methods
	
//	to set capacity of mailbox of size length
	public void setmailBoxCapacity(int capacity) {
		this.mailboxCapacity= capacity;
	}
	
//	to set an alternate email id
	public void setAlternateEmail(String alternateEmail) {
		this.altEmail=alternateEmail;
	}
	
//	to change the password 
	public void changePassword(String password) {
		this.password=password;
		
	}
	
//	get methods
	public int getmailboxCapacity(){
		return mailboxCapacity;
	}
	public String getalternateEmail() {
		return altEmail;
	}
	public String getChangedPassword() {
		return password;
	}
	
//	method to show all the data
	public String showInfo() {
		return "DISPLAY NAME :"+firstName+" "+lastName+
				"\nCOMPANY EMAIL :"+Email+
				"\nMAILBOX CAPACITY:"+ mailboxCapacity+"mb";
	}
	
	
	
	
    
}
