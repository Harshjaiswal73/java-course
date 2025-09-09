class InnerEmployee {
    String Empname;
    double salary;
    int age;

    public void emplyeedetail(){
        System.out.println(this.Empname);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    public void emplyeedetail(String Empname){
        System.out.println(Empname);
    }
    public void emplyeedetail(double salary){
        System.out.println(salary);
    }
    public void emplyeedetail(int age){
        System.out.println(age);
    }
    
}
public class Employee {
    public static void main(String[] args) {
        InnerEmployee innerEmployee = new InnerEmployee();
        innerEmployee.Empname="Ravi";
        innerEmployee.age=35;
        innerEmployee.salary=50000;

        innerEmployee.emplyeedetail();
    }
}