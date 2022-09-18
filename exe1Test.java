public class exe1Test {
    public static void main(String[] args) {
        exe1 emp=new exe1();
        System.out.println(emp.getSalary());
        System.out.println(emp.getEmployeeName());
        emp.RaiseSalary(0.20);
        System.out.println(emp.getSalary());
    }
}
