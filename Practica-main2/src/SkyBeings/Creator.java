package SkyBeings;

import EarthBeings.LivingBeings;

public interface Creator {

        LivingBeings createLivingBeings(String Being);
        SkyBeing createSkyBeing(String Being);


}
