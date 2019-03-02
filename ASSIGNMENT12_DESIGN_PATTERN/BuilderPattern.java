/*Q4)
Implement Builder pattern to create a student object with more than 6 fields.*/

//Student class

class Student {
    String name;
    private int Class;
    private char section;
    private String stream;
    private String classTeacher;
    private String hobby;
    private boolean isSporty;
    private boolean hasTuition;


    Student (StudentFactory studentFactory){
        name=studentFactory.getName();
        Class=studentFactory.getClass1();
        section=studentFactory.getSection();
        stream=studentFactory.getStream();
        classTeacher=studentFactory.getClassTeacher();
        hobby=studentFactory.getHobby();
        isSporty=studentFactory.isSporty();
        hasTuition=studentFactory.isHasTuition();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getClass1() {
        return Class;
    }

    public void setClass(int aClass) {
        Class = aClass;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isSporty() {
        return isSporty;
    }

    public void setSporty(boolean sporty) {
        isSporty = sporty;
    }

    public boolean isHasTuition() {
        return hasTuition;
    }

    public void setHasTuition(boolean hasTuition) {
        this.hasTuition = hasTuition;
    }

    public String toString(){
        return "Student Details-\n"+"Name- "+this.name+"\nClass- "+this.Class+"\nClass Teacher- "+this.classTeacher+"\nStream- "+this.stream+"\nHobby- "+this.hobby+"\nTuition- "+this.hasTuition+"\nSporty- "+this.isSporty;
    }

}


//StudentFactory class


class StudentFactory{
    String name;
     int Class;
     char section;
     String stream;
     String classTeacher;
     String hobby;
     boolean isSporty;
     boolean hasTuition;




    public String getName() {
        return this.name;
    }

    public StudentFactory setName(String name) {
        this.name = name;
        return this;
    }


    public int getClass1() {
        return this.Class;
    }

    public StudentFactory setClass(int aClass) {
        Class = aClass;
        return this;

    }

    public char getSection() {
        return this.section;
    }

    public StudentFactory setSection(char section) {
        this.section = section;
        return this;

    }

    public String getStream() {
        return this.stream;
    }

    public StudentFactory setStream(String stream) {
        this.stream = stream;
        return this;

    }

    public String getClassTeacher() {
        return this.classTeacher;
    }

    public StudentFactory setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
        return this;

    }

    public String getHobby() {
        return this.hobby;
    }

    public StudentFactory setHobby(String hobby) {
        this.hobby = hobby;
        return this;

    }

    public boolean isSporty() {
        return this.isSporty;
    }

    public StudentFactory setSporty(boolean sporty) {
        isSporty = sporty;
        return this;
    }

    public boolean isHasTuition() {
        return this.hasTuition;
    }

    public StudentFactory setHasTuition(boolean hasTuition) {
        this.hasTuition = hasTuition;
        return this;

    }


    public Student build(){
        return new Student(this);
    }

        }

    public class BuilderPattern{
    public static void main(String[] args) {
        Student student=new StudentFactory().setName("Pooja").setClass(12).setSection('A').setStream("Science").setClassTeacher("Mrs Anita").setHasTuition(false).build();
   System.out.println(student);
    }
}
