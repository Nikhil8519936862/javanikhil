import java.util.Scanner;

class Gcc
{
    public static void main(String[] args)
    {
        int percentage;
        System.out.println("ENTER PERCENTAGE : ");
        Scanner s=new Scanner(System.in);
        percentage=s.nextInt();
        System.out.println((percentage>90) ? ("EXCELLENT : GRADE A") : ("BAD : GRADE B") );

}
}