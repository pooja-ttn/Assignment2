/*Q8) Implement proxy design for accessing Record of a student and allow the access only to Admin.
*/


class Student1{
    private String name;

    public Student1(String name) {
     this.name=name;
    }

    public String getName() {
        return name;
    }

void printDetail() {
    String name1 = "Pooja";
    int studentId = 10101;
    String course = "Btech";
System.out.println("Name- "+name1+"\nStudent Id- "+studentId+"\nCourse- "+course);
}
}


interface Accesable{

    void access();
}


class Admin implements Accesable{

   Student1 student1;
    public Admin(Student1 student1) {
        this.student1 = student1;
    }

    @Override
    public void access() {
        System.out.println("Access the data");
        student1.printDetail();

    }
}

class AdminProxy  extends Admin{

    public AdminProxy( Student1 student1) {
        super(student1);
    }

    @Override
    public void access() {
        if(!student1.getName().equals("Pooja")){
            System.out.println("You can't acces the data");
        }else {
            System.out.println("Access granted");
            super.access();
        }
    }
}

public class ProxyDesign {

        public static void main(String[] args) {
            System.out.println("When student is Pooja- \nOUTPUT-");
            Student1 student1=new Student1("Pooja");
            AdminProxy adminProxy=new AdminProxy(student1);
            adminProxy.access();
            System.out.println("\nWhen student is other than Pooja-\nOUTPUT-");
            Student1 student2=new Student1("Amit");
            AdminProxy adminProxy2=new AdminProxy(student2);
            adminProxy2.access();
        }
    }


