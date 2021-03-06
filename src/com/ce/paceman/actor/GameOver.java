package com.ce.paceman.actor;


import com.ce.paceman.PacmanActor;
import com.ce.paceman.PacmanGame;

/**
 * GameOver class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class GameOver extends PacmanActor {
    
    public GameOver(PacmanGame game) {
        super(game);
    }

    @Override
    public void init() {
        x = 77;
        y = 160;
        loadFrames("/res/gameover.png");
    }
    
    @Override
    public void updateGameOver() {
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
                    game.returnToTitle();
                    break yield;
            }
        }
    }

    // broadcast messages
    
    @Override
    public void stateChanged() {
        visible = false;
        if (game.state == PacmanGame.State.GAME_OVER) {
            visible = true;
            instructionPointer = 0;
        }
    }
        
}
