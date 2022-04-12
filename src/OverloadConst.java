public class OverloadConst {
    public static void main(String[] args) {

        // overloading constructor:
        box mybox1 = new box(10,20,25);
        box mybox2 = new box();
        box mycube = new box(23.33);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+vol);

        vol = mycube.volume();
        System.out.println("Volume of mycube is: "+vol);
    }
}

class box{
    double height, width, depth;
    box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width*height*depth;
    }
}

