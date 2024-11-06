package com.ofbooks.chess.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayVsComputerButtonActionListener implements ActionListener {

    private App app;

    public PlayVsComputerButtonActionListener(App app){
        this.app = app;
    }

    public void actionPerformed(ActionEvent e){
        this.app.playVsComputer();
    }
}