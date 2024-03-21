package SkyBeings;

import EarthBeings.EarthBeing;
import EarthBeings.LivingBeings;

public class SkyBeings extends LivingBeings implements SkyBeing, EarthBeing {
    @java.lang.Override
    public void changeDimension() {
        SkyBeing.super.changeDimension();
    }

    @java.lang.Override
    public void timeTravel() {

    }

    protected void goToHeaven(){
        System.out.println("going to heaven");
    }

    protected void pray(){
        System.out.println("Being Praying");
    }
}
