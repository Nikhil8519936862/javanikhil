import java.util.Scanner;

class Lll 
{
    /**
     * @param args
     */
    public static void main(String[] args)  
    {
        int[][] arr=new int[2][3];
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.println("please enter element at row = " +(i+1) + "and a column :" +(j+1));
                    arr[i][j]=s.nextInt();
                    
                }
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print( arr[i][j] + " ");
            
            }
           
            System.out.println(" ");

        }
    }    
}
