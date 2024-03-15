public class MarketingEmployee extends OrgEmployee { //inheriting

    public void setDetails(String id, String name, String email, float salary){
        System.out.println("setting the attributes values....");
        super.setDetails(id, name, email, salary);

    }

    public void dispayEmlopeeDetails(){
        System.out.println("Employee Id:" + id);
        //System.out.println("Employee Name" + name);
        System.out.println("Salary" + salary);

    }
    @Override
    public void displayDetails(){
        //write code
        System.out.println("Displaying the attributes values....");
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Email: " + email);
        System.out.println("Salary: " + salary);
    }

    //main method
    public static void main (String[] args){
        MarketingEmployee emp = new MarketingEmployee();//object is created
        //emp.setEmployeeDetails();
        emp.setDetails("E-01", "Ram", "shreeyana@gmail.com", 45000F);
        emp.displayDetails();

    }
    
}
