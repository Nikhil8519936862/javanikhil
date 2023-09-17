import java.util.Scanner;

class vvv 
{
    public static void main(String[] args) 
    {
        int arr[]=new int[5];
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0;i<5;i++)
            {
                System.out.println("enter the marks of student " +(i+1));
                arr[i]=s.nextInt();

            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]+ " ");
        } 

    } 
}
