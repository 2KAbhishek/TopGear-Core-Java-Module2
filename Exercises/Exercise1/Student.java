public class Student {
    private String stuID, name, contact, course;
    private double fees;

    public Student(String stuID, String name, String contact, String course, double fees) {
        this.stuID = stuID;
        this.name = name;
        this.contact = contact;
        this.course = course;
        this.fees = fees;
    }

    public void display() {
        System.out.println("Student ID: " + stuID + "; Name: " + name + "; Course: " + course + "; Fees: " + fees
                + "; Contact No.: " + contact);
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

}
