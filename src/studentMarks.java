public class studentMarks {
    public static void main(String[] args) {

    }
}

class student1{
    private String name;
    private int RollNUM;
    private int prn;

    student1(String Name, int RollNum, int PRN){
        super(Name, RollNum, PRN);
    }

    void details(){

    }
    void marksheet(){

    }
}

class firstYear extends student1{

    firstYear(String Name, int RollNum, int PRN) {
        super(Name, RollNum, PRN);
    }
}
class secondYear extends student1{

    secondYear(String Name, int RollNum, int PRN) {
        super(Name, RollNum, PRN);
    }
}