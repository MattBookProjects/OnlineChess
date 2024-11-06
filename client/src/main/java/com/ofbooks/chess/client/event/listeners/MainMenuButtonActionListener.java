package com.ofbooks.chess.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuButtonActionListener implements ActionListener{
    
    private App app;

    public MainMenuButtonActionListener(App app){
        this.app = app;
    }

    public void actionPerformed(ActionEvent e){
        this.app.mainMenu();
    }
}