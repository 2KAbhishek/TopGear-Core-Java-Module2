public class EmployeeMain {
    public static void main(String[] args) {
        String name = args[0];
        String dept = args[1];
        String desig = args[2];
        int basic = Integer.parseInt(args[3]);
        if (desig.equals("Mgr")) {
            Manager man = new Manager(name, dept, desig, basic);
            man.employeeDetails();
            man.calculateSalary();
        } else {
            Clerk clk = new Clerk(name, dept, desig, basic);
            clk.employeeDetails();
            clk.calculateSalary();
        }

    }
}
