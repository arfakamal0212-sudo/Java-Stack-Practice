import java.util.Scanner;
public class PopElement
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int top=-1;
    int stack[]=new int[3];
    System.out.println("Enter no.of Elements: ");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      top++;
      stack[top]=sc.nextInt();
    }
    if(top==-1)
    {
      System.out.println("Stack Underflow");
    }
    else
    {
      System.out.println("Poped Element: "+stack[top]);
      top--;
    }
  }
}