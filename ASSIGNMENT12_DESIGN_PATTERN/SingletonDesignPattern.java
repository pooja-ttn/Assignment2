/*
Q1) Implement Singleton Design Pattern on a dummy class.

*/

class Employee{
    String name;
    int id;
    private static Employee obj;
    private Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    static Employee getInstance(){
        if(obj==null){
            return new Employee("Pooja",12);
        }
        return obj;
    }

    public String toString(){
        return " "+"Name- "+this.name+" "+"Id- "+this.id;
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {
        System.out.println(Employee.getInstance());
    }

}
