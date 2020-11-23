# Exercises

1. Write a program to create a class Student with the following :

- attributes :
  StudentId, Name, contactNo, course,fees.
- methods :
  - i. constructor to populate the objects
  - ii. display function to display the details of the students
  - iii. return the coursefees
- task :
  Create 5 students and perform the following :
  - i. display the student details coursewise
  - ii. display the total fees of all the students

2. Define a class named Document that contains a member variable of type String named text that stores any textual content for the document. Create a method named toString that returns the text field and include a method to set this value.

   Next, define a class for Email that is derived from Document and includes member variables for the sender, recipient, and title of an email message.

   Implement appropriate accessor and mutator methods. [An accessor is a member function that accesses the contents of an object but does not modify that object; eg: int getX(return x;)A mutator is a member function that can modify an object void setX(int x){this.x=x;} ].

   The body of the email message should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.

3. Given a java class EmployeeMain, which accepts four parameters from the command line. Employee Name, dept, designation and basic salary.
   These inputs are passed to the object of a class called Employee through its constructor and these details are stored within instance variables of the class.

   There is a method called employeeDetails within Employee class, which prints the Name, dept and designation of the employee. Employee class is extended by two classes Manager and Clerk.

   Manager class contains a method called calculateSalary, where salary is calculated as 10 times basic. Similarly Clerk class contains a method called calculateSalary which calculates the salary as 3 times of basic.

   ```java
   class EmployeeMain {
       public static void main(String [] args) {
           String name = args[0];
           String dept = args[1];
           String desig = args[2];
           String basic = Integer.parseInt(args[3]);
           if(dept.equals("Mgr"))
               Manager x1 = new Manager(name,dept,desig,basic);
           else
               Clerk x1 = new Clerk(name,dept,desig,basic);

           x1.employeeDetails();
           x1.calculateSalary();
       }
   }
   ```

4. There is an animal class, which has the common characteristics of all animals. Dog, Horse, Cat are animals (sub-class).

   Each can shout, but each shout is different. Use polymorphism to create objects of it and using an animal variable, make each of the animals shout.

5. Develop a java class that has finalize method, which displays “Finalize method called”. Create another class, which creates objects of the previous class and it uses the same object reference for creating these objects.

   For example, if A1 is the class name, then the objects are created as Sensitivity: Internal & Restricted below:

   ```java
   A1 a = new A1();
   a = new A1();
   a = new A1();
   ```

   When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method is called
