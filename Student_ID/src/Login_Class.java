import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Login_Class {
    Scanner ip=new Scanner(System.in);
    BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
    private String ID="Suvrodev", Password="abc123";

    boolean login()throws IOException {
        System.out.println("Login Here");
        int count=3;
        while (count>=1){
            File file = new File("E:\\Register.txt");
            Scanner sc = new Scanner(file);

            System.out.print("Enter Your User ID=");
            String USER_ID=ipp.readLine();
            System.out.print("Enter Your Password=");
            String USER_PASSWORD=ipp.readLine();
            while (sc.hasNextLine()) {
                String UN=sc.nextLine();
                String  PS=sc.nextLine();
                if(UN.equalsIgnoreCase(USER_ID) && PS.equalsIgnoreCase(USER_PASSWORD)){
                    return true;
                }
            }
            if(USER_ID.equalsIgnoreCase(ID) && USER_PASSWORD.equalsIgnoreCase(Password)){
               return true;
            }
            else {
                count--;
                System.out.println("Invalid Your User ID or Password....Please Try Again ("+ count+") Times");
            }
        }
        return false;

    }

}
