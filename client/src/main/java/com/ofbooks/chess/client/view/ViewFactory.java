package com.ofbooks.chess.client;


public class ViewFactory {

    private App app;
    private Settings settings;

    public ViewFactory(App app, Settings settings){
        this.app = app;
        this.settings = settings;
    }

    public View createMainMenuView(){
        return new MainMenuView(
            this.app,
            this.settings.getWindowWidth(),
            this.settings.getWindowHeight(),
            this.settings.getLargeButtonWidth(),
            this.settings.getLargeButtonHeight(),
            this.settings.getColorPallette(),
            this.settings.getLanguage()
        );
    }

    public View createPlayMenuView(){
        return new PlayMenuView(
            this.app,
            this.settings.getWindowWidth(),
            this.settings.getWindowHeight(),
            this.settings.getLargeButtonWidth(),
            this.settings.getLargeButtonHeight(),
            this.settings.getSmallButtonWidth(),
            this.settings.getSmallButtonHeight(),
            this.settings.getColorPallette()
        );
    }
}