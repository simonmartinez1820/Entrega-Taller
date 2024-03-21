package SkyBeings;

import EarthBeings.Bird;
import EarthBeings.Human;
import EarthBeings.LivingBeings;
import SkyBeings.Angel;
import SkyBeings.LivingBeingCreator;
import SkyBeings.SkyBeing;


public class Main {
    public static void main(String[] args) {


        LivingBeingCreator creator = new LivingBeingCreator();

        System.out.println("-----");

        Human human = (Human) creator.createSkyBeing("human");

        human.born();
        human.timeTravel();
        human.die();
        human.timeTravel();
        human.goToHeaven();
        human.communicate();



        System.out.println("-----");

        LivingBeings bird =  creator.createLivingBeings("bird");

        bird.born();
        bird.communicate();
        bird.move();
        bird.die();
        System.out.println("-----");

        LivingBeings bear = creator.createLivingBeings("bird");
        bear.communicate();
        bear.born();
        bear.move();


        System.out.println("-----");

        SkyBeings angel = creator.createSkyBeing("angel");
        angel.communicate();
        angel.changeDimension();
        angel.timeTravel();









    }
}