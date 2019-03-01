/*
 Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and
 get the instance of the Class using constructor reference

 */

class Employee{

    String name;
    Integer age;
    String city;

    Employee(String name,Integer age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString()
    {
        return " "+this.name+" "+this.age+" "+this.city;
    }
}

interface EmployeeDetail{
    Employee myEmployee(String name,Integer age,String city);

}

public class Question4 {

    public static void main(String[] args) {
        EmployeeDetail emp = Employee::new;
        Employee obj=emp.myEmployee("Pooja",21,"Noida");
        EmployeeDetail emp1 = Employee::new;
        Employee obj1=emp1.myEmployee("Pawan",22,"Noida");
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }
}