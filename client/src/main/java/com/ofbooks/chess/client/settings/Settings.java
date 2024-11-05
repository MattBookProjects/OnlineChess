package com.ofbooks.chess.client;


public class Settings{

    private int windowWidth;
    private int windowHeight;

    public Settings(int windowWidth, int windowHeight){
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        
    }

    public int getWindowWidth(){
        return this.windowWidth;
    }

    public int getWindowHeight(){
        return this.windowHeight;
    }
}