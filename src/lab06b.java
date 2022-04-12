public class lab06b {
    public static void main(String[] args) {
        HillStations hs = new HillStations();
        shimla s = new shimla();
        manali m = new manali();
        mahabaleshwar mh = new mahabaleshwar();

        HillStations Hill;
        Hill = s;
        System.out.println(Hill.location());
        System.out.println(Hill.famousFor());

        Hill = m;
        System.out.println(Hill.location());
        System.out.println(Hill.famousFor());

        Hill = mh;
        System.out.println(Hill.location());
        System.out.println(Hill.famousFor());

    }
}

class HillStations{
    private String location;

    boolean location(){
        System.out.println("Location Of HillStation");
        return false;
    }
    boolean famousFor(){
        System.out.println("Famous for");
        return false;
    }
}

class shimla extends HillStations{
    boolean location(){
        System.out.println("Shimla is present in Himachal Pradesh");
        return false;
    }
    boolean famousFor(){
        System.out.println("Shimla is famous for its Pine and Oak forests.");
        return false;
    }
}

class manali extends HillStations{
    boolean location(){
        System.out.println("Manali is present in Himachal Pradesh");
        return false;
    }
    boolean famousFor(){
        System.out.println("Manali is known for Rohtang Pass.");
        return false;
    }
}

class mahabaleshwar extends HillStations{
    boolean location(){
        System.out.println("Mahabaleshwar is present in Maharashtra");
        return false;
    }
    boolean famousFor(){
        System.out.println("Mahabaleshwar is famous for it's Strawberries.");
        return false;
    }
}