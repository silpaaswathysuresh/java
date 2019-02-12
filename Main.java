import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int p,q,r;
    Scanner nr=new Scanner(System.in);
    System.out.println("enter the  value of p:");
    p=nr.nextInt();
    System.out.println("enter the  value of q:");
   q=nr.nextInt();
    System.out.println("enter the  value of r:");
    r=nr.nextInt();

    if(p>q && q<r)
    {
      System.out.println("p is large");
       }
  else if(p<q && q>r)
  {

  System.out.println("q is large");
  }
   else if(p<r && p>q )
  
  {
    System.out.println("r is large");
  }
  else 
  {
     System.out.println("not distinct numbers");
  }
} }