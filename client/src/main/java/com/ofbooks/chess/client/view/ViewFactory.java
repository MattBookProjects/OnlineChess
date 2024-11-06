package com.ofbooks.chess.client;


public class ViewFactory {

    private App app;
    private int windowWidth;
    private int windowHeight;
    private int largeButtonWidth;
    private int largeButtonHeight;
    private int smallButtonWidth;
    private int smallButtonHeight;
    private ColorPallette colorPallette;

    public ViewFactory(
        App app,
        int windowWidth, 
        int windowHeight,
        int largeButtonWidth,
        int largeButtonHeight,
        int smallButtonWidth,
        int smallButtonHeight,
        ColorPallette colorPallette
        ){
            this.app = app;
            this.windowWidth = windowWidth;
            this.windowHeight = windowHeight;
            this.largeButtonWidth = largeButtonWidth;
            this.largeButtonHeight = largeButtonHeight;
            this.smallButtonWidth = smallButtonWidth;
            this.smallButtonHeight = smallButtonHeight;
            this.colorPallette = colorPallette;
        }

    public View createMainMenuView(){
        return new MainMenuView(
            this.app,
            this.windowWidth,
            this.windowHeight,
            this.largeButtonWidth,
            this.largeButtonHeight,
            this.colorPallette
        );
    }

    public View createPlayMenuView(){
        return new PlayMenuView(
            this.app,
            this.windowWidth,
            this.windowHeight,
            this.largeButtonWidth,
            this.largeButtonHeight,
            this.smallButtonWidth,
            this.smallButtonHeight,
            this.colorPallette
        );
    }
}