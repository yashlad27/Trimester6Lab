public class lab4A {
    public static void main(String[] args) {
        Piano P = new Piano();
        Flute F = new Flute();
        Guitar G = new Guitar();

        P.play();
        F.play();
        G.play();
    }
}

abstract class instrument{
    abstract void play();
}

class Piano extends instrument{
    void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}

class Flute extends instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot");
    }
}

class Guitar extends instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}