public class Parrot implements Bird {

    int age;
    String name;

    public Parrot(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void fly() {
        System.out.println("Parrot Flies");
    }

    public void chirp() {
        System.out.println("Parrot Chirps");
    }


    public static void main(String[] args) {

        Parrot parrot = new Parrot(12, "Parrot1");
    
        Bird birdParrot = new Parrot(12, "birdParrot");

        //Zoo newZoo = new Zoo(new Parrot(12, "Parrot"));

        Zoo theZoo = new Zoo( new Lovebird(12, "Lovebird") );
    
        theZoo.zooBird.chirp();

    }

}

class Lovebird implements Bird {
    int age;
    String name;

    public Lovebird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void fly() {
        System.out.println("Lovebird flies");
    }

    public void chirp() {
        System.out.println("Lovebird chirps");
    }
}

class Zoo {
    
    Bird zooBird;

    public Zoo(Bird zooBird) {
        this.zooBird = zooBird;
    }
}
