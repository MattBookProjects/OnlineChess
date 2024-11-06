package com.ofbooks.chess.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayOnlineButtonActionListener implements ActionListener {

    private App app;

    public PlayOnlineButtonActionListener(App app){
        this.app = app;
    }

    public void actionPerformed(ActionEvent e){
        this.app.playOnline();
    }
}