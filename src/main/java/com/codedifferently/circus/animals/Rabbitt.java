package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Rabbitt extends AbstractAnimal {

    public Rabbitt(String name) {
        super(name);
    }


    @Override
    public void doTrick() {
        AnimalTricks tricks = AnimalTricks.WOBBLE;
        String msg = String.format("My name is %s and I am happy to %s ", name, tricks.toString());
        logger.info(msg);
    }
}