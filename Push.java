import java.util.Scanner;
public class Push
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int stack[]=new int[5];
    int top=-1;
    System.out.println("Enter elelement to Push: ");
    int data=sc.nextInt();
    if(top==stack.length-1)
    {
      System.out.println("Stack Overflow");
    }
    else
    {
      top++;
      stack[top]=data;
      System.out.println("Pushed Element: "+stack[top]);
    }
  }
}