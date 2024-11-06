package com.ofbooks.chess.client;

import javax.swing.JPanel;
import java.awt.Color;

public class MainMenuView extends View {

    public MainMenuView(
        App app,
        int windowWidth,
        int windowHeight,
        int buttonWidth,
        int buttonHeight,
        ColorPallette colorPallette,
        int language
    ){
        this.panel = new JPanel();
        this.panel.setLayout(null);
        this.panel.setSize(windowWidth, windowHeight);
        this.panel.setBackground(colorPallette.getBackgroundColor());
        ButtonFactory buttonFactory = new ButtonFactory(
            buttonWidth,
            buttonHeight,
            colorPallette.getBackgroundColor(),
            colorPallette.getTextColor(),
            colorPallette.getBorderShadowColor(),
            colorPallette.getBorderDarkShadowColor(),
            colorPallette.getBorderHighlighColor(),
            colorPallette.getBorderLightHighlightColor()
        );
        Button playButton = buttonFactory.createButton(Translator.NEW_GAME.translate(language), new PlayButtonActionListener(app));
        Button gameHistoryButton = buttonFactory.createButton(Translator.GAMES_PLAYED.translate(language), new GameHistoryButtonActionListener(app));
        playButton.setBounds((windowWidth - buttonWidth)/2, 100, buttonWidth, buttonHeight);
        gameHistoryButton.setBounds((windowWidth - buttonWidth)/2, 150 + buttonHeight, buttonWidth, buttonHeight);
        this.panel.add(playButton);
        this.panel.add(gameHistoryButton);
    }
}