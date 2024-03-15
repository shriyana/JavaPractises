public abstract class OrgEmployee 
{

    String id, name, email;
    float salary;

    public void setDetails(String id, String name, String email, float salary)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        

    }

    public abstract void displayDetails();

    
      public static void main(String[] args) {
        //OrgEmployee emp = new OrgEmployee(); 
            
            //}
        
            
 }
}

    

