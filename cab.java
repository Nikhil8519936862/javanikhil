
class Cab
{
    int marks1=100;
    int marks2=200;
    static float percentage = 89.99f;

    void sum()
    {
        int Total;
        Total= marks1+marks2;
        System.out.println("Total is " +Total);
    }

    public static void main(String[] args)
    {
        Cab obj=new Cab();
        obj.sum();
        System.out.println("percentage is " +percentage);
        boolean state = true;
        System.out.println("state is " +state);
    }
}