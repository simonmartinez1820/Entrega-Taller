package EarthBeings;

public interface EarthBeing {
    default void move(){
        System.out.println("Generic being moving");
    }
    default void communicate(){
        System.out.println("generic being communicating");
    }
}
