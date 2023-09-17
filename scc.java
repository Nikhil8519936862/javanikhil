import java.util.Scanner;

class Scc
 {
    int a,b;

    void Arithmetic()
    {
        System.out.println("Enter a and b : ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        
        System.out.println("a+b : " +(a+b));
        System.out.println("a-b : " +(a-b));
        System.out.println("a*b : " +(a*b));
        System.out.println("a/b : " +(a/b));
        System.out.println("a%b : " +(a%b));
    }

    public static void main(String[] args)
    {
        Scc o1=new Scc();
        o1.Arithmetic();
    }
 }