import java.io.*;
import java.util.Scanner;

public class CSE {
    Scanner ip = new Scanner(System.in);
    BufferedReader ipp = new BufferedReader(new InputStreamReader(System.in));
    static int Number = 0;
    

    void Add_Account() throws IOException {
        try {

            FileWriter fw = new FileWriter("E:\\Student_ID.txt", true);
            System.out.print("Enter Name=");
            String Name = ipp.readLine();
            fw.write(Name + "\n");
            System.out.print("Enter ID Number=");
            String ID_Number = ipp.readLine();
            fw.write(ID_Number + "\n");
            System.out.print("Enter Address=");
            String Address = ipp.readLine();
            fw.write(Address + "\n");
            System.out.print("Enter Department=");
            String Department = ipp.readLine();
            fw.write(Department + "\n");
            System.out.print("Enter CGPA=");
            String CGPA = ipp.readLine();
            fw.write(CGPA + "\n");
            System.out.print("Enter Your Semester=");
            double Semester = ip.nextDouble();
            fw.write(Semester + "\n");
            System.out.print("Enter Active/Deactive Status=");
            String Status = ipp.readLine();
            fw.write(Status + "\n");
            System.out.println("ID has created Successfully");
            Number++;
            fw.close();
        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }
    }

    void Details() {
        try {
            File file = new File("E:\\Student_ID.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number=");
            String IDNUMBER = ipp.readLine();
            String ID_NUMBER = "";
            int match=0;
            while (sc.hasNextLine()) {

                String NAME = sc.nextLine();
                ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();

                if (ID_NUMBER.equalsIgnoreCase(IDNUMBER)) {
                    System.out.println("Name=" + NAME + "\nID=" + ID_NUMBER + "\nAddress=" + ADDRESS + "\nDepartment=" + DEPARTMENT + "" +
                            "\nCGPA=" + cGPA + "\nSemester=" + SEMESTER + "\nStatus=" + STATUS+"\n");
                    match=1+match;
                }
            }
            if(match<=0){
                System.out.println("ID not matched");
            }


        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }
    }

    int Holder() {
        try {
            File file = new File("E:\\Student_ID.txt");
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

        } catch (Exception ee) {
        }
        return Number;
    }

    void DeletAccount() throws IOException {
        String Full_Info="";
        try {
            File file = new File("E:\\Student_ID.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number Which ID do you want to delete=");
            String IDNUMBER = ipp.readLine();
            int match=0;
            while (sc.hasNextLine()) {
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();
                if(ID_NUMBER.equalsIgnoreCase(IDNUMBER)){
                    match++;
                }
                if (!(ID_NUMBER.equalsIgnoreCase(IDNUMBER))) {
                    Full_Info+=NAME+"\n"+ID_NUMBER+"\n"+ADDRESS+"\n"+DEPARTMENT+"\n"+cGPA+"\n"+SEMESTER+"\n"+STATUS+"\n";
                }
            }
           if(match<=0){
               System.out.println("ID Number not matched");
           }else {
               System.out.println("ID Delete Successfully");
           }
        }
        catch (Exception e) {}

        try {
            FileWriter fw=new FileWriter("E:\\Student_ID.txt");
            fw.write(Full_Info);
            fw.close();

        }catch (Exception e)
        {
            System.out.println("Problem="+e);
        }

    }
    void Replace(){
        String Full_Info="";
        try {
            File file = new File("E:\\Student_ID.txt");
            Scanner sc = new Scanner(file);
            System.out.print("Enter ID Number Which ID do you want to Replace=");
            String IDNUMBER = ipp.readLine();
            int match=0;
            while (sc.hasNextLine()) {
                String NAME = sc.nextLine();
                String ID_NUMBER = sc.nextLine();
                String ADDRESS = sc.nextLine();
                String DEPARTMENT = sc.nextLine();
                String cGPA = sc.nextLine();
                double SEMESTER = Double.parseDouble(sc.nextLine());
                String STATUS = sc.nextLine();
                if(ID_NUMBER.equalsIgnoreCase(IDNUMBER)){
                  match++;
                 }
                if (!(ID_NUMBER.equalsIgnoreCase(IDNUMBER))) {
                    Full_Info+=NAME+"\n"+ID_NUMBER+"\n"+ADDRESS+"\n"+DEPARTMENT+"\n"+cGPA+"\n"+SEMESTER+"\n"+STATUS+"\n";
                }
                else {
                    System.out.print("Write Your Name=");
                    String Namee=ipp.readLine();
                    System.out.print("Enter Your ID=");
                    String IDd=ipp.readLine();
                    System.out.print("Enter Address=");
                    String Addresss=ipp.readLine();
                    System.out.print("Your Department=");
                    String Departmentt=ipp.readLine();
                    System.out.print("Enter Your CGPA=");
                    String CGPAa=ipp.readLine();
                    System.out.print("Enter Your semester=");
                    double semesterr=ip.nextDouble();
                    System.out.print("Enter Your Active Status=");
                    String A_S=ipp.readLine();
                    Full_Info+=Namee+"\n"+IDd+"\n"+Addresss+"\n"+Departmentt+"\n"+CGPAa+"\n"+semesterr+"\n"+A_S+"\n";
                }

            }
            if(match<=0){
                System.out.println("ID Number not matched");
            }else {
                System.out.print(Full_Info);
                System.out.println("ID Replaces Successfully");
            }
        } catch (Exception e) {
            System.out.println("Problem=" + e);
        }
        try {
            FileWriter fw=new FileWriter("E:\\Student_ID.txt");
            fw.write(Full_Info);
            fw.close();

        }catch (Exception e)
        {
            //System.out.println("Problem="+e);
        }
    }
}