import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String string=sc.nextInt();
        boolean numeric=true;
        try
        {
           double num=Double.parseDouble(string);
        }catch(NumberFormatException e) {
          numeric=false;
       }
      if(numeric)
         System.out.println(string +"is a number");
      else
         System.out.println(string +"is not a number");
   }
}
