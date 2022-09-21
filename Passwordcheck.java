package Day4;

/*
 *  wap to ask password from user and check if its == 12345 
 *  if yes then access allowed
 *  else retry max 3 times 
 *  after 3 times print card is block
 * 
 */
import java.util.*;

public class Passwordcheck {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int pass;
    int i=1;
  do {
	   
    System.out.println("enter password");
    pass= s.nextInt();
    
    if(pass==12345)
    {
    	System.out.println("access allowed");
    	break;
    }
	i++;
  }while(i<=3);//i=4
  
  
  if( i==4)   System.out.println("card is blocked");
  }

}
