public class PassOB {
    public static void main(String[] args) {
        // overloading constructor with objects:

        test ob1 = new test(100,22);
        test ob2 = new test(100,22);
        test ob3 = new test(-1,-1);

        System.out.println("ob1==ob2: "+ob1.equal(ob2));
        System.out.println("ob1==ob3: "+ob1.equal(ob3));
    }
}

class test{
    int a,b;
    test(int i, int j){
        a=i;
        b=j;
    }
    boolean equal(test o){
        if(o.a==this.a && o.b==this.b){
            return true;
        }
        else{
            return false;
        }
    }
}