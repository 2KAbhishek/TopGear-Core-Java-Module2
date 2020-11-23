class Manager extends Employee {
    String name, dept, desig;
    int basic;

    public Manager(String name, String dept, String desig, int basic) {
        super(name, dept, desig, basic);
    }

    public void calculateSalary() {
        System.out.println("Salary : " + super.basic * 10);
    }

}
