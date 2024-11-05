package com.ofbooks.chess.client;



public class Builder {

    private int windowWidth;
    private int windowHeight;

    public Builder(){
        
    }

    public void setWindowSize(int width, int height){
        this.windowWidth = width;
        this.windowHeight = height;
    }

    public App build(){
        return new App(new Settings(this.windowWidth, this.windowHeight));
    }
}