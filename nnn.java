import java.util.Scanner;

class Nnn
{
    public static void main(String[] args)
    {
       int i,n;
       System.out.println("ENTER VALUE N : ");
       try (Scanner s = new Scanner(System.in)) {
        n=s.nextInt();
           i=0;
           while (i<n)
           {
            System.out.println(i);
            String name;
            System.out.println("name is : ");
            name=s.next();
            System.out.println("name :" +name);

            i++;

           }
    }
       System.out.println("THANK YOU");
}

}