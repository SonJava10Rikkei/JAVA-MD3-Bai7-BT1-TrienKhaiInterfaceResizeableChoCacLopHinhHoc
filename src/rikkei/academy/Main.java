package rikkei.academy;

public class Main {

    public static void main(String[] args) {
        // Kiểm thử class Shape
//        System.out.println("----------SHAPE--------------");
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        //Kiểm thử class Circle
//        System.out.println("----------CIRCLE--------------");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        //Kiểm thử class RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//        //Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//
        System.out.println("------------------------Resizeable------------------------");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(5);
        System.out.println("------------------------Random thống số---------------------");
        for (Shape shape2 : shapes) {
            System.out.println(">> Thông số sau khi random % lần 1: ");
            System.out.println(shape2);
            double random = (int) (Math.random() * 100);
            System.out.println(">> Tỷ lệ % (percent) tăng lên là: " + random + " %");
            if (shape2 instanceof Circle) {
                Circle circle2 = (Circle) shape2;
                circle2.resize(random);
            }

            if (shape2 instanceof Rectangle) {
                Rectangle rectangle2 = (Rectangle) shape2;
                rectangle2.resize(random);
            }
            System.out.println("==> Kết quả tăng random % lần 2 : \n" + shape2);
            System.out.println("------------------------------------------------------------");


        }
    }
}