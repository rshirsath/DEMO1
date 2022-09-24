package Day2;
//wap to ask employee details from user 
import java.util.Scanner;
//import java.lang.*;

public class Employee {

	public static void main(String[] args) {

	//string is class in java.lang package
    String name;
    char  gender;
    int age;
    float salary;
    Scanner s= new Scanner(System.in);
    System.out.println("enter name");
    //name= s.next();          // will not accept spaces 
    name= s.nextLine();        // will allow spaces in string 
    System.out.println("Enter age");
    age=s.nextInt();
    System.out.println("Enter salary");
    salary=s.nextFloat();
    System.out.println("enter gender");
    gender= s.next().charAt(0);  // asking string from user and 
                                 //extracting first character from 
                                //string and storing it in gender variable 
   System.out.println("Name="+  name);
   System.out.println("Age="+ age);
   System.out.println("Salary="+ salary);
   System.out.println("gender"+gender);
    
	}

}



