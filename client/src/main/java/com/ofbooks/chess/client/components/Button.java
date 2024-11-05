package com.ofbooks.chess.client;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

public class Button extends JButton{

    public Button(
        int width, 
        int height, 
        Color backgroundColor, 
        Color textColor, 
        Color borderShadowColor, 
        Color borderDarkShadowColor, 
        Color borderHighlightColor,
        Color borderLightHighlightColor,
        String text,
        ActionListener actionListener
        ){
            super(text);
            this.setSize(width, height);
            this.setBackground(backgroundColor);
            this.setForeground(textColor);
            this.setBorder(
                new ButtonBorder(
                    borderShadowColor,
                    borderDarkShadowColor,
                    borderHighlightColor,
                    borderLightHighlightColor
                )
            );
            this.addActionListener(actionListener);
        }
}