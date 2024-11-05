package com.ofbooks.chess.client;
import javax.swing.JPanel;

public abstract class View {

    protected JPanel panel;

    public JPanel toJPanel(){
        return this.panel;
    }
}