public class Student{
    // collection of student record 
            String firstName, lastName, stuID, email , address ,grade, contactNo;
            float age, marks ; 


        public void setDetails()
        {
            firstName= "Shriya" ;
            lastName= "Bayalkoti" ;
            email= "mailto:shreeyana05@gamail.com" ;
            stuID= "012" ;
            address= "kalanki,ktm" ;
            grade= "sem 5th 2028" ;
            contactNo= "+977-9845622967" ;
            age= 22.11F; 
            marks= 83.6F ;
         

        }

        public void marksResult(){
            // logical operater 
            if (marks >=50){
               System.out.println("passed"); 
           
             }
                else{
             System.out.println("faild");
                }
        }

        public void studentInfoDetails()
        {
            System.out.println("First name:" + firstName);
            System.out.println("Last name:" + lastName );
            System.out.println("Email:" + email);
            System.out.println("StutudentId:" + stuID);
            System.out.println("Address:" + address);
            System.out.println("Grade:" +grade);
            System.out.println("ContactNO:" + contactNo);
             System.out.println("Age:" + age);
            
        }  
        
    
    public static void main (String []args){
        Student stdObj = new Student();
        stdObj.setDetails();
        stdObj.studentInfoDetails();
        stdObj.marksResult();
    }
}