public class Emlopee {
    String empId, name;
    float salary; // class scope

    //contructor is special function with no return type and some name of class
    //it is implicitily called when objects is created 
    /**public Employee (){/ default constructor 
     empId = "E-101"; 
     name = "seeta";
     salary = 45000,0F;
   
}
// parameterized constructor
public Employee (String empId, String name, float salary) {
    This.empId = empId ;
    this.name = name ;
    this.salary = salary ;

    //1) Encapsulation      2)Abstraction   3)polymorphism      4)Inheritence
    //function overloading 
    // this is an example of polymorphism of an object (OOP)*/


}
 public void setEployeeDetailes(){
    // setting the values for emplyee 
    empId = "E-101";
    name = "seeta";
    salary = 45000.0F;

 }
 public void setEployeeDetailes(String empId, String name,float salary){
    //setting the values for employee
    this.empId = empId;
    this.name = name;
    this.salary =salary;

 }

 public void displayEmlopyeeDetails(){
    System.out.println("Employee Id: " + this.empId);
    System.out.println("Employee Name:" + name);
    System.out.println("Salary : " + salary);
 }
  // main method
  public static void main(String[]args){
    Emlopee emp =new Emlopee(); // object is created
    emp.setEployeeDetailes();
    emp.displayEmlopyeeDetails();
    System.out.println("########## \n ################");

    emp.setEployeeDetailes("E-103", "Hari", 45000.5F );
    emp.displayEmlopyeeDetails();
    //employee emp2 = new Employee ("E-102", "Hari", 45000.45F);
    //emp2. displayEmployeeDetails();
    


  }