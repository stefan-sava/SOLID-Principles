public class Employee {
    private final double employeeID;
    private String name;
    private double salary;
    private String designation;

    public Employee(double employeeID, String name, double salary, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public double getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void updateSalary(int employeeID, int newSalary){
        if(employeeID == this.employeeID){
            this.salary = newSalary;
        }
        else throw new IllegalArgumentException("Invalid employee ID");
    }

}
