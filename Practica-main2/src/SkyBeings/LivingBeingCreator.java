package SkyBeings;

import EarthBeings.Bear;
import EarthBeings.Bird;
import EarthBeings.Human;
import EarthBeings.LivingBeings;
import SkyBeings.Creator;

public class LivingBeingCreator implements Creator {


    @Override
    public LivingBeings createLivingBeings(String Being) {

        if(Being.equalsIgnoreCase("bird")){
            Bird bir = new Bird();
            return bir;

        }
        else if(Being.equalsIgnoreCase("bear")){
            return new Bear();

        }
        return null;


    }

    @Override
    public SkyBeings createSkyBeing(String Being) {
        if(Being.equalsIgnoreCase("angel")){
            return new SkyBeings();
        }
        else if(Being.equalsIgnoreCase("archangel")){
            return new SkyBeings();

        }
        else if(Being.equalsIgnoreCase("human")){

            return new Human();
        }
        return null;
    }


}
