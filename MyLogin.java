//import java.util.*;

import java.util.Scanner;

public class MyLogin {

    public void displayInfo()
    {
        Scanner scn = new Scanner (System.in); //Scanner (inputstrem )
        //System.in = taking input frrom keybord 

        System.out.println("Enter Name");
        String name = scn.nextLine();
        System.out.println("Enter Age");
        int age = scn.nextInt();
        System.out.println("Enter Marks:");
        float marks = scn.nextFloat();


        System.out.println("*************\n**********");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Enter Marks:" + marks);

        if (marks >=40 ){
            System.out.println("Passed");
        
        }
        else{
            System.out.println("Failed");

        }
    }
        public static void main (String[] args){
            MyLogin obj =new MyLogin();
            obj.displayInfo();

        }
        
    }
