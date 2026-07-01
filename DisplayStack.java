import java.util.Scanner;
public class Display
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int top=-1;
    int stack[]=new int[5];
    System.out.println("Enter no.of Elements: ");
    int n=sc.nextInt();
    System.out.println("Elements Are: ");
    for(int i=0;i<n;i++)
    {
      top++;
      stack[top]=sc.nextInt();
    }
    System.out.println("Stack Elements: ");
    for(int i=top;i>=0;i--)
    {
      System.out.println(stack[i]);
    }
  }
}