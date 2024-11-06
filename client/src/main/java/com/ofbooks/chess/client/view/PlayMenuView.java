package com.ofbooks.chess.client;

import javax.swing.JPanel;

public class PlayMenuView extends View {
   
    public PlayMenuView(
        App app,
        int windowWidth,
        int windowHeight,
        int largeButtonWidth,
        int largeButtonHeight,
        int smallButtonWidth,
        int smallButtonHeight,
        ColorPallette colorPallette   
    ){
        this.panel = new JPanel();
        this.panel.setLayout(null);
        this.panel.setSize(windowWidth, windowHeight);
        this.panel.setBackground(colorPallette.getBackgroundColor());
        ButtonFactory buttonFactory = new ButtonFactory(
            largeButtonWidth,
            largeButtonHeight,
            colorPallette.getBackgroundColor(),
            colorPallette.getTextColor(),
            colorPallette.getBorderShadowColor(),
            colorPallette.getBorderDarkShadowColor(),
            colorPallette.getBorderHighlighColor(),
            colorPallette.getBorderLightHighlightColor()
        );
        Button playVsComputerButton = buttonFactory.createButton("VS COMPUTER", new PlayVsComputerButtonActionListener(app));
        Button playOnlineButton = buttonFactory.createButton("ONLINE", new PlayOnlineButtonActionListener(app));
        Button backButton = new Button(
            smallButtonWidth,
            smallButtonHeight,
            colorPallette.getBackgroundColor(),
            colorPallette.getTextColor(),
            colorPallette.getBorderShadowColor(),
            colorPallette.getBorderDarkShadowColor(),
            colorPallette.getBorderHighlighColor(),
            colorPallette.getBorderLightHighlightColor(),
            "BACK", 
            new MainMenuButtonActionListener(app)
        );
        playVsComputerButton.setBounds((windowWidth - largeButtonWidth)/2, 100, largeButtonWidth, largeButtonHeight);
        playOnlineButton.setBounds((windowWidth - largeButtonWidth)/2, 150 + largeButtonHeight, largeButtonWidth, largeButtonHeight);
        backButton.setBounds((windowWidth - largeButtonWidth)/2, 200 + 2 * largeButtonHeight, smallButtonWidth, smallButtonHeight);
        this.panel.add(playVsComputerButton);
        this.panel.add(playOnlineButton);
        this.panel.add(backButton);
    }
}