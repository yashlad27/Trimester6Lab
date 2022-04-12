import java.util.*;

public class lab06 {
    public static void main(String[] args) {
        Scanner sq = new Scanner(System.in);
        System.out.println("Enter sides of Square: ");
        int SqArea = sq.nextInt();
        shapes square = new shapes(SqArea);

        Scanner cir = new Scanner(System.in);
        System.out.println("Enter Radius of circle: ");
        double CirArea = cir.nextDouble();
        shapes circle = new shapes(CirArea);

        Scanner rec = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int rectLen = rec.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int rectBre = rec.nextInt();
        shapes rectangle = new shapes(rectLen, rectBre);

        Scanner tri = new Scanner(System.in);
        System.out.println("Enter side of Triangle: ");
        double triSide = tri.nextDouble();
        System.out.println("Enter height of Triangle: ");
        double triHeight = tri.nextDouble();
        shapes triangle = new shapes(triSide, triHeight);

        square.areaOfSq(SqArea);
        circle.areaOfCircle(CirArea);
        rectangle.areaOfRectangle(rectLen, rectBre);
        triangle.areaOfTriangle(triSide, triHeight);
    }
}
class shapes{
    // dimensions of shapes
    private int side;
    private double radius;
    private int len;
    private int bre;
    private double base;
    private double height;

    shapes(int side){
        // side of square:
        this.side = side;
    }
    shapes(double radius){
        // radius of circle:
        this.radius = radius;
    }
    shapes(int len, int bre){
        // sides of rectangle:
        this.len = len;
        this.bre = bre;
    }
    shapes(double base, double height){
        // sides of triangle:
        this.base= base;
        this.height = height;
    }

    int areaOfSq(int SqArea){
        System.out.println("Area of Square is "+SqArea*SqArea);
        return -1;
    }

    double areaOfCircle(double cirArea){
        System.out.println("Area of Circle is "+3.14*cirArea*cirArea);
        return -1;
    }

    double areaOfRectangle(int rectLen, int rectBre){
        System.out.println("Area of Rectangle is "+rectBre*rectLen);
        return -1;
    }

    double areaOfTriangle(double triBase, double triheight){
        System.out.println("Area of Triangle is "+0.5*triBase*triheight);
        return -1;
    }
}