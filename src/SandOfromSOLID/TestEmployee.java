public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(12, "Alex", 5000, "Programmer");
        EmployeePrinter.printEmployee(employee);
    }
}
