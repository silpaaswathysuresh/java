import java.util.*;
import java.util.Scanner;
class Main 
{
  public static void main(String[]args){
  int num;
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   num=sc.nextInt();
   if(num>0)
   System.out.println(num +" is positive");
   else if(num<0)
   System.out.println(num +" is negative");
   else
   System.out.println("it is zero");
}
}