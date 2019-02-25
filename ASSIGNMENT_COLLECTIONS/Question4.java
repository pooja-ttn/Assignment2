import com.sun.scenario.effect.impl.prism.PrTexture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*Q4)
    Write a program to sort Employee objects based on highest salary using Comparator.
    Employee class{ Double Age; Double Salary; String Name */
 public class Question4 implements Comparator<Employee> {

     @Override
    public int compare(Employee e1,Employee e2)
    {
        return -(e1.salary.compareTo(e2.salary));
    }

}

 class Employee {
     String name;
     Double age;
     Double salary;

     public Employee(String name, Double age, Double salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     public Employee() {
     }


     public static void main(String[] args) {


         ArrayList list = new ArrayList();
         list.add(new Employee("Pooja", 21.0, 20000.0));
         list.add(new Employee("Reena", 23.0, 30000.0));
         list.add(new Employee("Poonam", 22.0, 40000.0));
         list.add(new Employee("Raj", 21.0, 1000.0));

         System.out.println("Before Sorting - ");
         System.out.println(list);
         Collections.sort(list,new Question4() );
         System.out.println("\n\nAfter Sorting - ");
         System.out.println(list+"\n");


     }

     @Override

     public String toString()
     {
         return "\n"+this.name+" "+this.age+" "+this.salary;
     }

 }