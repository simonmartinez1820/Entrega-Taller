package SkyBeings;

import EarthBeings.EarthBeing;

public interface SkyBeing extends EarthBeing {
    default void changeDimension(){
        System.out.println("changing dimension");
    }

    void timeTravel();
}
