
public class interface02 {
    public static void main(String[] args) {
        boolean f;

        admin ob = new admin();
        f = ob.giveMarks();
        ob.celebrate(f);
    }
}

interface faculty{
    boolean giveMarks();
}

interface student{
    void celebrate(boolean flag);
}

class admin implements faculty, student{
    int marks=0;
    public boolean giveMarks(){
        marks = (int) (Math.random()*(100-0));
        if (marks>=40)
            return true;
        else
            return false;
    }
    public void celebrate(boolean flag)
    {
        if(flag == true)
            System.out.println("Celebrate");
        else
            System.out.println("Cry");
    }

}

