import java.util.Scanner;

class Bcc 
{
    int marks1,marks2,marks3,marks4;

    void sum()
    {
        System.out.println("Enter marks1,marks2,marks3,marks4 : ");
        Scanner sc=new Scanner(System.in);
        
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
        marks4=sc.nextInt();
        int Total = marks1+marks2+marks3+marks4;

        System.out.println("Sum of four numbers is " +Total);

    }

    public static void main(String[] args)
    {
        Bcc obj=new Bcc();
        obj.sum();
    }

}
