public class Teacher{
    // collection of teacher record 
            String firstName, lastName, teachID, email , address , contactNo; 


        public void setDetails()
        {
            firstName= "Ramhari" ;
            lastName= "Dhakal" ;
            email= "dhakalram05@gamail.com" ;
            teachID= "012" ;
            address= "kalanki,ktm" ;
            contactNo= "+977-9845622967" ;
        }

        public void teacherInfoDetails()
        {
            System.out.println("First name:" + firstName);
            System.out.println("Last name:" + lastName );
            System.out.println("Email:" + email);
            System.out.println("TeacherId:" + teachID);
            System.out.println("Address:" + address);
            System.out.println("ContactNO:" + contactNo);
        }  
        
    
    public static void main (String []args){
        Teacher teachObj = new Teacher();
        teachObj.setDetails();
        teachObj.teacherInfoDetails();
    }
}