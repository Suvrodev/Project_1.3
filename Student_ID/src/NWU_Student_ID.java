import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NWU_Student_ID {
    public static void main(String[] args)throws IOException {
        /**********************************************/
        Scanner ip=new Scanner(System.in);
        BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
        /**********************************************/
        /**********************************************/
        System.out.println("Welcome to NWU Students Information Page");
        /**********************************************/
        EEE_class ac=new EEE_class();
        Login_Class lg=new Login_Class();
        /**********************************************/
       while (true) {
          System.out.print("Press 1 To Login And Press 2 to Registration=");
         int RL = ip.nextInt();

         if (RL == 1) {
         boolean Login_Result = lg.login();
         if (Login_Result == true) {
             System.out.println("Login Successfully");
             while (true) {
                 System.out.print("\nWrite Department Name About that Department and L for Logout=");
                 String Department_Name = ipp.readLine();
                 if (Department_Name.equalsIgnoreCase("CSE")) {
                     CSE cse = new CSE();
                     System.out.println("Welcome to CSE Department");
                     System.out.print("\nPress 1 to Add Student, 2 to know details, 3 to Delete Account, 4 to know ID Holder, 5 to Replace Account=");
                     int showing = ip.nextInt();
                     if (showing == 1) {
                         cse.Add_Account();
                     } else if (showing == 2) {
                         cse.Details();
                     } else if (showing == 4) {
                         int Number_Of_Students = cse.Holder();
                         System.out.println("Number of Student in CSE Department=" + Number_Of_Students);
                     } else if (showing == 3) {
                         cse.DeletAccount();
                     } else if (showing == 5) {
                         cse.Replace();
                     }


                 } else if (Department_Name.equalsIgnoreCase("EEE")) {
                     System.out.println("Welcome to EEE Department");
                     //EEE eee=new EEE();

                     System.out.print("\nPress 1 to Add Student, 2 to know details, 3 to Delete Account, 4 to know ID Holder, 5 to Replace Account=");
                     int showing = ip.nextInt();
                     EEE_class eee = null;
                     if(showing==1){
                         System.out.print("Enter Name=");
                         String Name = ipp.readLine();
                         System.out.print("Enter ID Number=");
                         String ID_Number = ipp.readLine();
                         System.out.print("Enter Address=");
                         String Address = ipp.readLine();
                         System.out.print("Enter Department=");
                         String Department = ipp.readLine();
                         System.out.print("Enter CGPA=");
                         String CGPA = ipp.readLine();
                         System.out.print("Enter Your Semester=");
                         double Semester = ip.nextDouble();
                         System.out.print("Enter Active/Deactive Status=");
                         String Status = ipp.readLine();
                         System.out.println("ID has created Successfully");

                         ac.eee_class(Name,ID_Number,Address,Department,CGPA,Semester,Status);
                         
                     }
                     else if(showing==2){
                         ac.Details();
                     }
                     else if(showing==3){
                         ac.DeleteAccount();
                     }
                     else if(showing==4){
                         int Number_Of_Students = ac.Holder();
                         System.out.println("Number of Student in EEE Department="+Number_Of_Students);
                     }
                     else if(showing==5){
                         ac.Replece_Account();
                     }


                 } else if (Department_Name.equalsIgnoreCase("L")) {
                     break;
                 }
             }
         } else {
             System.out.println("See You Next Time");
         }

     } else if (RL == 2) {
         Register r = new Register();
         r.Resistered();
     }
 }
    }
 }
