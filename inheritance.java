

    class Calc
    {
        public int add(int n1,int n2)
        {
            return n1+n2;
        }

        public int sub(int n1,int n2)
        {
            return n1-n2;
        }
    }    

    class AdvCalc extends Calc
    {
        public int mul(int n1,int n2)
        {
            return n1*n2;
        }

        public int div(int n1,int n2)
        {
            return n1/n2;
        }
    }
    
     class VeryAdvCalc extends AdvCalc
    {
        public double pow(int n1, int n2)
        {
            return Math.pow(n1, n2);

        }

    }   
    class Inheritance   
    {
   
   
        public static void main(String[] args) 
        {
                    VeryAdvCalc obj=new VeryAdvCalc();
                    int r1= obj.add(3, 4);
                    int r2=obj.sub(5, 4);
                    int r3=obj.mul(6, 4);
                    int r4=obj.div(7, 4);
                    double r5=obj.pow(4, 4);    
                    
                    
                    System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
            }
    
}
