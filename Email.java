package email;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private int mailboxCapacity=500;
private int defaultpasswordLength=10;
private String companySuffix="aeycompany.com";

public Email(String firstName,String lastName)
{
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("EMAIL CREATED:"+this.firstName+" "+this.lastName);
	
	this.department=setDepartment();
	System.out.println("Department:"+this.department);
	
	this.password=randomPassword(defaultpasswordLength);
	System.out.println("your password is:"+this.password);
	
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	System.out.println("Your email id generated is:"+email);
	
	//this.alternateEmail=setAlternateEmail(firstName+lastName);
}

 private String setDepartment()
 {
	 System.out.println("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
	 Scanner in =new Scanner(System.in);
	 int depChoice=in.nextInt();
	 if(depChoice==1)
	 {
		 return"sales";
	 }
	 else if(depChoice==2)
	 {
		 return"dev";
	 }
	 else if(depChoice==3)
	 {
		 return "acct";
	 }
	 else
	 {
		 return"";
	 }
}
 
 private String randomPassword(int length)
 {
	 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	 char[] password=new char[length];
	 for(int i=0;i<length;i++)
	 {
		int rand=(int) (Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	 }
	 return new String(password);
 }

 public String showInfo()
 {
	 System.out.println("***************************************************");
	 System.out.println("the detailed information of the email created is:-->");
	 return "DISPLAY NAME:"+firstName+" "+lastName+
			 "\nCOMPANY EMAIL:"+email+
			 "\nMAILBOX CAPACITY:"+mailboxCapacity+"mb";
 }
 

}
