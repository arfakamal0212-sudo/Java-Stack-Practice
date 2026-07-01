import java.util.Scanner;
public class ReverseString
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String: ");
    String s=sc.nextLine();
    int top=-1;
    char stack[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
      top++;
      stack[top]=s.charAt(i);
    }
    System.out.println("Reversed String: ");
    while(top!=-1)
    {
      System.out.print(stack[top]);
      top--;
    }
  }
}