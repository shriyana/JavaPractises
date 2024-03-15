public class BICT implements IProgram
 {
    String id, title, description;
    int duration;

    public BICT(){
    duration = 8;

    }

@Override

//overriding
public void setDetails(String id, String title, String description){
    this.id =id;
    this.title = title;
    this.duration = 8;


}
@Override
//define the method that are declared in interface 
public  void displayDetails(){
System.out.println("Program ID :" + id);
System.out.println("Title:" + title);
//System.out.println("duration :" + id);
//others
}
public void displayduration(){
    System.out.println("Duration:" + duration);
}
public static void main(String[] args) {
    BICT bictObj = new BICT()
    
}

public void displayDetails(){

}
}
