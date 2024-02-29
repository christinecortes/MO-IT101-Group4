
package com.mmdc.jb.code;

import java.util.Scanner;


public class JBCode {

    public static void main(String[] args) {
 
        String lastName = "";
        String firstName = "";
        String birthday = "";
        String address = "";
        String phoneNum = "";
        String sssNum = "";
        String philhealthNum = "";
        String tinNum = "";
        String pagibigNum = "";
        String status = "";
        String position = "";
        String immediateSupervisor = "";
        int basicSalary = 0;
        int riceSubsidy = 0;
        int phoneAllowance = 0;
        int clothingAllowance = 0;
        int grossSemiMonthlyRate = 0;
        double hourlyRate = 0;
        
        Scanner eNumInput = new Scanner(System.in);
        System.out.print("Please enter the employee No.: ");
        int employeeNum = eNumInput.nextInt();

        if (employeeNum == 1){
                lastName = "Garcia";
                firstName = "Manuel III";
                birthday = "10/11/1983";
                address = "Valero Carpark Building Valero Street 1227, Makati City";
                phoneNum = "966-860-270";
                sssNum = "44-4506057-3";
                philhealthNum = "820126853951";
                tinNum = "442-605-657-000";
                pagibigNum = "691295330870";
                status = "Regular";
                position = "Chief Executive Officer";
                immediateSupervisor = "N/A";
                basicSalary = 90000;
                riceSubsidy = 1500;
                phoneAllowance = 2000;
                clothingAllowance = 1000;
                grossSemiMonthlyRate = basicSalary / 2;
                hourlyRate = basicSalary / 21 / 8f;
            }

            else if (employeeNum == 2){
                lastName = "Lim";
                firstName = "Antonio";
                birthday = "06/19/1988";
                address = "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite";
                phoneNum = "171-867-411";
                sssNum = "52-2061274-9";
                philhealthNum = "331735646338";
                tinNum = "683-102-776-000";
                pagibigNum = "663904995411";
                status = "Regular";
                position = "Chief Operating Officer";
                immediateSupervisor = "Garcia, Manuel III";
                basicSalary = 60000;
                riceSubsidy = 1500;
                phoneAllowance = 2000;
                clothingAllowance = 1000;
                grossSemiMonthlyRate = basicSalary / 2;
                hourlyRate = basicSalary / 21 / 8f;
            }
                
            else if (employeeNum == 3){
                lastName = "Aquino";
                firstName = "Bianca Sofia";
                birthday = "08/04/1989";
                address = "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City";
                phoneNum = "966-889-370";
                sssNum = "30-8870406-2";
                philhealthNum = "177451189665";
                tinNum = "971-711-280-000";
                pagibigNum = "171519773969";
                status = "Regular";
                position = "Chief Finance Officer";
                immediateSupervisor = "Garcia, Manuel III";
                basicSalary = 60000;
                riceSubsidy = 1500;
                phoneAllowance = 2000;
                clothingAllowance = 1000;
                grossSemiMonthlyRate = basicSalary / 2;
                hourlyRate = basicSalary / 21 / 8f;
            }
                
            else if (employeeNum == 4){
                lastName = "Reyes";
                firstName = "Isabella";
                birthday = "06/16/1994";
                address = "460 Solanda Street Intramuros 1000, Manila";
                phoneNum = "786-868-477";
                sssNum = "40-2511815-0";
                philhealthNum = "341911411254";
                tinNum = "876-809-437-000";
                pagibigNum = "416946776041";
                status = "Regular";
                position = "Chief Marketing Officer";
                immediateSupervisor = "Garcia, Manuel III";
                basicSalary = 60000;
                riceSubsidy = 1500;
                phoneAllowance = 2000;
                clothingAllowance = 1000;
                grossSemiMonthlyRate = basicSalary / 2;
                hourlyRate = basicSalary / 21 / 8f;
            }
                
            else if (employeeNum == 5){
                lastName = "Hernandez";
                firstName = "Eduard";
                birthday = "09/23/1989";
                address = "National Highway, Gingoog,  Misamis Occidental";
                phoneNum = "088-861-012";
                sssNum = "50-5577638-1";
                philhealthNum = "957436191812";
                tinNum = "031-702-374-000";
                pagibigNum = "952347222457";
                status = "Regular";
                position = "IT Operations and Systems";
                immediateSupervisor = "Lim, Antonio";
                basicSalary = 52670;
                riceSubsidy = 1500;
                phoneAllowance = 1000;
                clothingAllowance = 1000;
                grossSemiMonthlyRate = basicSalary / 2;
                hourlyRate = basicSalary / 21 / 8f;
            }

            else{
                System.out.println("Invalid Input!");
                System.exit(0);
                
        }
        
        System.out.println("======== Employee # " + employeeNum + " ========");
                System.out.println("Last Name: " + lastName);
                System.out.println("First Name: " + firstName);
                System.out.println("Birthday: " + birthday);
                System.out.println("Address: " + address);
                System.out.println("Phone Number: " + phoneNum);
                System.out.println("SSS Number: " + sssNum);
                System.out.println("PhilHealth Number: " + philhealthNum);
                System.out.println("TIN Number: " + tinNum);
                System.out.println("PAG-IBIG Number: " + pagibigNum);
                System.out.println("Status: " + status);
                System.out.println("Position: " + position);
                System.out.println("Immediate Supervisor: " + immediateSupervisor);
                System.out.println("Basic Salary: " + basicSalary);
                System.out.println("Rice Subsidy: " + riceSubsidy);
                System.out.println("Phone Allowance: " + phoneAllowance);
                System.out.println("Clothing Allowance: " + clothingAllowance);
                System.out.println("Gross Semi-monthly Rate: " + grossSemiMonthlyRate);
                System.out.println("Hourly Rate: " + hourlyRate);
                
                System.out.println();
        
        
        System.out.print("Time-in Hour: ");

            Scanner inputTimeIn = new Scanner(System.in);

                String strTimeInHour = inputTimeIn.nextLine(); 
                int timeInHour = Integer.parseInt(strTimeInHour);

        System.out.print("Time-out Hour: ");

            Scanner inputTimeOut = new Scanner(System.in);

                String strTimeOutHour = inputTimeOut.nextLine(); 
                int timeOutHour = Integer.parseInt(strTimeOutHour);

                int hoursWorked = timeOutHour - timeInHour;

        System.out.println("Hours Worked: " + hoursWorked);
        
        System.out.println();
        
        double regularHours = Math.min(hoursWorked, 9);
        double overtimeHours = Math.max(hoursWorked - 9, 0);

        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * (hourlyRate * 1.30);
        
        double grossSalary = regularPay + overtimePay;
        
        System.out.println("Regular Pay: " + regularPay);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
