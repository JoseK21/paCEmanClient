package com.ce.paceman.actor;

import com.ce.paceman.PacmanActor;
import com.ce.paceman.PacmanGame;

/**
 * Initializer class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Initializer extends PacmanActor {

    public Initializer(PacmanGame game) {
        super(game);
    }

    @Override
    public void updateInitializing() {
        yield:
        while (true) {
            switch (instructionPointer) {
                case 0:
                    waitTime = System.currentTimeMillis();
                    instructionPointer = 1;
                case 1:
                    if (System.currentTimeMillis() - waitTime < 3000) {
                        break yield;
                    }
                    instructionPointer = 2;
                case 2:
                    game.setState(PacmanGame.State.OL_PRESENTS);
                    break yield;
            }
        }
    }
    
}
