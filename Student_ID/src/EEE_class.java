import java.io.*;
import java.util.Scanner;

public class EEE_class extends EEE {
    Scanner ip=new Scanner(System.in);
    BufferedReader ipp=new BufferedReader(new InputStreamReader(System.in));
    double Semester;
    public static int Number=0;
    public static int t_a_c=0;
    public void eee_class(String Name, String ID_Number, String Address, String Department, String cGPA,double Semester, String Status) {
        this.Semester=Semester;
        t_a_c++;
        try {
            FileWriter fw = new FileWriter("E:\\Student_ID_EEE.txt", true);
            fw.write(Name+"\n"+ID_Number+"\n"+Address+"\n"+Department+"\n"+cGPA+"\n"+Semester+"\n"+Status+"\n");

            fw.close();
        }catch (Exception e){
            System.out.println("Problem="+e);
        }
    }
    void Details() {
        try {
            File file = new File("E:\\Student_ID_EEE.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number=");
            String IDNUMBER = ipp.readLine();

            while (sc.hasNextLine()) {
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();

                if (ID_NUMBER.equalsIgnoreCase(IDNUMBER)) {
                    System.out.println("Name=" + NAME + "\nID=" + ID_NUMBER + "\nAddress=" + ADDRESS + "\nDepartment=" + DEPARTMENT + "" +
                            "\nCGPA=" + cGPA + "\nSemester=" + SEMESTER + "\nStatus=" + STATUS+"\n");
                }

            }

        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }
    }
    int Holder() {
        try {
            File file = new File("E:\\Student_ID_EEE.txt");
            Scanner sc = new Scanner(file);
            Number = 0;
            while (sc.hasNextLine()) { 
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();
                Number++;
            }
            // System.out.println("Number Of Students="+Number);

        } catch (Exception ee) {
            //  System.out.println("Problem=" + ee);
        }
        return Number;
    }
    void DeleteAccount() throws IOException {
        String Full_Info = "";
        try {
            File file = new File("E:\\Student_ID_EEE.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number Which ID do you want to delete=");
            String IDNUMBER = ipp.readLine();

            while (sc.hasNextLine()) {
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();

                if (!(ID_NUMBER.equalsIgnoreCase(IDNUMBER))) {
                    Full_Info += NAME + "\n" + ID_NUMBER + "\n" + ADDRESS + "\n" + DEPARTMENT + "\n" + cGPA + "\n" + SEMESTER + "\n" + STATUS + "\n";

                }
            }
            System.out.print("ID " + IDNUMBER + " has Deleted Successfully");
        } catch (Exception e) {
            //  System.out.println("Problem=" + e);
        }

        try {
            FileWriter fw = new FileWriter("E:\\Student_ID_EEE.txt");
            fw.write(Full_Info);
            fw.close();

        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }
    }
void Replece_Account() {
        String Full_Info = "";
        try {
            File file = new File("E:\\Student_ID_EEE.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number Which ID do you want to Replace=");
            String IDNUMBER = ipp.readLine();

            while (sc.hasNextLine()) {
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();

                if (!(ID_NUMBER.equalsIgnoreCase(IDNUMBER))) {
                    Full_Info += NAME + "\n" + ID_NUMBER + "\n" + ADDRESS + "\n" + DEPARTMENT + "\n" + cGPA + "\n" + SEMESTER + "\n" + STATUS + "\n";
                } else {
                    System.out.print("Write Your Name=");
                    String Namee = ipp.readLine();
                    System.out.print("Enter Your ID=");
                    String IDd = ipp.readLine();
                    System.out.print("Enter Address=");
                    String Addresss = ipp.readLine();
                    System.out.print("Your Department=");
                    String Departmentt = ipp.readLine();
                    System.out.print("Enter Your CGPA=");
                    String CGPAa = ipp.readLine();
                    System.out.print("Enter Your semester=");
                    double semesterr = ip.nextDouble();
                    System.out.print("Enter Your Active Status=");
                    String A_S = ipp.readLine();
                    Full_Info += Namee + "\n" + IDd + "\n" + Addresss + "\n" + Departmentt + "\n" + CGPAa + "\n" + semesterr + "\n" + A_S + "\n";
                }

            }
        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }

        System.out.print(Full_Info);
        System.out.println("ID Replaces Successfully");
        try {
            FileWriter fw = new FileWriter("E:\\Student_ID_EEE.txt");
            fw.write(Full_Info);
            fw.close();

        } catch (Exception e) {
            //System.out.println("Problem="+e);
        }
    }

}
