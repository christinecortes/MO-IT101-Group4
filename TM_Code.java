import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        String empNum = input.nextLine();

        if (empNum.equals("001")) {
            System.out.println("Employee #: " + empNum);
            System.out.println("First Name: Manuel");
            System.out.println("Last Name: Garcia");
            System.out.println("Birthday: 10/11/1983");
            System.out.println("Address: Valero Carpark Building Valero Street 1227, Makati City");
            System.out.println("Phone Number: 966-860-270");
            System.out.println("Status: Regular");
            System.out.println("Position: Chief Executive Officer");
            System.out.println("Immediate Supervisor: N/A");
            System.out.println("SSS #: 44-4506057-3");
            System.out.println("Philhealth #: 820126853951");
            System.out.println("TIN #: 442-605-657-000");
            System.out.println("Pag-ibig #: 691295330870");
        } else if (empNum.equals("002")) {
            System.out.println("Employee #: " + empNum);
            System.out.println("First Name: Antonio");
            System.out.println("Last Name: Lim");
            System.out.println("Birthday: 06/19/1988");
            System.out.println("Address: San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite");
            System.out.println("Phone Number: 171-867-411");
            System.out.println("Status: Regular");
            System.out.println("Position: Chief Operating Officer");
            System.out.println("Immediate Supervisor: Garcia, Manuel III");
            System.out.println("SSS #: 52-2061274-9");
            System.out.println("Philhealth #: 331735646338");
            System.out.println("TIN #: 683-102-776-000");
            System.out.println("Pag-ibig #: 663904995411");
        } else if (empNum.equals("003")) {
            System.out.println("Employee #: " + empNum);
            System.out.println("First Name: Bianca Sofia");
            System.out.println("Last Name: Aquino");
            System.out.println("Birthday: 08/04/1989");
            System.out.println("Address: Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City");
            System.out.println("Phone Number: 966-889-370");
            System.out.println("Status: Regular");
            System.out.println("Position: Chief Finance Officer");
            System.out.println("Immediate Supervisor: Garcia, Manuel III");
            System.out.println("SSS #: 30-8870406-2");
            System.out.println("Philhealth #: 177451189665");
            System.out.println("TIN #: 971-711-280-000");
            System.out.println("Pag-ibig #: 171519773969");
        } else if (empNum.equals("004")) {
            System.out.println("Employee #: " + empNum);
            System.out.println("First Name: Isabella");
            System.out.println("Last Name: Reyes");
            System.out.println("Birthday: 06/16/1994");
            System.out.println("Address: 460 Solanda Street Intramuros 1000, Manila");
            System.out.println("Phone Number: 786-868-477");
            System.out.println("Status: Regular");
            System.out.println("Position: Chief Marketing Officer");
            System.out.println("Immediate Supervisor: Garcia, Manuel III");
            System.out.println("SSS #: 40-2511815-0");
            System.out.println("Philhealth #: 341911411254");
            System.out.println("TIN #: 876-809-437-000");
            System.out.println("Pag-ibig #: 416946776041");
        } else if (empNum.equals("005")) {
            System.out.println("Employee #: " + empNum);
            System.out.println("First Name: Eduard");
            System.out.println("Last Name: Hernandez");
            System.out.println("Birthday: 09/23/1989");
            System.out.println("Address: National Highway, Gingoog, Misamis Occidental");
            System.out.println("Phone Number: 088-861-012");
            System.out.println("Status: Regular");
            System.out.println("Position: IT Operations and Systems");
            System.out.println("Immediate Supervisor: Lim, Antonio");
            System.out.println("SSS #: 50-5577638-1");
            System.out.println("Philhealth #: 957436191812");
            System.out.println("TIN #: 031-702-374-000");
            System.out.println("Pag-ibig #: 952347222457");
        } else {
            System.out.println("No employee found with this number!");
        }
        input.close();
    }
}
