public class FindArea {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        rect r = new rect(6,5);
        tri t = new tri(10 , 8);

        Figure figref;
        figref = r;
        System.out.println("Area is: "+figref.area());
        figref = t;
        System.out.println("Area is: "+figref.area());
        figref = f;
        System.out.println("Area is: "+figref.area());
    }
}
class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}
class rect extends Figure{
    rect(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area of Rectangle: ");
        return dim1*dim2;
    }
}
class tri extends Figure{
    tri(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area of Triangle: ");
        return 0.5*dim1*dim2;
    }
}