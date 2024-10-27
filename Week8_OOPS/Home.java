package Week8_OOPS;

public class Home {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.name="Billa";
        c1.color="ORange";
        c1.breed="Breed";
        Cat c2=new Cat("Billa2", "Black", "Breed2");

        c1.CallCat();
        c2.CallCat();
    }
}
