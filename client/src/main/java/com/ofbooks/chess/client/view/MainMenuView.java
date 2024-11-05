package com.ofbooks.chess.client;

import javax.swing.JPanel;
import java.awt.Color;

public class MainMenuView extends View {

    public MainMenuView(
        int windowWidth,
        int windowHeight,
        int buttonWidth,
        int buttonHeight,
        ColorPallette colorPallette
    ){
        this.panel = new JPanel();
        this.panel.setSize(windowWidth, windowHeight);
        this.panel.setBackground(colorPallette.getBackgroundColor());
    }
}