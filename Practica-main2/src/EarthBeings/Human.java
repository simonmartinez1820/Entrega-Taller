package EarthBeings;

import SkyBeings.SkyBeing;
import SkyBeings.SkyBeings;

public class Human extends SkyBeings {


    public void move() {
        System.out.println("Human moving");
    }


    public void communicate() {
        System.out.println("human speaking");

    }
    public void changeDimension(){
        if (!isAlive()){
            System.out.println("changing Dimension");
        }
        else{
            System.out.println("Still alive, cant use sky abilities");
        }
    }


    @Override
    public void timeTravel() {
        if (isAlive()==false){
            System.out.println("Time Traveling");
        }
        else{
            System.out.println("Still alive, cant use sky abilities");
        }

    }
}
