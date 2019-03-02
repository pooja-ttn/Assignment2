/*
Q5)
     Implement Bridge Design Pattern for Color and Shape such that Shape and Color can be combined together
     e.g BlueSquare, RedSquare, PinkTriangle etc.

 */


// Implementor
interface Shape {
    String getShape();
}

// Concrete Implementor
class Triangle1 implements Shape{

    @Override
    public String getShape() {
        return "Triangle";
    }
}

// Concrete Implementor
class Square implements Shape{

    @Override
    public String getShape() {
        return "Square";
    }
}

// Abstraction
abstract class Color {
    String type;
    Shape shape;
    public Color(String type, Shape  shape) {
        this.type = type;
        this.shape = shape;
    }


}

// Refined Abstraction
class Pink extends Color {

    public Pink(Shape shape) {
        super("Pink", shape);
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", shape=" + shape.getShape() ;
    }
}

// Refined Abstraction
class Red extends Color {

    public Red(Shape shape) {
        super("Red", shape);
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", shape=" + shape.getShape()
                ;
    }
}




// Refined Abstraction
class Blue extends Color {

    public Blue(Shape shape) {
        super("Blue", shape);
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                        ", shape=" + shape.getShape()
                        ;
    }
}




public class BridgeDesignPattern {

    public static void main(String[] args) {

        Pink pink = new Pink(new Triangle1());

        System.out.println(pink);
        Red red=new Red(new Square());
        System.out.println(red);

Blue blue=new Blue(new Square());
System.out.println(blue);
    }
    }

