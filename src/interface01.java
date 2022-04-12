interface shape{
    public void dimensions();
    public void area();
}

class rectangle implements shape{
    int l = 0, b = 0;

    @Override
    public void dimensions() {
        l=10;
        b=20;
    }

    @Override
    public void area() {
        System.out.println(l*b);
    }
}

public class interface01 {
    public static void main(String[] args) {
    rectangle rect1 = new rectangle();
    rect1.dimensions();
    rect1.area();
    }
}
