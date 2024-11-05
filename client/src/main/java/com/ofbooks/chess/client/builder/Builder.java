package com.ofbooks.chess.client;



public class Builder {

    private int windowWidth;
    private int windowHeight;
    private ColorPallette colorPallette;
    public Builder(){
        
    }

    public void setWindowSize(int width, int height){
        this.windowWidth = width;
        this.windowHeight = height;
    }

    public void setColorPallette(ColorPallette colorPallette){
        this.colorPallette = colorPallette;
    }

    public App build(){
        return new App(new Settings(this.windowWidth, this.windowHeight));
    }
}