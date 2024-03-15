public class LoopDemo
{
    //int i ;  // class scope
    void showWhileLoop()
    {
        int i = 1 ;
        while( i < 10 )
            System.out.println("Loop: " + i);
            i ++;  // i = i + 1

        System.out.println("Loop Ended:"+ i);
    }

    void showForLoop ()
    {
        System.out.println("For Loop Started:");
        //for (initialization; condition; increment/decrement)
        int i = 0;
       // for (i=0; i < 5; i++)
             // int i=5 ;
            //while(i < 5)
    }

    void showDoWhileLoop(){
        int i = 1;
        do
        {
            System.out.println("Do while Loop: " + i);
                i++ ;
        }while(i <= 10) ;
       

        // int i = 0;
        // for (i=0; i < 5; i++)
        //     {
        //         System.out.println("Loop" + 1);
           
        //     } 
        // {

        //     System.out.println("Loop Ended: "  +1);

        // }
    }

    
    public static void main (String []args)
    {
        LoopDemo loopObj = new LoopDemo();
        //loopObj.showWhileLoop();
        //loopObj.showForLoop ();
        loopObj.showDoWhileLoop();
    }


}

