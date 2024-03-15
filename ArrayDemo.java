public class ArrayDemo{
    //int mark []
    
    int [] marks = { 34, 67, 32, 34, 21};
    String name[] ={"ram", "hari", "shyam", "geeta", "seeta",}; 
    String address[] = {"kathamandu", "pokhara", "sindhuli", "morang","lalitpur"};
    int age [] = { 23, 44, 21, 20, 24,};



    public void displayArray(){
        System.out.println("Name \tMarks \t\tAddress \tAge");
        for(int i = 0 ; i < 5; i++)
        {
            
            System.out.print(name[i] +"\t");
            System.out.print(marks[i] + "\t");// index
            System.out.print(address[i] +"\t\t");
            System.out.println(age[i]);

        }

    }
    public static void main(String[]args){
        ArrayDemo arrObj = new ArrayDemo();
        arrObj.displayArray();
    }
}