import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int p,q,r;
    Scanner er=new Scanner(System.in);
     p=er.nextInt();
     q=er.nextInt();
     r=er.nextInt();
  if(p>q && q>r)
    {
    System.out.println(+p+" is large");
    }
     else if(p<q && q>r)
    {
    System.out.println(+q+" is large");
  }
else if(p>q && p<r)
    {
    System.out.println(+r+" is large");
  }
  
    } }