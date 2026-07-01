import java.util.Scanner;
public class StackMenuProgram
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int stack[]=new int[5];
    int top=-1;
    int choice;
    do
    {
      System.out.println("\n---STACK MENU");
      System.out.println("1.Push");
      System.out.println("2.Pop");
      System.out.println("3.Peek");
      System.out.println("4.Display");
      System.out.println("5.Exit");
      System.out.println("Enter The Choice: ");
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:
          if(top==stack.length -1)
          {
            System.out.println("Stack OverFlow");
          }
          else
          {
            System.out.println("Enter Element: ");
            int data=sc.nextInt();
            top++;
            stack[top]=data;
            System.out.println("Element Pushed"); 
          }
          break;
          
          case 2:
            if(top==-1)
            {
              System.out.println("Stack Underflow");
            }
            else
            {
              System.out.println("Poped Element: "+stack[top]);
              top--;
            }
            break;

            case 3:
                if(top==-1)
                {
                  System.out.println("Stack is Empty");
                }
                else
                {
                  System.out.println("Peeked Element: "+stack[top]);
                }
                break;

            case 4:
                if(top==-1)
                {
                  System.out.println("Stack is Empty");
                }
                else
                {
                  System.out.println("Stack Elements: ");
                  for(int i=top;i>=0;i--)
                  {
                    System.out.println(stack[i]);
                  }
                }
                break;

            case 5:
                System.out.println("Program Exited");
                break;

            default:
                System.out.println("Invalid Choice");            
      }
    }while(choice !=5);
    sc.close();
  }
}