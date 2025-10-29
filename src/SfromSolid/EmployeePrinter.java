public class EmployeePrinter {
    public static void printEmployee(Employee employee){
        System.out.println("Name: " + employee.getName() + " , Employee ID: " +
                employee.getEmployeeID() + " , Designation: "
                + employee.getDesignation());
    }
}
