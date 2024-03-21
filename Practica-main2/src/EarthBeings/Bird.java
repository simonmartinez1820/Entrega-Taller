package EarthBeings;

public class Bird extends LivingBeings{
    @Override
    public void move() {
        System.out.println("fly as a bird");
    }

    @Override
    public void communicate() {
        System.out.println("Bird Singing");

    }


    public void fly() {
        System.out.println("Bird flying");
    }
}
