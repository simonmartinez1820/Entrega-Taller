package EarthBeings;

public abstract class LivingBeings implements EarthBeing{
    private boolean alive = false;

    public boolean isAlive() {
        return alive;
    }

    public void born(){
        System.out.println("Living being being born");
        this.alive = true;

    }
    public void die(){
        System.out.println("Being dying");
        this.alive = false;

    }

}
