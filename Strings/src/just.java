import java.util.Scanner;

public class just
{
    public static void main(String[] args) {
        operation();
    }
    public static void operation(){
      Scanner s=new Scanner(System.in);
      int a,b;
        char c;
        do {
           c=s.next().charAt(0);

          switch (c){

              case '+':
                   a=s.nextInt();
                   b=s.nextInt();
                   operation();
                  System.out.println(a+b);
                  break;
              case '-':
                   a=s.nextInt();
                   b=s.nextInt();
                   operation();
                  System.out.println(a-b);
                  break;
              case '/':
                  a=s.nextInt();
                  b=s.nextInt();
                  operation();
                  System.out.println(a/b);
                  break;
              case '*':
                  a=s.nextInt();
                  b=s.nextInt();
                  operation();
                  System.out.println(a*b);
                  break;
              case 'X' | 'x':
                  break;

              default:
                  System.out.println("Invalid operation .try again");
                  break;
          }
      }while (c!='x' && c!='X');
      }

}
