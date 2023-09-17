import java.util.Scanner;

class Kcc
{
    int a,b,c,d;

    void display()
     {
        System.out.println("Enter a,b,c,d : ");
        try (Scanner s = new Scanner(System.in)) {
         a=s.nextInt();
           b=s.nextInt();
           c=s.nextInt();
           d=s.nextInt();
      }

     }

     void OperatorAnd()
     {
        System.out.println("(a>b) && (c>d) : " +((a>b) && (c>d)));
     }

     void OperatorOr()
     {
        System.out.println("(a>b) || (c>d) : " +((a>b) || (c>d)));
     }

     public static void main(String[] args)
     {
        Kcc o=new Kcc();
        o.display();
        o.OperatorAnd();
        o.OperatorOr();

     }
}