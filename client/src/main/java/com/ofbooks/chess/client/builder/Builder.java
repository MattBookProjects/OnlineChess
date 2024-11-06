package com.ofbooks.chess.client;



public class Builder {

    private int windowWidth;
    private int windowHeight;
    private int largeButtonWidth;
    private int largeButtonHeight;
    private int smallButtonWidth;
    private int smallButtonHeight;
    private ColorPallette colorPallette;
    private int language;

    public Builder(){
        
    }

    public void setWindowSize(int width, int height){
        this.windowWidth = width;
        this.windowHeight = height;
    }

    public void setColorPallette(ColorPallette colorPallette){
        this.colorPallette = colorPallette;
    }

    public void setLargeButtonSize(int width, int height){
        this.largeButtonWidth = width;
        this.largeButtonHeight = height;
    }

    public void setSmallButtonSize(int width, int height){
        this.smallButtonWidth = width;
        this.smallButtonHeight = height;
    }

    public void setLanguage(int language){
        this.language = language;
    }

    public App build(){
        return new App(
            new Settings(
                this.windowWidth, 
                this.windowHeight,
                this.largeButtonWidth,
                this.largeButtonHeight,
                this.smallButtonWidth,
                this.smallButtonHeight,
                this.colorPallette,
                this.language
            ));
    }
}