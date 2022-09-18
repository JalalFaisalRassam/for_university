public class exe1 {
    String employeeName="jalal";
    double salary=2000;
    double percent=0.10;

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;

    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void RaiseSalary(double percent) {
        this.salary = salary*percent;
    }
}
