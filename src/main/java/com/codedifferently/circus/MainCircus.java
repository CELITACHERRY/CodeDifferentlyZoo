package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Gorilla;
import com.codedifferently.circus.animals.Rabbitt;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        logger.warn("Let's get the show on the road!");
        Bear bearReference = new Bear("Brucey");
        animals.add(bearReference);

        Rabbitt rabbittReference = new Rabbitt("Randy");
        animals.add(rabbittReference);

        Gorilla gorillaReference = new Gorilla("Mitch");
        animals.add(gorillaReference);
        Gorilla gorillaReference1 = new Gorilla("Gus");
        animals.add(gorillaReference1);
        for(int i = 0; i < animals.size();i ++) {
                AbstractAnimal tempReference = animals.get(i);
                tempReference.doTrick();

        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
