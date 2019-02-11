// Welcome to SpiderLabWeb
import java.util.*;

class Main {
  
  public static void main(String[] args) {
int a,b,c;
Scanner s =new Scanner(System.in);
System.out.println("enter the first number:");
a=s.nextInt();
System.out.println("enter the second number:");
b=s.nextInt();
System.out.println("enter the third number:");
c=s.nextInt();
  if(a<b && b<c)

  System.out.println("first number is large");
else if(a<b && a>c)

System.out.println("second number is large");

 else if(a>b && a<c) 
  
 System.out.println( "third number is large");
  
  
} }