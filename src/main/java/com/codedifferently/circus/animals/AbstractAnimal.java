package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;
import org.apache.log4j.Logger;

public abstract class AbstractAnimal {
    protected final static Logger logger = Logger.getLogger(AbstractAnimal.class);

    protected String name;
    private Integer energy;
    private AnimalTricks trickAction;

    public AbstractAnimal(String name){
        this.name = name;
        this.energy = 0;
        this.trickAction = AnimalTricks.STAND;
        String message = String.format("A new animal named %s was created", name);
        logger.info(message);
    }

    public void speak(){
        String msg = String.format("You have not taught %s how to speak", name);
        logger.info(msg);
    }

    public void doTrick(){
        String msg  =String.format("You will need to teach %s a trick first", name);
        logger.info(msg);
    }

}
