public class ArgsDemo {

    //main method
    public static void main (String [] args){

        /**System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        **/

        int len = args.length;
        for(int i=0; i<len; i++){
            System.out.println(args[i]);


           // for each loop
            for (String x : args){
                System.out.println(x);
            }
        }
    }
    
}
