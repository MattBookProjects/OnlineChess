package com.ofbooks.chess.client;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayButtonActionListener implements ActionListener{

    private App app;

    public PlayButtonActionListener(App app){
        this.app = app;
    }

    public void actionPerformed(ActionEvent e){
        this.app.play();
    }

}