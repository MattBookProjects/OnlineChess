package com.ofbooks.chess.client;


public class Settings{

    private int windowWidth;
    private int windowHeight;
    private int largeButtonWidth;
    private int largeButtonHeight;
    private int smallButtonWidth;
    private int smallButtonHeight;
    private ColorPallette colorPallette;
    private int language;

    public Settings(
        int windowWidth, 
        int windowHeight, 
        int largeButtonWidth,
        int largeButtonHeight,
        int smallButtonWidth,
        int smallButtonHeight,
        ColorPallette colorPallette,
        int language
    ){
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.largeButtonWidth = largeButtonWidth;
        this.largeButtonHeight = largeButtonHeight;
        this.smallButtonWidth = smallButtonWidth;
        this.smallButtonHeight = smallButtonHeight;
        this.colorPallette = colorPallette;
        this.language = language;
        
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

    public int getSmallButtonWidth(){
        return this.smallButtonWidth;
    }

    public int getSmallButtonHeight(){
        return this.smallButtonHeight;
    }

    public ColorPallette getColorPallette(){
        return this.colorPallette;
    }

    public int getLanguage(){
        return this.language;
    }

}