package com.ofbooks.chess.client;


public class Settings{

    private int windowWidth;
    private int windowHeight;
    private int largeButtonWidth;
    private int largeButtonHeight;
    private ColorPallette colorPallette;

    public Settings(
        int windowWidth, 
        int windowHeight, 
        int largeButtonWidth,
        int largeButtonHeight,
        ColorPallette colorPallette
    ){
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.largeButtonWidth = largeButtonWidth;
        this.largeButtonHeight = largeButtonHeight;
        this.colorPallette = colorPallette;
        
    }

    public int getWindowWidth(){
        return this.windowWidth;
    }

    public int getWindowHeight(){
        return this.windowHeight;
    }

    public int getLargeButtonWidth(){
        return this.largeButtonWidth;
    }

    public int getLargeButtonHeight(){
        return this.largeButtonHeight;
    }

    public ColorPallette getColorPallette(){
        return this.colorPallette;
    }

}