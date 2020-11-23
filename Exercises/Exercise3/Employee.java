public class Employee {
    String name, dept, desig;
    int basic;

    public Employee(String name, String dept, String desig, int basic) {
        this.name = name;
        this.dept = dept;
        this.desig = desig;
        this.basic = basic;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getDesig() {
        return desig;
    }

    public int getBasic() {
        return basic;
    }

    public void employeeDetails() {
        System.out.println("Employee [Name - " + name + "; Dept - " + dept + ", Desig - " + desig + " ]");
    }

}
