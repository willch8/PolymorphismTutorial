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

        //Parrot reference      Parrot OBJECT
        Parrot parrot = new Parrot(12, "Parrot1");
    
        //Bird reference      Parrot OBJECT
        Bird birdParrot = new Parrot(12, "birdParrot");
        //This works because Parrot IS A Bird
        //We implemented the Bird interface in the Parrot Class

        //Zoo newZoo = new Zoo(new Parrot(12, "Parrot"));

        Zoo theZoo = new Zoo( new Lovebird(12, "Lovebird") );
        //The Zoo Bird reference can take either a Parrot OR a Lovebird
        //because they are both Birds. We implemented the Bird interface in
        //both classes
    
        //The behavior of this generic code changes depending on the object
        //of the Bird reference in the zoo object
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
