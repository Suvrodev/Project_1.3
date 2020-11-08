import java.io.*;
import java.util.Scanner;

public class Register {
    Scanner ip=new Scanner(System.in);
    BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
    void Resistered()throws IOException {
        System.out.println("Welcome To Resister Form");
        try {
            FileWriter fw = new FileWriter("E:\\Register.txt", true);
            System.out.print("Enter Username=");
            String User_Name = ipp.readLine();

            System.out.print("Enter Password=");
            String Password=ipp.readLine();
            System.out.print("Confirm Your Password=");
            String C_F=ipp.readLine();
            if(Password.equalsIgnoreCase(C_F)){
                fw.write(User_Name + "\n");
                fw.write(Password+"\n");
                System.out.println("Resistered Successfully");
            }
            else {
                System.out.println("Password Not Matched");
            }

            fw.close();
        }catch (Exception e){
            System.out.println("Problem="+e);
        }
    }
}
