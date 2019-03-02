/* Q2)Implement Factory Pattern to get the Polygon of differnt type.

*/

interface Polygon{

    void getSides();
}


class Quadrilateral implements Polygon{
    int sides=4;
    @Override
   public void getSides(){
        System.out.println("This is a Quadrilateral with sides-"+this.sides);

    }

}


class Triangle implements Polygon {
    int sides = 3;

    @Override
    public void getSides() {
        System.out.println("This is a Tringle with sides-" + this.sides);

    }

}

    class Pentagon implements Polygon {
        int sides = 5;

        @Override
        public void getSides() {
            System.out.println("This is a Pentagon with side-" + this.sides);

        }
    }


        class Hexagon implements Polygon{
            int sides=6;
            @Override
            public void getSides(){
                System.out.println("This is a Hexagon with side-"+this.sides);

            }

        }

class Heptagon implements Polygon{
    int sides=7;
    @Override
    public void getSides(){
        System.out.println("This is a Heptagon with side-"+this.sides);

    }

}
    class Shapes{
    Polygon polygon;

    public void setPolygon(Polygon polygon){
        this.polygon=polygon;
    }
    public Polygon getPolygon(){
        return polygon;
    }

    }


    class ShapesFactory {

        public static Shapes getShapeObject(String str) {
            Shapes shapes = new Shapes();
            switch (str) {
                case "Quadrilateral":
                    shapes.setPolygon(new Quadrilateral());
                    break;
                case "Triangle":
                    shapes.setPolygon(new Triangle());
                    break;
                case "Pentagon":
                    shapes.setPolygon(new Pentagon());
                    break;
                case "Hexagon":
                    shapes.setPolygon(new Hexagon());
                    break;
                case "Heptagon":
                    shapes.setPolygon(new Heptagon());
                    break;
                default:
                    System.out.println("Give only polygons!!!");
            }
        return shapes;
        }
    }

public class FactoryPattern {
    public static void main(String[] args) {


        Shapes shapes1=ShapesFactory.getShapeObject("Triangle");
        shapes1.getPolygon().getSides();

        Shapes shapes2=ShapesFactory.getShapeObject("Quadrilateral");
        shapes2.getPolygon().getSides();
        Shapes shapes3=ShapesFactory.getShapeObject("Pentagon");
        shapes3.getPolygon().getSides();

        Shapes shapes5=ShapesFactory.getShapeObject("Hexagon");
        shapes5.getPolygon().getSides();

        Shapes shapes4=ShapesFactory.getShapeObject("Heptagon");
        shapes4.getPolygon().getSides();


    }
}

