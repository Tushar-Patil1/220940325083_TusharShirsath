
class Shape{
    void draw(){
        System.out.println("draw shape");
    }
    void erase(){
        System.out.println("erase shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("draw circle");
    }
    void erase(){
        System.out.println("erase circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("draw triangle");
    }
    void erase(){
        System.out.println("erase triangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("draw square");
    }
    void erase(){
        System.out.println("erase square");
    }
}


public class Q_3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.draw();
        shape.erase();

        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}
