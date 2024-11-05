package com.ofbooks.chess.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameHistoryButtonActionListener implements ActionListener{

    private App app;

    public GameHistoryButtonActionListener(App app){
        this.app = app;
    }

    public void actionPerformed(ActionEvent e){
        this.app.gameHistory();
    }
}