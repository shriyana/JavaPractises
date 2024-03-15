public class Calculation{
    public void add(float x,float y )
    { 
        float z= x + y;
        System.out.println("Addition: " +z );
    }

        public void sub(float x,float y )
    { 
        float z= x - y;
        System.out.println("subtract: " + z);
    }
 
           public void mul(float x,float y )
    { 
        float z= x * y;
        System.out.println("multiply: " + z); 
    }

             public void div(float x,float y )
    { 
        float z= x * y;
        System.out.println("divide: " + z); 
    }


    public static void main (String [] args)
    {
        Calculation cal =new Calculation();
        cal.add( 23.5F, 78.2f);
         cal.sub( 85.5F, 64.2f);
          cal.mul( 5.5F, 4.2f);
            cal.div( 105.5F, 10.2f);
    }
}