import java.util.Scanner;
public class ParanthesesCheck
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Parantheses: ");
    String s=sc.nextLine();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(')
      {
        count++;
      }
      else if(s.charAt(i)==')')
      {
        count--;
      }
    }
    if(count==0)
    {
      System.out.println("Balanced");
    }
    else{
      System.out.println("Not Balanced");
    }
  }
}