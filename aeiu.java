import java.util.*;
import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
int i=0;
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println("vowel");
else if(ch>='a'&& ch<='z')
System.out.println("consonant");
else
System.out.println("invalid");

  }
}
