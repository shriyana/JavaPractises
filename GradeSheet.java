public class GradeSheet{
    //collection of student  gradeshreet
    float marks; 

    public void displayResult()
        { 
             //logical operator
             //90-100 A+
             //80-90 A
             //70-80 B+
             //60-70 B

            if(marks> 90 && marks <=100)
            {
                System.out.println("Marks;" + marks);
                System.out.println("Grade: A+");

            }

            else if (marks > 80 && marks <=90)
            {
                System.out.println("Grade: B+ ");

            }

            else if (marks > 70 && marks <=80 )
            {
                System.out.println("Grade: C ");
            }
            else
            {
                    System.out.println("fail");
            }
        }

        public static void main (String []args){
            GradeSheet gradeObj = new GradeSheet();
            gradeObj.displayResult();
       
        }

        
}
