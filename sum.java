import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n,sum=0,i;
    Scanner src=new Scanner(System.in);
    System.out.println(" n : ");
    n=src.nextInt();

           for(i=0;i<=n;++i)
           { 
             sum =sum+i;
           }
System.out.println("sum:"+sum);
  }
}