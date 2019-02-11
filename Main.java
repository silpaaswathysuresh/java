// Welcome to SpiderLabWeb
import java.util.*;

class Main {
  
  public static void main(String[] args) {
int a,b,c;
Scanner s =new Scanner(System.in);
System.out.println("enter the value of a:");
a=s.nextInt();
System.out.println("enter the svalue of b:");
b=s.nextInt();
System.out.println("enter the value of c:");
c=s.nextInt();
  if(a<b && b<c)

  System.out.println("a large");
else if(a<b && a>c)

System.out.println("bis large");

 else if(a>b && a<c) 
  
 System.out.println( "c is large");
  
  
} }