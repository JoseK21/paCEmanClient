package com.ce.paceman.DTO;

public class GameStateDTO {
    int speed;
    int[][] insertion,matriz;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[][] getInsertion() {
        return insertion;
    }

    public void setInsertion(int[][] insertion) {
        this.insertion = insertion;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
