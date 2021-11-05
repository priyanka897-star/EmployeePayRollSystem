package emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
	private List<EmployeePayRollData> employeePayrollList;

    public EmployeePayRollService(List<EmployeePayRollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner console = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(console);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner console){
        System.out.println("Enter employee Id");
        int id = console.nextInt();
        console.nextLine();
        System.out.println("Enter employee name");
        String name = console.nextLine();
        System.out.println("Enter salary");
        double salary = console.nextDouble();
        employeePayrollList.add(new EmployeePayRollData(id, name, salary));
    }
    private void writeEmployeePayrollData(){
        System.out.println("Writing employee payroll to console\n" + employeePayrollList);
    }
}
	


