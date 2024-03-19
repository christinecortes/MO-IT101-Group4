# MotorPH Payroll Program

## Overview
The MotorPH Payroll Program is a Java application developed to facilitate employee payroll management for MotorPH. It enables employees to accurately calculate their monthly gross income, total benefits, total deductions, and net income by generating payslips based on user-inputted attendance data.

## Running the Program
1. Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk18-windows) (Java Development Kit)
2. Install an [IDE](https://medium.com/swlh/setting-up-an-ide-94677d12eaa9) (such as [Apache NetBeans](https://netbeans.apache.org/front/main/download/index.html))
3. Clone [this](https://github.com/christinecortes/MO-IT101-Group4) repository
4. Run the MotorPHPayrollProgram.java file

## Usage
1. Follow the prompts and input the required information, such as the employee number you want to calculate, the monthly work period, the number of days worked in the month, and the clock-in and clock-out times for each workday.
2. Generate a payslip to view the detailed breakdown of the employee's earnings for the month.

## Features
- Display employee list.
- Display employee details based on the inputted employee number.
- Calculate gross income based on hours worked, hourly rate, and overtime pay.
- Calculate total benefits including rice subsidy, phone allowance, and clothing allowance.
- Calculate mandatory government contributions including SSS, PhilHealth, and Pag-IBIG.
- Calculate the taxable income.
- Calculate the withholding tax based on the monthly income tax bracket.
- Calculate the net income after applying all contributions and tax.
- Generate detailed monthly payslips for employees.
- Option to calculate another employee’s salary.

## Limitations
- The program computes for a 1-month payslip.
- Work starts at 08:00 with a grace period of 10 minutes.
- The user is expected to input the correct cutoff dates for the work period, as these dates will appear on the payslip.
- The maximum number of working days in a month is 20 days.
- The fixed break time period from 12:00 to 13:00 will never be considered part of the working hours.
- Hours are only considered for hours worked per day; any excess minutes worked are disregarded.
- The maximum regular paid hours are 8 hours; exceeding this is considered overtime hours.
- The overtime rate is fixed at 125% of the hourly rate.
- The basic salary (fixed) is used to calculate SSS, PhilHealth, and Pag-ibig contributions.
