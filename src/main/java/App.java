import sweets.*;
import sweets.candy.*;
import sweets.chocolate.*;
import sweets.lollypop.*;
import sweets.jelly.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {


        ArrayList<Sweetnees> myList = new ArrayList<>();

        myList.add(new CandyChew());
        myList.add(new CandyChocoBar());
        myList.add(new CandyCoco());
        myList.add(new CandyRom());

        myList.add(new ChocolateCube());
        myList.add(new ChocolateEgg());

        myList.add(new JellyCola());
        myList.add(new JellyRandom());

        myList.add(new LollypopInStick());
        myList.add(new LollypopXXL());



        for (Sweetnees sw: myList) {
            System.out.println(sw);
        }




    }
}
