import java.util.*;
import java.util.Scanner;
class Main 
{
  public static void main(String[]args){
  int num;
  Scanner rd=new Scanner(System.in);
   System.out.println("enter the number");
   num=rd.nextInt();
 if(num%2==0)
  System.out.println(num+"is even");
  else
 System.out.println(num +"is odd");
  }
 }