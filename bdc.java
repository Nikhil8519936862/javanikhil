
class Bdc
{
    void displaY1()
    {
        System.out.println("I LIKE DOSA");
    }

    void displaY2()
    {
        System.out.println("I LIKE PURI");
    }  

    public static void main(String[] args)
    {
        Bdc obj1=new Bdc();
        obj1.displaY1();
        obj1.displaY2();

        L obj2=new L();
        obj2.displaYDetails();
    }

}

class L
{
    void displaYDetails()
    {
        System.out.println("I LIKE BIRYANI");
    }

}